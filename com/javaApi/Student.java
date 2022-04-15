package com.javaApi;
import java.lang.*;
import java.util.ArrayList;

public class Student {
    private boolean status;
    private String name;
    private int dob;
    private String email;
    private String roll_number;
    private ArrayList<Integer> arr=new ArrayList<Integer>(10);
    private ArrayList<String> alist= new ArrayList<String>(10);

    public Student(){}

    public Student(ArrayList<String> result ){
        super();
        this.status=true;
        this.name="john_doe_";
        this.dob=17091999;
        this.email="john@xyz.com";
        this.roll_number="ABCD123";
        for (int i = 0; i < result.size(); i++) {

            if (isNumeric(result.get(i))) {
                arr.add(Integer.parseInt(result.get(i)));
            }
            else {
                alist.add(result.get(i));
            }
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "is_success :" + status+
                ",user_id : "+name +dob+
                ",email :"+email+
                ",roll_number :" + roll_number+
                "numbers :"+ arr+
                ",alphabets :"+ alist;
    }
}
