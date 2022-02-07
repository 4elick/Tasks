package com.company.action;

import com.company.service.Customer;
import com.company.util.Reader;
import com.company.util.ReaderImpl;
import com.company.util.Writer;
import com.company.util.WriterImpl;

import java.util.*;

public class Main {
    Writer writer = new WriterImpl();
    Reader reader = new ReaderImpl();
    Random random = new Random();

    public static void main(String[] args) {
        Main mainaction = new Main();
        mainaction.run();
    }

    public void run() {
        /*writer.writeString("Enter count Customers: ");
        int size = reader.readInt();*/
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            writer.writeString("enter name customer[" + i + "]");
            customers.add(new Customer(reader.read(), random.nextInt(10000)));
        }

        this.print(customers);

        Comparator<Customer> customerComparator
                = Comparator.comparing(Customer::getName);
        Collections.sort(customers, customerComparator);

        this.print(customers);

        writer.writeString("vvedite interval:");
        int v1 = reader.readInt();
        int v2 = reader.readInt();
        this.interval(customers, v1, v2);
    }

    public void interval(List<Customer> customers, int v1, int v2) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).numOfCard > v1 && customers.get(i).numOfCard < v2) {
                writer.writeCustomer(customers.get(i));
            }
        }
    }
    public void print(List<Customer> customers){
        for (int i = 0; i < 3; i++) {
            writer.writeCustomer(customers.get(i));
        }
    }

}
