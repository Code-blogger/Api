package com.javaApi;

import com.Super2;
import org.springframework
        .stereotype
        .Repository;
import com.javaApi.Student1;

import java.util.ArrayList;

public class demo {
    private static Student1 list=new Student1();
    static ArrayList<String> S=new ArrayList<String>(10);


    static ArrayList<String> hi1 (){
        S.clear();
        S.add("A");
        S.add("1");
        S.add("4");
        S.add("R");
        return S;
    }
    static ArrayList<String> hi2 (){
        S.clear();
        S.add("2");
        S.add("4");
        S.add("5");
        S.add("92");
        return S;
    }
    static ArrayList<String> hi3 (){
        S.clear();
        S.add("A");
        S.add("ABCD");
        S.add("DOE");
        return S;
    }



    static {
        list.getStudentList().add(new Student(
                hi1()
        ));

        list.getStudentList().add(new Student(
                hi2()
        ));

        list.getStudentList().add(new Student(
                hi3()
        ));
    }
    public Student1 getAllStudent(){
        return list;
    }

    public void addStudent(Student std){
        list.getStudentList().add(std);
    }
}
