package com.liang.factory.factoryMethod;

import com.liang.factory.BMWCar;
import com.liang.factory.ICar;

public class BMWCarFactory implements ICarFactory {
    public ICar create() {
        return new BMWCar();
    }
}
