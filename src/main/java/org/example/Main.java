package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Queue<String> customer = new LinkedList<>();

    customer.offer("Alice");
    customer.offer("Bob");
    customer.offer("Charlie");
    customer.offer("David");

        System.out.println("The queue is: " + customer);

        String customer1 = customer.peek();
        System.out.println("The person at the front is: "+ customer1);

        String removeCustomer1 = customer.remove();
        System.out.println("After removing one person, the queue is: " + customer);

        String removeCustomer2 = customer.remove();
        System.out.println("After removing another person, the queue is: " + customer);

//        int sizeCustomer = customer.size();
        System.out.println("The current size of the queue is: " + customer.size());

//        boolean emptyCustomer = customer.isEmpty();
        System.out.println("Is the customer empty?: " + customer.isEmpty());

    }
}