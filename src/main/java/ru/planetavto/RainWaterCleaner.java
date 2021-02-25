package ru.planetavto;

import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class RainWaterCleaner implements IRainWaterCleanerInput, IRainWaterCleanerOutput {
    @Nullable
    private RainWater rainWater;

    @Override
    public void setAvailability(@Nullable RainWater rainWater) {
        this.rainWater = rainWater;
    }

    @Override
    public Optional<CupOfWater> getCleanedWater() {
        return Optional.ofNullable(rainWater).flatMap(w->Optional.of(new CupOfWater()));
    }
}
