package com.company.service;

public class Customer {
    public int id;
    public String name;
    public String address;
    public int numOfCard;
    public int numOfBank;

    public Customer(String name, int numOfCard){
        this.name = name;
        this.numOfCard = numOfCard;
    }

    public String getName(){
        return name;
    }
}
