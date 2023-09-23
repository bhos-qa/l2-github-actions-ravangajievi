package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testingReverseStringFunction() {
        var reverser = new ReverseString();
        assertEquals("salam", reverser.ReverseString("malas"));
    }

}