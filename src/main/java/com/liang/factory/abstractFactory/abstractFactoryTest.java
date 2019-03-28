package com.liang.factory.abstractFactory;

/**
 * 抽象工厂测试
 */
public class abstractFactoryTest {

    public static void main(String[] args) {
       ICarFactory factory =  new BenzCarFactory();
       factory.carateElectric().charge();
       factory.createGasoline().gasUp();
    }
}
