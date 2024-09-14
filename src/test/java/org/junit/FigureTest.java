package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {
    @Test
    void area_ShouldReturnAreaRectangle_WhenCalled() {

        double expected = 210;
        double actual = Figure.getAreaRectangle(10.5,20);
        assertEquals(expected,actual, "print area rectangle (10.5; 20) -> 210");
    }
    @Test
    void area_ShouldReturnAreaSquare_WhenCalled() {
        double expected = 20.25;
        double actual = Figure.getAreaSquare(4.5);
        assertEquals(expected,actual, "print area square (4.5) -> 20.25");
    }
    @Test
    void area_ShouldReturnAreaTriangle_WhenCalled() {
        double expected = 30;
        double actual = Figure.getAreaTriangle(10, 6);
        assertEquals(expected,actual, "print area triangle (10, 6) -> 30");
    }
    @Test
    void area_ShouldReturnAreaDiamond_WhenCalled() {
        double expected = 72;
        double actual = Figure.getAreaDiamond(12, 6);
        assertEquals(expected,actual, "print area triangle (10, 6) -> 72");
    }
}
