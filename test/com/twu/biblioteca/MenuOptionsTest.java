package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MenuOptionsTest {

    @Test
    public void TestMenuOptions(){
        MenuApp menu = new MenuApp();
        InputStream userInput = new ByteArrayInputStream("1".getBytes());
        System.setIn(userInput);

        assertEquals(1, menu.MenuOptions());
    }
}
