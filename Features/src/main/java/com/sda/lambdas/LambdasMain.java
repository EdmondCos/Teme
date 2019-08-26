package com.sda.lambdas;

import com.sda.person.Person;

import java.util.List;
import java.util.function.Predicate;

import static com.sda.person.Person.createPersons;

/**
 * Create a predicate to test if the person is an adult
 * use the 2 ways and compare them
 *
 * @see AdultPersonTest
 * <p>
 * <p>
 * Create a function that make a person older by an year
 * @see PersonFunction
 */
public class LambdasMain {

    public static void main(String[] args) {
        List<Person> persons = createPersons();

        Predicate<Person> isMajor = age -> age.getAge() < 18;
//isMajor.test(i) = pentru fiecare persoana i, se verifica daca varsta <18.
//Daca <18 => boolean true || Daca >18 => boolean false
        for (Person i : persons) {
            if (isMajor.test(i)) {
                System.out.println(i.getFullName() + " is minor");
            } else {
                System.out.println(i.getFullName() + " is major");
            }
        }


        for (Person i : persons) {

            PersonFunction personFunction = new PersonFunction();
            personFunction.apply(i);
            System.out.println(i.getAge());
//            Nu ma prind cum sa aplic lambda pt metoda de crestere in varsta.
        }
    }
}
