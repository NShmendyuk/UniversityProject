package ru.nikolay.school;

public class Person {
    private String name;
    private String surname;
    private String sex;
    private Integer age;

    /**
     * Конструктор с определенными значениями
     * 
     * @param name
     * @param surname
     * @param sex
     * @param age
     */
    Person(String name, String surname, String sex, Integer age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    /**
     * Возвращает имя
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Возвращает Фамилию
     * @return surname
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Возвращает пол
     * @return sex
     */
    public String getSex() {
        return this.sex;
    }

    /**
     * Возвращает возраст
     * @return age
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Поменять значение возраста
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Поменять фамилию
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}