package com.company.util;

import com.company.service.Bus;

public class WriterImpl implements Writer{

    @Override
    public void write(Bus bus) {
        System.out.println("Route number: " + bus.routeNum + " " + "year of commencement of operation: " + bus.numBeginning +
                " " + "Mileage: " + bus.countRange);
    }

    @Override
    public void writeDouble(double input) {
        System.out.println(input);
    }
    @Override
    public void writeString(String string){ System.out.println(string);}
}

