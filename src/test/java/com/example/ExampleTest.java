package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void example() {
        assertEquals("bar", System.getProperty("com.example.foo"));
    }
}
