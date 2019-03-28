package com.liang.factory.abstractFactory;

public class BenzCarFactory implements ICarFactory {
    public IGasoline createGasoline() {
        return new BenzGasoline();
    }

    public IElectric carateElectric() {
        return new BenzElectric();
    }
}
