package com.javaApi;

import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private List<Student> StudentList;

    public List<Student> getStudentList(){
        if (StudentList == null)
        {
            StudentList= new ArrayList<>();
        }
        return StudentList;
    }

    public void setStudentList(List<Student> StudentList){
        this.StudentList=StudentList;
    }
}
