package com.liang.factory.abstractFactory;

public class BMWCarFactory implements ICarFactory {
    public IGasoline createGasoline() {
        return new BMWGasoline();
    }

    public IElectric carateElectric() {
        return new BMWElectric();
    }
}
