package com.Timeout;

public class PrintMessage_Test {
    //
      static void print_message_Test(PrintMessage p)
     {
        p.print_message("inside print method");
    }
     static void Add_message_Test(PrintMessage p)
    {
        p.Add_message("Inside Add Method");
    }

    public static void main(String []args){
        PrintMessage p = new PrintMessage();
        print_message_Test(p);
        Add_message_Test(p);
    }
}
