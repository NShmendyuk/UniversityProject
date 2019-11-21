package ru.nikolay.school.exchangelayer;

import ru.nikolay.school.Student;

public class StudentExchange extends Student{
    String mainSchool;

    StudentExchange(String name, String surname, String sex, Integer age, String mainSchool) {
        super(name, surname, sex, age);
        this.mainSchool = mainSchool;
    }

    public String getMainSchool(){
        return mainSchool;
    }
    
}