package ru.nikolay.school;

import java.util.ArrayList;

public class Group {
    private String nameGroup;
    private ArrayList<Student> students;

    /**
     * Конструктор
     * 
     * @param nameGroup
     */
    Group(String nameGroup) {
        this.students = new ArrayList<Student>();
        this.nameGroup = nameGroup;
    }

    /**
     * Возращает имя группы
     * @return nameGroup
     */
    public String getNameGroup() {
        return nameGroup;
    }

    /**
     * Возращает список студентов
     * @return Arraylist<Student> students
     */
    public ArrayList<Student> getAllStudents() {
        return this.students;
    }

    /**
     * Добавляет студента в список
     * 
     * @param students
     */
    public void addStudent(Student... students) {
        for (Student s : students) {
            this.students.add(s);
        }
    }

    /**
     * Удаляет студента из списка
     * 
     * @param student
     */
    public void removeStudent(Student student) {
        this.students.remove(student);
    }
    
}