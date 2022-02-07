package com.company.util;

import java.util.Scanner;

public class ReaderImpl implements Reader{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine();
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    @Override
    public double readDouble() {
        return scanner.nextDouble();
    }
}
