package com.masterjavaonline.graphql.model;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {

    @Id @GeneratedValue
    @GraphQLQuery(name = "id", description = "A Student's id")
    private Long id;
    @GraphQLQuery(name = "name", description = "A Student's Name")
    private String name;

}
