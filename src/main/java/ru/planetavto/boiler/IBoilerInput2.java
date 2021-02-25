package ru.planetavto.boiler;

import com.sun.istack.internal.Nullable;

public interface IBoilerInput2 {
    void setAvailability(@Nullable CupOfWater water, boolean powerAvailable);
}
