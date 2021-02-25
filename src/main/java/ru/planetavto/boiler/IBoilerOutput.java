package ru.planetavto.boiler;

import java.util.Optional;

public interface IBoilerOutput {
    Optional<CupOfWater> getCupOfWater();
    Optional<CupOfBoiledWater> getCupOfBoiledWater();
}
