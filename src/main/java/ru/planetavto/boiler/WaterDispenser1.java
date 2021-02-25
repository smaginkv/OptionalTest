package ru.planetavto.boiler;

import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class WaterDispenser1 implements IWaterDispenser {
    @Nullable
    private CupOfWater mainCup;

    @Override
    public void setAvailability(@Nullable CupOfWater mainCup) {
        this.mainCup = mainCup;
    }

    @Override
    public CupOfWater getCupOfWater() {
        return Optional.ofNullable(mainCup).orElse(new CupOfWater());
    }
}
