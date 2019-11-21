package ru.nikolay.school.subjectlayer;

import java.util.ArrayList;

public class Subject {
    String name;
    ArrayList<Integer> marks; //TODO: StudentSubject, SubjectMark;
    Integer attendance;
    public Subject(String name) {
        this.name = name;
        attendance = 0;
    }

    public String getName(){
        return name;
    }

    public void addMark(Integer mark){
        this.marks.add(mark);
    }

    public ArrayList<Integer> getMarks(){
        return marks;
    }

    public void addAttendance(){
        this.attendance = this.attendance + 1;
    }

    public Integer getAttendance(){
        return this.attendance;
    }
}