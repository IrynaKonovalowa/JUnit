package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
    @Test
    void area_ShouldReturnCentimetresFromMillimetres_WhenCalled() {
        double expected = 10;
        double actual = Length.getLength("mm","cm", 100);
        assertEquals(expected,actual,0.1, "100 mm = 10 cm");
    }
    @Test
    void area_ShouldReturnDecimetresFromMillimetres_WhenCalled() {
        double expected = 1;
        double actual = Length.getLength("mm","dm", 100);
        assertEquals(expected,actual, 0.1,"100 mm = 1 dm");
    }
    @Test
    void area_ShouldReturnMetresFromMillimetres_WhenCalled() {
        double expected = 0.1;
        double actual = Length.getLength("mm","m", 100);
        assertEquals(expected,actual, 0.1,"100 mm = 0.1 m");
    }
    @Test
    void area_ShouldReturnKilometresFromMillimetres_WhenCalled() {
        double expected = 0.0001;
        double actual = Length.getLength("mm","km", 100);
        assertEquals(expected,actual, 0.1,"100 mm = 0.0001 km");
    }
    @Test
    void area_ShouldReturnMillimetresFromCentimetres_WhenCalled() {
        double expected = 1000;
        double actual = Length.getLength("cm","mm", 100);
        assertEquals(expected,actual,0.1, "100 cm = 1000 mm");
    }
    @Test
    void area_ShouldReturnDecimetresFromCentimetres_WhenCalled() {
        double expected = 10;
        double actual = Length.getLength("cm","dm", 100);
        assertEquals(expected,actual,0.1, "100 cm = 10 dm");
    }
    @Test
    void area_ShouldReturnMetresFromCentimetres_WhenCalled() {
        double expected = 1;
        double actual = Length.getLength("cm","m", 100);
        assertEquals(expected,actual,0.1, "100 cm = 1 m");
    }
    @Test
    void area_ShouldReturnKilometresFromCentimetres_WhenCalled() {
        double expected = 0.0001;
        double actual = Length.getLength("cm","km", 100);
        assertEquals(expected,actual,0.1, "100 cm = 0.0001 km");
    }
    @Test
    void area_ShouldReturnMillimetresFromDecimetres_WhenCalled() {
        double expected = 10000;
        double actual = Length.getLength("dm","mm", 100);
        assertEquals(expected,actual,0.1, "100 dm = 10000 mm");
    }
    @Test
    void area_ShouldReturnCentimetresFromDecimetres_WhenCalled() {
        double expected = 1000;
        double actual = Length.getLength("dm","cm", 100);
        assertEquals(expected,actual,0.1, "100 dm = 1000 cm");
    }
    @Test
    void area_ShouldReturnMetresFromDecimetres_WhenCalled() {
        double expected = 10;
        double actual = Length.getLength("dm","m", 100);
        assertEquals(expected,actual,0.1, "100 dm = 10 m");
    }
    @Test
    void area_ShouldReturnKilometresFromDecimetres_WhenCalled() {
        double expected = 0.01;
        double actual = Length.getLength("dm","km", 100);
        assertEquals(expected,actual,0.1, "100 dm = 0.01 km");
    }
    @Test
    void area_ShouldReturnMillimetresFromMetres_WhenCalled() {
        double expected = 100000;
        double actual = Length.getLength("m","mm", 100);
        assertEquals(expected,actual,0.1, "100 m = 100000 mm");
    }
    @Test
    void area_ShouldReturnCentimetresFromMetres_WhenCalled() {
        double expected = 10000;
        double actual = Length.getLength("m","cm", 100);
        assertEquals(expected,actual,0.1, "100 m = 10000 cm");
    }
    @Test
    void area_ShouldReturnDecimetresFromMetres_WhenCalled() {
        double expected = 1000;
        double actual = Length.getLength("m","dm", 100);
        assertEquals(expected,actual,0.1, "100 m = 1000 dm");
    }
    @Test
    void area_ShouldReturnKilometresFromMetres_WhenCalled() {
        double expected = 0.1;
        double actual = Length.getLength("m","km", 100);
        assertEquals(expected,actual,0.1, "100 m = 0.1 km");
    }
    @Test
    void area_ShouldReturnMillimetresFromKilometres_WhenCalled() {
        double expected = 100000;
        double actual = Length.getLength("km","mm", 0.1);
        assertEquals(expected,actual,0.1, "0.1 km = 100000 mm");
    }
    @Test
    void area_ShouldReturnCentimetresFromKilometres_WhenCalled() {
        double expected = 10000;
        double actual = Length.getLength("km","cm", 0.1);
        assertEquals(expected,actual,0.1, "0.1 km = 10000 cm");
    }
    @Test
    void area_ShouldReturnDecimetresFromKilometres_WhenCalled() {
        double expected = 1000;
        double actual = Length.getLength("km","dm", 0.1);
        assertEquals(expected,actual,0.1, "0.1 km = 1000 dm");
    }
    @Test
    void area_ShouldReturnMetresFromKilometres_WhenCalled() {
        double expected = 100;
        double actual = Length.getLength("km","m", 0.1);
        assertEquals(expected,actual,0.1, "0.1 km = 100 m");
    }
}
