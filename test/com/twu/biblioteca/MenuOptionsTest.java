package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MenuOptionsTest {

    private MenuApp menu;
    private PrintStream printStream;

    @Before
    public void initTestSetup(){
        printStream = mock(PrintStream.class);
    }
    @Test
    public void TestShowMenuOptions(){
        menu = new MenuApp(printStream);
        menu.ShowMenuOptions();
        verify(printStream).println("1 - List Books");
    }

   @Test
    public void TestGetUserSelectedOption(){
        PrintStream printStream = mock(PrintStream.class);
        menu = new MenuApp(printStream);
        InputStream userInput = new ByteArrayInputStream("1".getBytes());
        System.setIn(userInput);
        assertThat(1, is(menu.getUserSelectedOption()));
    }

    @Test
    public void TestIsSelectedOptionValid(){
        menu = new MenuApp(printStream);
        assertTrue(menu.isValidOption(MenuApp.options, 1));
        assertFalse(menu.isValidOption(MenuApp.options, 2));
    }
}
