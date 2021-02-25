package ru.planetavto.boiler;

import com.sun.istack.internal.Nullable;

public interface IWaterDispenserInput {
    void setAvailability(@Nullable CupOfWater firstPortion);
}
