package ru.planetavto.boiler;

public interface IBoilerOutput3 {
    Result<CupOfWater, String> getCupOfWater();
    Result<CupOfBoiledWater, String> getCupOfBoiledWater();
}
