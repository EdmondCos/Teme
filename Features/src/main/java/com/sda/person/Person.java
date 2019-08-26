package com.sda.person;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String fullName;
    private int age;

    private Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> createPersons() {
        Person person1 = new Person("Ana", 22);
        Person person2 = new Person("Dan", 10);
        Person person3 = new Person("Vlad", 15);
        Person person4 = new Person("Radu", 28);
        Person person5 = new Person("Fabian", 39);

        return Arrays.asList(person1, person2, person3, person4, person5);
    }
}
