package com.sda.lambdas;

import com.sda.person.Person;

import java.util.function.Predicate;

/**
 * Class should have a method which tests if the person is an adult
 * Assume that adulthood begins at age 18
 * Implement the missing method
 */
public class AdultPersonTest implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getAge() < 18;
    }
}
