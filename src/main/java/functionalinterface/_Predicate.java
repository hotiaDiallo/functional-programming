package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("0745265232"));
        System.out.println(isPhoneNumberValid("0645265232"));
        System.out.println("-------------------------------");
        System.out.println(isPhoneNumberValidPredicate.test("0612154265"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("06121542"));

        System.out.println("---------------------------------");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0612154265"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0612154263"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("06") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("06") && phoneNumber.length() == 10;
    }
}
