package ru.planetavto;

import java.util.Optional;

public interface IMixerOutput extends IRainWaterCleanerOutput {
    Optional<MixedWater> getMixedWater();
}
