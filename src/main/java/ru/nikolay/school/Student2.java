package ru.nikolay.school;

public class Student2 extends Person {
    private String nameGroup;

    Student2(String name, String surname, String sex, Integer age) {
        super(name, surname, sex, age);
        this.nameGroup = "none";
    }

    public String getNameGroup2() {
        return this.nameGroup;
    }

    public void setNameGroup2(String nameGroup2) {
        this.nameGroup = nameGroup2;
    }
}
