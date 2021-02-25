package ru.planetavto.boiler;

import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class WaterDispenser3 implements IWaterDispenser{
    @Nullable private CupOfWater mainCup;

    @Override
    public void setAvailability(@Nullable CupOfWater mainCup) {
        this.mainCup = mainCup;
    }

    @Override
    public CupOfWater getCupOfWater() {
        return Optional.ofNullable(mainCup).orElseThrow(()->new IllegalStateException("Resource not available"));
    }
}
