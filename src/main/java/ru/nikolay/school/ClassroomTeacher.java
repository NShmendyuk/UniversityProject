package ru.nikolay.school;

public class ClassroomTeacher extends Person {
    Integer salary;
    ClassroomTeacher(String name, String surname, String sex, Integer age, Integer salary) {
     super(name, surname, sex, age);
     this.salary = salary;    
    }
    
    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public Integer getSalary(){
        return this.salary;
    }
}