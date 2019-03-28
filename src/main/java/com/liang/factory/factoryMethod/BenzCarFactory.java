package com.liang.factory.factoryMethod;

import com.liang.factory.BenzCar;
import com.liang.factory.ICar;

public class BenzCarFactory implements ICarFactory {
    public ICar create() {
        return new BenzCar();
    }
}
