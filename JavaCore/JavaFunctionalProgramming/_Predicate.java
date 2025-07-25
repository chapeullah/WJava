package JavaCore.JavaFunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+79153555297"));
        System.out.println(isPhoneNumberValid("89153555297"));
        System.out.println(isPhoneNumberValid("79153555297"));

        // Predicate
        System.out.println();
        System.out.println(isPhoneNumberValidPredicate.test("+79153555297"));
        System.out.println(isPhoneNumberValidPredicate.test("89153555297"));
        System.out.println(isPhoneNumberValid("79153555297"));

        System.out.println();
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+79152555297"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("+79152555297"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return (
            (phoneNumber.startsWith("+7") && phoneNumber.length() == 12) || 
            (phoneNumber.startsWith("8") && phoneNumber.length() == 11)
        );
    }

    static Predicate<String> isPhoneNumberValidPredicate = (phoneNumber) -> 
        (phoneNumber.startsWith("+7") && phoneNumber.length() == 12) || 
        (phoneNumber.startsWith("8") && phoneNumber.length() == 11);

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static BiPredicate<String, String> containsString = (phoneNumber, string) -> phoneNumber.contains(string);
}
