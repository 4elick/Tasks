package com.company.service;

public class Bus {
    public int routeNum;
    public int busNum;
    public String nameDriver;
    public String brandBus;
    public int numBeginning;
    public double countRange;

    public Bus(int routeNum,int numBeginning, double countRange){
        this.routeNum = routeNum;
        this.numBeginning = numBeginning;
        this.countRange = countRange;
    }


}
