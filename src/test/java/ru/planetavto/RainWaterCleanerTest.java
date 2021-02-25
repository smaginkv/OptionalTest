package ru.planetavto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RainWaterCleanerTest {
    private IRainWaterCleaner rainWaterDispenser;

    @BeforeEach
    public void setUp() {
        rainWaterDispenser = new RainWaterCleaner();
    }

    @Test
    public void testRainWaterAvailableAndClean() {
        rainWaterDispenser.setAvailability(new RainWater(true));
        assertTrue(rainWaterDispenser.getCleanedWater().isPresent());
    }


    @Test
    public void testWaterNotAvailable() {
        rainWaterDispenser.setAvailability(null);
        assertFalse(rainWaterDispenser.getCleanedWater().isPresent());
    }

    @Test
    public void testRainWaterAvailableNotClean() {
        rainWaterDispenser.setAvailability(new RainWater(false));
        assertTrue(rainWaterDispenser.getCleanedWater().isPresent());
    }
}