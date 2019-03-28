package com.liang.factory.simpleFactory;

/**
 * 2019/3/28
 * Liangyudi-PC
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

       CarFactory factory = new CarFactory();
        Car car = factory.create("BMW");
        car.run();
    }
}
