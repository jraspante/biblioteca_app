package com.twu.biblioteca;

import java.util.Scanner;

public class MenuApp {

    public int MenuOptions()
    {
        Scanner scanner = new Scanner(System.in);
        String [] options = new String[]{
                "1 - List Books"
        };
        int optionSelected = 0;

        do {
            System.out.println("Please, type an option number and then press enter");
            for (int i = 0; i < options.length; i++){
                System.out.println(options[i]);
            }
            try {
                optionSelected = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) { }
        }
        while (!this.isValidOption(options, optionSelected));
        return optionSelected;

    }

    private boolean isValidOption(String [] menuOptions, int option){
        for (int i = 0; i < menuOptions.length; i ++){
            if(i == (option - 1)) return true;
        }
        System.out.println("Please select a valid option");
        return false;
    }
}
