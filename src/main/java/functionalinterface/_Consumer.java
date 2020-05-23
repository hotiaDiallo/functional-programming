package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @FunctionalInterface
 * public interface Consumer<T>
 * Represents an operation that accepts a single input argument and returns no result
 */
public class _Consumer {
    public static void main(String[] args) {
        Customer jonh = new Customer("Jonh", "88888");
        greetCustomer(jonh);

        greetCustomerConsumer.accept(jonh);
        greetCustomerConsumerV2.accept(jonh, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) -> {
                System.out.println("Hello " + customer.name + ",your number : "
                        + (showPhoneNumber ? customer.phoneNumber : "*****"));
            };

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " +customer.name+ ",your number : "+ customer.phoneNumber );

    static void greetCustomer(Customer customer){
        System.out.println("Hello " +customer.name+ ",your number : "+ customer.phoneNumber );
    }

    static class Customer{
        private final String name;
        private final String phoneNumber;


        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
