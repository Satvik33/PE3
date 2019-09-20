package com.stackroute;


public class Student {
    public String enterMarks(int stuGrades[], int numOfStudents) {
        try{

            for (int x : stuGrades) {

                if (x < 0 || x > 100) {
                    throw new Exception("Error!!!");

                }
            }
        }catch(Exception e){
            return "Error!!!";
        }
        return "no error";
    }
}
