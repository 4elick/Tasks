package com.company.util;

import com.company.service.Customer;

public class WriterImpl implements Writer{
    @Override
    public void writeDouble(double input) {
        System.out.println(input);
    }
    @Override
    public void writeString(String string){ System.out.println(string);}
    @Override
    public  void writeCustomer(Customer customer){ System.out.println("Customer's name: " + customer.name + " Credit card: "
    + customer.numOfCard);}
}
