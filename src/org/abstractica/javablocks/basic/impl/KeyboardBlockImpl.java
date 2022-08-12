package org.abstractica.javablocks.basic.impl;


import org.abstractica.javablocks.basic.Input;

import java.util.Scanner;

//Singleton design pattern
public class KeyboardBlockImpl implements Input<String>
{
    private static final Input<String> instance = new KeyboardBlockImpl();
    private final Scanner scanner = new Scanner(System.in);

    private KeyboardBlockImpl()
    {
    }

    public static Input<String> getInstance()
    {
        return instance;
    }


    @Override
    public String get()
    {
        return scanner.nextLine();
    }
}
