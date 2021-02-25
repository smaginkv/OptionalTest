package ru.planetavto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MixerTest {
    private IMixer mixer;

    @BeforeEach
    public void setUp() {
        mixer = new Mixer();
    }

    @Test
    public void testRainWaterAvailableAndClean() {
        mixer.setAvailability(new RainWater(true));
        assertTrue(mixer.getMixedWater().isPresent());
    }


    @Test
    public void testWaterNotAvailable() {
        mixer.setAvailability(null);
        assertFalse(mixer.getMixedWater().isPresent());
    }

    @Test
    public void testRainWaterAvailableNotClean() {
        mixer.setAvailability(new RainWater(false));
        assertTrue(mixer.getMixedWater().isPresent());
    }
}