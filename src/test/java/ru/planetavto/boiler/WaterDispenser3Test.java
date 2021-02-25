package ru.planetavto.boiler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaterDispenser3Test {
    private IWaterDispenser waterDispenser;

    @BeforeEach
    public void setUp() {
        waterDispenser = new WaterDispenser3();
    }

    @Test
    public void testMainAvailable() {
        waterDispenser.setAvailability(new CupOfWater());
        assertNotNull(waterDispenser.getCupOfWater());
    }

    @Test
    public void testMainNotAvailable() {
        waterDispenser.setAvailability(null);
        assertThrows(IllegalStateException.class, ()->  waterDispenser.getCupOfWater());
    }

}