package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        MenuApp menu = new MenuApp(printStream);
        int userOptionSelected;
        printStream.println("Welcome to Biblioteca. Your one-stop-shop for great book title in Bangalore!");
        menu.ShowMenuOptions();
        do {
            userOptionSelected =  menu.getUserSelectedOption();
        }
        while (!menu.isValidOption(MenuApp.options, userOptionSelected));
    }
}
