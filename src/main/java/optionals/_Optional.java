package optionals;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
//        Object value = Optional.ofNullable("Hello")
//                .orElseGet(() -> "default value");

//        Supplier<IllegalArgumentException> exception = ()
//                -> new IllegalArgumentException("Exception");
//        Object value = Optional.ofNullable("Hello")
//                .orElseThrow(exception);

//        Optional.ofNullable("email@email.com")
//                .ifPresentOrElse(
//                        email-> System.out.println("Sending email to " + email),
//                        ()-> System.out.println("Cannot send email"));


        Person person = new Person("ibrahima", "null");
//        String email = person
//                .getEmail()
//                .map(String::toUpperCase)
//                .orElse("email not provided");
//        System.out.println(email);

        if (person.getEmail().isPresent()){
            System.out.println(person.getEmail().get());
        }else {
            System.out.println("email not provided");
        }
    }

    static class Person{
        private final String name;
        private final String email;


        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}