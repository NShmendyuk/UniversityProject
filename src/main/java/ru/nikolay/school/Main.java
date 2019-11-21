package ru.nikolay.school;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nikolay
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputInt;
        Boolean flag = true;
        ArrayList<Student> allStudents = new ArrayList<Student>();
        ArrayList<Group> allGroups = new ArrayList<Group>();
        try {
            while (flag) {
                System.out.println("Choose option:\n" + "1.Create student\n" + "2.Create group\n"
                        + "3.Move student to group\n" + "4.Print all students\n" + "5.Print all groups\n"
                        + "6.Remove student from group\n" + "7.Change student's surname\n" + "8.Change student's age\n"
                        + "9.Set a rating to student\n" + "10.Show a student with high or low rating\n"
                        + "11.Control subjects" + "0.Exit");
                inputInt = sc.nextInt();
                switch (inputInt) {
                case 1: {
                    System.out.println("Write following options:" + "name, surname, sex, age");
                    String name = sc.next();
                    String surname = sc.next();
                    String sex = sc.next();
                    Integer age = Integer.parseInt(sc.next());
                    Student newStudent = new Student(name, surname, sex, age);
                    allStudents.add(newStudent);
                    break;
                }
                case 2: {
                    System.out.print("Write name of group: ");
                    String nameGroup = sc.next();
                    Group newGroup = new Group(nameGroup);
                    allGroups.add(newGroup);
                    break;
                }
                case 3: {
                    System.out.print("Write surname of student and " + "name of group: ");
                    String surname = sc.next();
                    String nameGroup = sc.next();
                    for (Student s : allStudents) {
                        if (s.getSurname().equals(surname)) {
                            for (Group g : allGroups) {
                                if (g.getNameGroup().equals(nameGroup)) {
                                    s.setNameGroup(g.getNameGroup());
                                    g.addStudent(s);
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    for (Student s : allStudents) {
                        System.out.println(s.getName() + " " + s.getSurname() + " " + s.getSex() + " " + s.getAge()
                                + " " + s.getNameGroup());
                    }
                    break;
                }
                case 5: {
                    for (Group g : allGroups) {
                        System.out.println(g.getNameGroup());
                    }
                    break;
                }
                case 6: {
                    if (allGroups.size() == 0) {
                        System.out.println("No one group exist");
                        break;
                    }
                    int groupNumber;
                    int studentNumber;
                    System.out.println("Choose group");
                    for (int i = 0; i < allGroups.size(); i++) {
                        System.out.println(i + " " + allGroups.get(i).getNameGroup());
                    }
                    groupNumber = sc.nextInt();
                    if (allGroups.get(groupNumber).getAllStudents().size() == 0) {
                        System.out.println("No one student in this group");
                        break;
                    }
                    System.out.println("Choose student");
                    for (int i = 0; i < allGroups.get(groupNumber).getAllStudents().size(); i++) {
                        System.out.println(i + " " + allGroups.get(groupNumber).getAllStudents().get(i).getSurname());
                    }
                    studentNumber = sc.nextInt();
                    allGroups.get(groupNumber).getAllStudents().get(studentNumber).setNameGroup("none");
                    allGroups.get(groupNumber)
                            .removeStudent(allGroups.get(groupNumber).getAllStudents().get(studentNumber));
                    break;
                }
                case 7: {
                    if (allStudents.isEmpty()) {
                        System.out.println("No one student in list");
                        break;
                    }
                    int studentNumber;
                    for (int i = 0; i < allStudents.size(); i++) {
                        System.out.println("Choose student");
                        System.out.println(i + " " + allStudents.get(i).getSurname());
                    }
                    studentNumber = sc.nextInt();
                    if (studentNumber < 0 || studentNumber >= allStudents.size()) {
                        System.out.println("Incorrect number");
                        break;
                    }
                    System.out.println("Write new surname for " + allStudents.get(studentNumber).getSurname());
                    String newSurname = sc.next();
                    allStudents.get(studentNumber).setSurname(newSurname);
                    break;
                }
                case 8: {
                    if (allStudents.isEmpty()) {
                        System.out.println("No one student in list");
                        break;
                    }
                    int studentNumber;
                    System.out.println("Choose student");
                    for (int i = 0; i < allStudents.size(); i++) {
                        System.out.println(i + " " + allStudents.get(i).getSurname());
                    }
                    studentNumber = sc.nextInt();
                    if (studentNumber < 0 || studentNumber >= allStudents.size()) {
                        System.out.println("Incorrect number");
                        break;
                    }
                    System.out.println("Write new age for " + allStudents.get(studentNumber).getSurname());
                    Integer newAge = sc.nextInt();
                    allStudents.get(studentNumber).setAge(newAge);
                    break;
                }
                case 9: {
                    System.out.println("Choose group");
                    for (int i = 0; i < allGroups.size(); i++) {
                        System.out.println(i + " " + allGroups.get(i).getNameGroup());
                    }
                    int chosingGroup = sc.nextInt();
                    System.out.println("Choose student");
                    for (int i = 0; i < allGroups.get(chosingGroup).getAllStudents().size(); i++) {
                        System.out.println(allGroups.get(chosingGroup).getAllStudents().get(i).getName()
                                + allGroups.get(chosingGroup).getAllStudents().get(i).getSurname());
                        int chosingStudent = sc.nextInt();
                        System.out.println("Type a new value of rating");
                        int rating = sc.nextInt();
                        allGroups.get(chosingGroup).getAllStudents().get(chosingStudent).setRating(rating);
                    }
                    break;
                }
                case 10: {
                    System.out.println("Choose group");
                    for (int i = 0; i < allGroups.size(); i++) {
                        System.out.println(i + " " + allGroups.get(i).getNameGroup());
                    }
                    int chosingGroup = sc.nextInt();
                    System.out.println("1.The best student\n2.The worst student ");
                    int chosing = sc.nextInt();
                    if (chosing == 1)
                        System.out.println(allGroups.get(chosingGroup).bestStudent().getName());
                    else if (chosing == 2)
                        System.out.println(allGroups.get(chosingGroup).worstStudent().getName());
                    else
                        System.out.println("Wrong number!!!");
                    break;
                }
                case 11: {
                    System.out.println("Choose student");
                    for (int i = 0; i < allStudents.size(); i++) {
                        System.out.println(i + " " + allStudents.get(i).getName());
                    }
                    Integer studentNumber = sc.nextInt();
                    System.out.println("Type subject name");
                    String inputStr = sc.next();
                    if (allStudents.get(studentNumber).getSubject(inputStr).getName() == inputStr){
                        System.out.println("Subject " + allStudents.get(studentNumber).getSubject(inputStr) + " chosed");
                        System.out.println("1.Add mark\n"
                        + "2.get mark");
                        inputInt = sc.nextInt();
                        if (inputInt == 1){
                            System.out.println("Type mark");
                            inputInt = sc.nextInt();
                            allStudents.get(studentNumber).getSubject(inputStr).addMark(inputInt);
                        }
                        else {
                            System.out.println(allStudents.get(studentNumber).getSubject(inputStr).getMarks());
                        }
                    }
                    else{
                        allStudents.get(studentNumber).addSubject(inputStr);
                        System.out.println("Subject added");
                    }
                    break;
                }
                case 0: {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Input is incorrect - try again");
                    break;
                }
                }
            }
        } finally {
            sc.close();
        }
    }
}