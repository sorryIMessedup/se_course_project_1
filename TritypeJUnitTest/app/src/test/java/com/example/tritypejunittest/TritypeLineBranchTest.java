package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeLineBranchTest {
    @Test
    public void scalene() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3,4,5));
    }
    @Test
    public void isosceles() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(3,3,5));
        assertEquals(2,tri.Triang(3,5,3));
        assertEquals(2,tri.Triang(3,4,4));
    }
    @Test
    public void equilateral() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(3,3,3));
    }
    @Test
    public void notATriangleAllPositive() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1,2,7));
    }
    @Test
    public void notATriangleExistNegative() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1,2,7));
    }

}