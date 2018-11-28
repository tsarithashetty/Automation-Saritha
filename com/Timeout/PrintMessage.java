package com.Timeout;

public class PrintMessage {

    public void print_message(String msg){
        System.out.println(msg);
        int i = 4;
        int j = i/0;
        System.out.println(j);
        //while(true);
    }

    public void Add_message(String msg)
    {
        System.out.println("Hello "+msg);
    }
}
