package com.sda.streams;

import com.sda.person.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using streams obtain the following information:
 * - Is "Radu" a member of the list?
 * - Average age
 * - Order list by age
 */
public class StreamMain {

    public static void main(String[] args) {
        List<Person> persons = Person.createPersons();
        boolean isRadu = persons.stream().
                map(person -> person.getFullName()).
                anyMatch(name -> name.equals("Radu"));

        if (!isRadu) {
            System.out.println("Radu is not present");
        } else {
            System.out.println("Radu is present");
        }

        System.out.println("=======================================");

        int sum = persons.stream().map(person -> person.getAge()).reduce(0, (a, b) -> a + b);
        System.out.println("Age average is: " + (double) sum / persons.size());

        System.out.println("=======================================");

        List<Person> sortedPersons = persons.stream().
                sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        for(Person i : sortedPersons) {
            System.out.println(i.getFullName() + " " + i.getAge());
        }


    }
}
