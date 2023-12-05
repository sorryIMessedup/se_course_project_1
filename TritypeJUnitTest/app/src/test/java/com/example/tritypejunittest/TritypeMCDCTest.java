package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeMCDCTest {
    // if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)

    /* __________________________
     *          t1  t2  t3  Cond.
     *  TC1     F   F   F   F
     *  TC2     T   F   F   T
     *  TC3     F   T   F   T
     *  TC4     F   F   T   T
     */
    @Test
    public void TC1() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3,4,5));
    }
    @Test
    public void TC12() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-3,4,5));
    }
    @Test
    public void TC13() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(3,-4,5));
    }
    @Test
    public void TC14() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(3,4,-5));
    }
}
