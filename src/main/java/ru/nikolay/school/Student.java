package ru.nikolay.school;

public class Student extends Person {
    private String nameGroup;
    private Integer rating;

    /**
     * Конструктор с определенными значениями (Имя, фамилия, пол, возраст)
     * Устанавливает стандартное название группы = "none"
     * 
     * @param name
     * @param surname
     * @param sex
     * @param age
     */
    Student(String name, String surname, String sex, Integer age) {
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
}
