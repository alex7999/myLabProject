package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyCounterTest {

    private CandyCounter candyCounter;
    @BeforeEach
    void setUp() {
        candyCounter = new CandyCounter();
    }

    @Test
    void countCandy() {
        assertEquals(4, candyCounter.CountCandy(10, 3, 3));
    }

    @Test
    void countCandy2() {
        assertEquals(8, candyCounter.CountCandy(20, 3, 3));
    }

    @Test
    void countCandyZero() {
        assertEquals(0, candyCounter.CountCandy(20, 0, 3));
    }

    @Test
    void countCandyException() {
        assertThrows(ArithmeticException.class, () -> candyCounter.CountCandy(20, 3, 0));
    }
}