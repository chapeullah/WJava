package JavaCore.JavaFunctionalProgramming.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneValid(String phone) {
        return phone.startsWith("+7") || phone.startsWith("8");
    }

    public boolean isAdult(LocalDate birth) {
        return Period.between(birth, LocalDate.now()).getYears() >= 18;
    }

    public boolean isCustomerValid(Customer customer) {
        return 
            isEmailValid(customer.getEmail()) &&
            isPhoneValid(customer.getPhone()) &&
            isAdult(customer.getBirth());
    }
}
