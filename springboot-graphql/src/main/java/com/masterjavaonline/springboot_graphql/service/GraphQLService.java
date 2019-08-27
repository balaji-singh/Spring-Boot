package com.masterjavaonline.springboot_graphql.service;

import com.masterjavaonline.springboot_graphql.model.Employee;
import com.masterjavaonline.springboot_graphql.repository.EmployeeRepository;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

@Service
public class GraphQLService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Value("classpath:employee.graphql")
    Resource resource;

    private GraphQL graphQL;
    @Autowired
    private AllEmployeeDataFetcher allEmployeeDataFetcher;
    @Autowired
    private EmployeeDataFetcher employeeDataFetcher;

    // load schema at application start up
    @PostConstruct
    private void loadSchema() throws IOException {

        //Load Books into the Employee Repository
        loadDataIntoHSQL();

        // get the schema
        File schemaFile = resource.getFile();
        // parse schema
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();
    }

    private void loadDataIntoHSQL() {

        Stream.of(
                new Employee("1001", "Bala S Singh", "Permenent","IT", "1000000"),
                new Employee("1001", "Dragan", "Permenent","IT", "2000000"),
                new Employee("1001", "Vimal", "Contract","Accounts", "500000")
        ).forEach(employee -> {
            employeeRepository.save(employee);
        });
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("allEmployees", allEmployeeDataFetcher)
                        .dataFetcher("employee", employeeDataFetcher))
                .build();
    }


    public GraphQL getGraphQL() {
        return graphQL;
    }
}
