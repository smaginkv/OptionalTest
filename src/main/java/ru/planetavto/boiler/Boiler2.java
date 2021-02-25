package ru.planetavto.boiler;

import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class Boiler2 implements IBoiler2 {
    @Nullable
    private CupOfWater water;
    private boolean powerAvailable;


    @Override
    public void setAvailability(@Nullable CupOfWater water, boolean powerAvailable) {
        this.water = water;
        this.powerAvailable = powerAvailable;
    }

    @Override
    public Optional<CupOfWater> getCupOfWater() {
        return Optional.ofNullable(water);
    }

    @Override
    public Optional<CupOfBoiledWater> getCupOfBoiledWater() {
        if(!powerAvailable) {
            return Optional.empty();
        }

        return getCupOfWater().map(cupOfWater->cupOfWater.boil());
    }
}
