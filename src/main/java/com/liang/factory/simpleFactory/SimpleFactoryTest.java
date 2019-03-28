package com.liang.factory.simpleFactory;

import com.liang.factory.BenzCar;
import com.liang.factory.ICar;

/**
 * 简单工厂测试
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

       CarFactory factory = new CarFactory();
        ICar ICar = factory.create(BenzCar.class);
        ICar.run();
    }
}
