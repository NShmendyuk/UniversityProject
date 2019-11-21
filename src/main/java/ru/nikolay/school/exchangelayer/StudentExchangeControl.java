package ru.nikolay.school.exchangelayer;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExchangeControl {
    ArrayList<StudentExchange> studentsExchange;
    public StudentExchangeControl() {
    }

    public void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add student\n" 
        + "2.Print students\n");
        Integer nextInt = sc.nextInt();
        if (nextInt == 1){
            System.out.println("Type name, surname, sex, age, main school of exchange student");
            String name = sc.next();
            String surname = sc.next();
            String sex = sc.next();
            Integer age = sc.nextInt();
            String mainSchool = sc.nextLine();
            studentsExchange.add(new StudentExchange(name,surname,sex,age,mainSchool));
            sc.close();
        }
        else if (nextInt == 2){
            for (StudentExchange s : studentsExchange) {
                System.out.println(s.getName() + " " + s.getSurname() + " " + s.getSex() + " " + s.getAge()
                        + " " + s.getNameGroup() + s.getMainSchool());
            }
        }

    }
    
}