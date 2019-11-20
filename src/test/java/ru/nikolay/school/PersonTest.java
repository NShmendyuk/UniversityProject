package ru.nikolay.school;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {

    @Test
    public void setAge() {
        Person person = new Person("name", "surname", "sex", 24);
        try {
            person.setAge(Integer.parseInt("12.25"));
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertNotNull(e.getMessage());
        }

    }
}
