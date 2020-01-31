package com.twu.biblioteca;

import java.util.Scanner;

public class MenuApp {

    public int MenuOptions()
    {
        Scanner scanner = new Scanner(System.in);
        int optionSelected = 0;

        System.out.println("Please, type an option and then press enter");
        System.out.println("1 - List Books");
        optionSelected = Integer.parseInt(scanner.nextLine());
        return optionSelected;
    }
}
