package JavaCore.JavaFunctionalProgramming.CombinatorPattern;

import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {
    
    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? 
            ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }
    
    
}

enum ValidationResult {
    SUCCESS,
    PHONE_NOT_VALID,
    EMAIL_NOT_VALID,
    IS_NOT_AN_ADULT
}