package com.liang.factory.abstractFactory;

/**
 * 抽象工厂主入口
 */
public interface ICarFactory {

    IGasoline createGasoline();

    IElectric carateElectric();

}
