package com.sda.lambdas;

import com.sda.person.Person;

import java.util.function.Function;

/**
 * Implement the missing method and make the functionaly of
 * growing older by a year
 */
public class PersonFunction implements Function<Person, Person> {

    @Override
    public Person apply(Person person) {
        int newAge = person.getAge() + 1;
        person.setAge(newAge);
        return null;
    }
}
