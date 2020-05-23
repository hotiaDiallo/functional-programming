package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Aicha", Gender.FEMALE),
                new Person("Ibra", Gender.MALE),
                new Person("Fatima", Gender.FEMALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY)
        );

        people.stream()
                .map(person -> person.gender)
                .forEach(System.out::println);


        /*
        Function<Person, Gender> personGenderFunction = person -> person.gender;
        ToIntFunction<Gender> length = (ToIntFunction<Gender>) String::length;
        IntConsumer println = System.out::println;
        */

        people.stream()
                .map(person -> person.gender)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    static class Person{
        private String name;
        private Gender gender;

        public Person(String name,Gender gender) {
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
