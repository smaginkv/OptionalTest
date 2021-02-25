package ru.planetavto.boiler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Boiler1Test {

    private IBoiler boiler;

    @BeforeEach
    public void setUp() {
        boiler = new Boiler1();
    }

    @Test
    public void testBothNotAvailable() {
        boiler.setAvailability(false, false);
        assertFalse(boiler.getCupOfWater().isPresent());
        assertFalse(boiler.getCupOfBoiledWater().isPresent());
    }


    @Test
    public void testPowerAvailable() {
        boiler.setAvailability(false, true);
        assertFalse(boiler.getCupOfWater().isPresent());
        assertFalse(boiler.getCupOfBoiledWater().isPresent());
    }

    @Test
    public void testWaterAvailable() {
        boiler.setAvailability(true, false);
        assertTrue(boiler.getCupOfWater().isPresent());
        assertFalse(boiler.getCupOfBoiledWater().isPresent());
    }

    @Test
    public void testBothAvailable() {
        boiler.setAvailability(true, true);
        assertTrue(boiler.getCupOfWater().isPresent());
        assertTrue(boiler.getCupOfBoiledWater().isPresent());
    }
}