package com.company.util;

import com.company.service.Customer;

public interface Writer {
    void writeDouble(double input);
    void writeString(String input);
    void writeCustomer(Customer customer);
}
