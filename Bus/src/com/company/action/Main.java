package com.company.action;
import com.company.service.Bus;
import com.company.util.Reader;
import com.company.util.ReaderImpl;
import com.company.util.Writer;
import com.company.util.WriterImpl;

import java.util.Random;

public class Main {
    Random rand = new Random();
    Writer writer = new WriterImpl();
    Reader reader = new ReaderImpl();

    public static void main(String[] args) {
	 Main main  = new Main();
     main.run();
    }
   public void run(){

       Bus[] buses = new Bus[5];
        for(int i = 0; i < buses.length; i++){
            buses[i] = new Bus(rand.nextInt(5), (int) (Math.random()*6)+1980, rand.nextDouble(10000));
        }

        for(int i = 0; i < buses.length; i++){
            writer.write(buses[i]);
        }

        writer.writeString("Enter route number: ");
        int routeNumber = reader.readInt();
        for (int i = 0; i < buses.length; i++){
            if(buses[i].routeNum == routeNumber){
                writer.write(buses[i]);
            }
        }

        writer.writeString("Vvedite god suka: ");
        int year = reader.readInt();
        for (int i = 0; i < buses.length; i++){
            if(buses[i].numBeginning < year){
                writer.write(buses[i]);
            }
        }

        writer.writeString("Enter Mileage: ");
        double mileage = reader.readDouble();
        for(int i = 0; i < buses.length; i++){
            if(buses[i].countRange > mileage){
                writer.write(buses[i]);
            }
        }
    }
}
