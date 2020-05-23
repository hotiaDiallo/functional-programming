package com.ibrahima;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Aicha", Gender.FEMALE),
                new Person("Ibra", Gender.MALE),
                new Person("Fatima", Gender.FEMALE)
        );

        //Imperative Approch
        System.out.println("Imperative Approch");
        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females) {
            System.out.println(female);
        }

        //Declarative Approch
        System.out.println("Declarative Approch");
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        List<Person> female2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        female2.forEach(System.out::println);

        // Faire une comparaison

        List<Person> females3 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females3.forEach(System.out::println);
    }

    static class Person{
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
