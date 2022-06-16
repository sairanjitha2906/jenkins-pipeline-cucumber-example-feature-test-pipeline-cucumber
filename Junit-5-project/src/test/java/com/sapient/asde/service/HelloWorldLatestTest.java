package com.sapient.asde.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldLatestTest {
    private HelloWorld helloWorld= new HelloWorld();

    @Test
    void setGreetingForInvalidInput() {
        helloWorld.setGreeting("How are you");
        assertNotEquals("How are you?",helloWorld.getGreeting());
    }
    @Disabled
    @Test
    void getToStringForValidOutput(){
        assertEquals("HelloWorld{greeting='Hello World'}", helloWorld.toString());
    }

    @Test
    void  checkForValidDefaultConstructor(){
        HelloWorld helloWorld1= new HelloWorld();
        assertNull(helloWorld1.getGreeting());
    }


    @Disabled
    @Test
    void  checkForValidOneArgConstructor(){
        //TO DO
    }
}
