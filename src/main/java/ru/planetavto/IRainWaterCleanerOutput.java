package ru.planetavto;

import java.util.Optional;

public interface IRainWaterCleanerOutput {
    Optional<CupOfWater> getCleanedWater();
}
