package JavaCore.JavaFunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * CONSUMER
 */

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "+7(987)654-32-10");
        Customer denis = new Customer("Denis", "+7(912)500-35-35");

        // Normal java func
        greetCustomer(maria);

        // Consumer 
        greetCustomerConsumer.accept(denis);

        // BiConsumer 
        greatCustomerConsumerV2.accept(denis, false);
    }

    static BiConsumer<Customer, Boolean> greatCustomerConsumerV2 = 
        (customer, showPhone) -> System.out.println("Hello, " + customer.name + 
        "! Thanks for registering number " + ((showPhone) ? customer.phoneNumber : "+7(***)***-**-**"));

    static Consumer<Customer> greetCustomerConsumer = customer -> 
        System.out.println(
            "Hello, " + customer.name + "! Thanks for registering number " + 
            customer.phoneNumber
        );

    static void greetCustomer(Customer customer) {
        System.out.println(
            "Hello, " + customer.name + "! Thanks for registering number " + 
            customer.phoneNumber
        );
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
