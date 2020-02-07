package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Scanner;

public class MenuApp {

    private PrintStream printStream;
    public static final String [] options = new String[] {
            "1 - List Books"
    };
    MenuApp(PrintStream printStream){
        this.printStream = printStream;
    }

    public void ShowMenuOptions()
    {
        printStream.println("Please, type an option number and then press enter");
        for (int i = 0; i < this.options.length; i++){
            printStream.println(options[i]);
        }
    }

    public int getUserSelectedOption(){
        int optionSelected = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            optionSelected = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) { }

        return optionSelected;
    }

    public boolean isValidOption(String [] menuOptions, int option){
        for (int i = 0; i < menuOptions.length; i ++){
            if(i == (option - 1)) return true;
        }
        printStream.println("Please select a valid option");
        return false;
    }
}
