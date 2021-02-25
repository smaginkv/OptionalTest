package ru.planetavto.boiler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Boiler2Test {

    private IBoiler2 boiler;

    @BeforeEach
    public void setUp() {
        boiler = new Boiler2();
    }

    @Test
    public void testBothNotAvailable() {
        boiler.setAvailability(null, false);
        assertFalse(boiler.getCupOfWater().isPresent());
        assertFalse(boiler.getCupOfBoiledWater().isPresent());
    }


    @Test
    public void testPowerAvailable() {
        boiler.setAvailability(null, true);
        assertFalse(boiler.getCupOfWater().isPresent());
        assertFalse(boiler.getCupOfBoiledWater().isPresent());
    }

    @Test
    public void testWaterAvailable() {
        boiler.setAvailability(new CupOfWater(), false);
        assertTrue(boiler.getCupOfWater().isPresent());
        assertFalse(boiler.getCupOfBoiledWater().isPresent());
    }

    @Test
    public void testBothAvailable() {
        boiler.setAvailability(new CupOfWater(), true);
        assertTrue(boiler.getCupOfWater().isPresent());
        assertTrue(boiler.getCupOfBoiledWater().isPresent());
    }
}