package ru.nikolay.school.subjectlayer;

import java.util.ArrayList;

public class Subject {
    String name;
    ArrayList<Integer> marks; //TODO: StudentSubject, SubjectMark;
    public Subject(String name) {
        this.name = name;
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
}