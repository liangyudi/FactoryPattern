package com.liang.factory.factoryMethod;

import com.liang.factory.ICar;

/**
 * 工厂方法模式测试
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICarFactory factory = new BenzCarFactory();
        ICar car = factory.create();
        car.run();

        factory = new BMWCarFactory();
        car = factory.create();
        car.run();
    }
}
