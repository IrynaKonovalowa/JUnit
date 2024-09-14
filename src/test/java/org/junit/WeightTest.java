package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightTest {
    @Test
    void area_ShouldReturnGrammesFromMilligrammes_WhenCalled() {
        double expected = 1;
        double actual = Weight.getWeight("mg","g", 1000);
        assertEquals(expected,actual,0.1, "1000 mg = 1 g");
    }
    @Test
    void area_ShouldReturnKilogrammesFromMilligrammes_WhenCalled() {
        double expected = 0.001;
        double actual = Weight.getWeight("mg","kg", 1000);
        assertEquals(expected,actual,0.1, "1000 mg = 0.001 kg");
    }
    @Test
    void area_ShouldReturnTonnesFromMilligrammes_WhenCalled() {
        double expected = 0.000001;
        double actual = Weight.getWeight("mg","t", 1000);
        assertEquals(expected,actual,0.1, "1000 mg = 0.000001 t");
    }
    @Test
    void area_ShouldReturnMilligrammesFromGrammes_WhenCalled() {
        double expected =100000;
        double actual = Weight.getWeight("g","mg", 100);
        assertEquals(expected,actual,0.1, "100 g = 100000 mg");
    }
    @Test
    void area_ShouldReturnKilogrammesFromGrammes_WhenCalled() {
        double expected = 0.1;
        double actual = Weight.getWeight("g","kg", 100);
        assertEquals(expected,actual,0.1, "100 g = 0.1 kg");
    }
    @Test
    void area_ShouldReturnTonnesFromGrammes_WhenCalled() {
        double expected = 0.0001;
        double actual = Weight.getWeight("g","t", 100);
        assertEquals(expected,actual,0.1, "100 g = 0.0001 t");
    }
    @Test
    void area_ShouldReturnMilligrammesFromKilogrammes_WhenCalled() {
        double expected = 10000000;
        double actual = Weight.getWeight("kg","mg", 100);
        assertEquals(expected,actual,0.1, "100 kg =  10000000 mg");
    }
    @Test
    void area_ShouldReturnGrammesFromKilogrammes_WhenCalled() {
        double expected = 100000;
        double actual = Weight.getWeight("kg","g", 100);
        assertEquals(expected,actual,0.1, "100 kg =  100000 g");
    }
    @Test
    void area_ShouldReturnTonnesFromKilogrammes_WhenCalled() {
        double expected = 0.1;
        double actual = Weight.getWeight("kg","t", 100);
        assertEquals(expected,actual,0.1, "100 kg =  0.1 t");
    }
    @Test
    void area_ShouldReturnMilligrammesFromTonnes_WhenCalled() {
        double expected = 100000000;
        double actual = Weight.getWeight("t","mg", 1);
        assertEquals(expected,actual,0.1, "1 t =  100000000 mg");
    }
    @Test
    void area_ShouldReturnGrammesFromTonnes_WhenCalled() {
        double expected = 100000;
        double actual = Weight.getWeight("t","g", 1);
        assertEquals(expected,actual,0.1, "1 t =  100000 g");
    }
    @Test
    void area_ShouldReturnKilogrammesFromTonnes_WhenCalled() {
        double expected = 1000;
        double actual = Weight.getWeight("t","kg", 1);
        assertEquals(expected,actual,0.1, "1 t =  1000 kg");
    }
}
