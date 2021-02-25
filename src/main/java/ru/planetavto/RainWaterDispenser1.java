package ru.planetavto;

import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class RainWaterDispenser1 implements IRainWaterDispenser {
    @Nullable
    private RainWater rainWater;

    @Override
    public void setAvailability(@Nullable RainWater rainWater) {
        this.rainWater = rainWater;
    }

    @Override
    public Optional<RainWater> getRainWater() {
        return Optional.ofNullable(rainWater).filter((x)->x.isClean());
    }
}
