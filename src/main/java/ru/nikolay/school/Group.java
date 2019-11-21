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
     * 
     * @return nameGroup
     */
    public String getNameGroup() {
        return nameGroup;
    }

    /**
     * Возращает список студентов
     * 
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

    /**
     * Возращает одного из студентов с наилучшим значением рейтинга из группы
     * 
     * @return Student
     */
    public Student bestStudent() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getRating() >= best.getRating())
                best = s;
        }
        return best;
    }

    /**
     * Возращает одного из студентов с наименьшим значением рейтинга из группы
     * 
     * @return
     */
    public Student worstStudent() {
        Student worst = students.get(0);
        for (Student s : students) {
            if (s.getRating() < worst.getRating())
                worst = s;
        }
        return worst;
    }

}