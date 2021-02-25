package ru.planetavto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RainWaterDispenser1Test {
    private IRainWaterDispenser rainWaterDispenser;

    @BeforeEach
    public void setUp() {
        rainWaterDispenser = new RainWaterDispenser1();
    }

    @Test
    public void testRainWaterAvailableAndClean() {
        rainWaterDispenser.setAvailability(new RainWater(true));
        assertTrue(rainWaterDispenser.getRainWater().isPresent());
        assertTrue(rainWaterDispenser.getRainWater().get().isClean());
    }


    @Test
    public void testWaterNotAvailable() {
        rainWaterDispenser.setAvailability(null);
        assertFalse(rainWaterDispenser.getRainWater().isPresent());
    }

    @Test
    public void testRainWaterAvailableNotClean() {
        rainWaterDispenser.setAvailability(new RainWater(false));
        assertFalse(rainWaterDispenser.getRainWater().isPresent());
    }
}