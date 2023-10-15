package com.example.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleMathTestCase {

    @Test
    void testSum(){
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.sum(6.2D, 2D);
        double expected = 8.2d;

        assertEquals(expected, actual, "O teste não produziu o resultado esperado.");
    }
}
