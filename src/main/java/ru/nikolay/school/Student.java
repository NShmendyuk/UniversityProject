package ru.nikolay.school;

import java.util.ArrayList;

import ru.nikolay.school.subjectlayer.Subject;
public class Student extends Person {
    private String nameGroup;
    private Integer rating;
    private ArrayList<Subject> subjects;

    /**
     * Конструктор с определенными значениями (Имя, фамилия, пол, возраст)
     * Устанавливает стандартное название группы = "none"
     * 
     * @param name
     * @param surname
     * @param sex
     * @param age
     */
    public Student(String name, String surname, String sex, Integer age) {
        super(name, surname, sex, age);
        this.nameGroup = "none";
    }

    /**
     * Возращает название группы
     * 
     * @return
     */
    public String getNameGroup() {
        return this.nameGroup;
    }

    /**
     * Поменять название группы
     * 
     * @param nameGroup
     */
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    /**
     * Установить значение рейтинга студента
     * 
     * @param rating
     */

    public void setRating(int rating) {
        this.rating = rating;
        if (rating < 0)
            throw new IllegalArgumentException();
    }

    public Integer getRating() {
        return this.rating;
    }

    /**
     * Возвращает предмет по названию
     * @param subjectName
     * @return
     */
    public Subject getSubject(String subjectName){
        Subject sub = null;
        for (int i = 0; i <= subjects.size(); i++){
            if (subjects.get(i).getName().equals(subjectName)) 
            sub = subjects.get(i);
        }
        return sub;
    }

    /**
     * Добавление Предмета для учащегося
     * @param subjectName
     */
    public void addSubject(String subjectName){
        Subject subject = new Subject(subjectName);
        this.subjects.add(subject);
    }
}
