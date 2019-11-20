package ru.nikolay.school;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void getNameGroup() {
        Student student = new Student("Elon", "Musk", "man", 48);
        student.setNameGroup("Cosmos");
        String actual = student.getNameGroup();
        String expected = "Cosmos";
        assertEquals(expected, actual);
    }

}