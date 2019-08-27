package com.masterjavaonline.graphql.service;

import com.masterjavaonline.graphql.model.Student;
import com.masterjavaonline.graphql.repository.StudentRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
public class StudentService {
    private final GiphyService giphyService;
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository carRepository,GiphyService giphyService) {
        this.studentRepository = carRepository;
        this.giphyService= giphyService;
    }
    @GraphQLQuery(name = "students")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @GraphQLQuery(name = "student")
    public Optional<Student> getStudentById(@GraphQLArgument(name = "id") Long id){
        return studentRepository.findById(id);
    }
    @GraphQLQuery(name = "addStudent")
    public Student addStudent(@GraphQLArgument(name = "student") Student student){
        return studentRepository.save(student);
    }
    @GraphQLQuery(name = "deleteStudent")
    public void deleteCar(@GraphQLArgument(name = "id") Long id){
        studentRepository.deleteById(id);
    }


    @GraphQLQuery(name = "giphyUrl")
    public String getGiphyUrl(@GraphQLContext Student student) {
        return giphyService.getGiphyUrl(student.getName());
    }
}
