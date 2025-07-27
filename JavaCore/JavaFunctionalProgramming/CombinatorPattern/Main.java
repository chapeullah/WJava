package JavaCore.JavaFunctionalProgramming.CombinatorPattern;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers =  List.of(
            new Customer(
                "Alice", 
                "alice@gmail.com", 
                "89153555297", 
                LocalDate.of(2002, 8, 15)
            ),
            new Customer(
                "Denis", 
                "denis@gmail.com", 
                "+79153555297", 
                LocalDate.of(2010, 1, 25)
            ),
            new Customer(
                "Alex", 
                "denisgmail.com", 
                "+79153555297", 
                LocalDate.of(2000, 12, 12)
            ),
            new Customer(
                "Dima", 
                "dima@gmail.com", 
                "+79153555297", 
                LocalDate.of(2000, 8, 15)
            )
        );
        CustomerValidatorService validatorService = new CustomerValidatorService();
        for (Customer customer : customers) {
            System.out.println("Customer " + customer.getName() + " validation = " + validatorService.isCustomerValid(customer));
        }
    }
}
