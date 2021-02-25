package ru.planetavto;

import java.util.Optional;

public class Mixer extends RainWaterCleaner implements IMixer {
    private MixedWater result = null;

    @Override
    public Optional<MixedWater> getMixedWater() {
        super.getCleanedWater().ifPresent(water -> mix(water));
        return Optional.ofNullable(result);

    }

    private void mix(CupOfWater water) {
        result = new MixedWater(water);
    }
}
