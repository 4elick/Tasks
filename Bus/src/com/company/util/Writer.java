package com.company.util;
import com.company.service.Bus;
public interface Writer {
    void write(Bus bus);
    void writeDouble(double input);
    void writeString(String input);
}