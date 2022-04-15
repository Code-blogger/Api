package com.javaApi;

import java.net.URI;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind
        .annotation.GetMapping;
import org.springframework.web.bind
        .annotation.PostMapping;
import org.springframework.web.bind
        .annotation.RequestBody;
import org.springframework.web.bind
        .annotation.RequestMapping;
import org.springframework.web.bind
        .annotation.RestController;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;

import com.javaApi.Student1;
import com.javaApi.demo;
import com.javaApi.Student;

@RestController
@RequestMapping(path="/Student1")
public class free {
    @Autowired
    private demo D1;
    @GetMapping(
            path="/";
            produces="application/json"
    )

    public Student1 getStudents(){
        return D1.getAllStudent();
    }

    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addStudent(
            @RequestBody Student std)
    {

        // Creating an ID of an employee
        // from the number of employees
        Integer id
                = D1
                .getAllStudent()
                .getStudentList()
                .size()
                + 1;



        D1.addStudent(std);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        std.getId())
                .toUri();
        return ResponseEntity.created(location)
                .build();
    }
}
}
