package ru.planetavto.boiler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterDispenser1Test {
    private IWaterDispenser waterDispenser;

    @BeforeEach
    public void setUp() {
        waterDispenser = new WaterDispenser1();
    }

    @Test
    public void testMainAvailable() {
        waterDispenser.setAvailability(new CupOfWater());
        assertNotNull(waterDispenser.getCupOfWater());
    }


    @Test
    public void testMainNotAvailable() {
        waterDispenser.setAvailability(null);
        assertNotNull(waterDispenser.getCupOfWater());
    }

}