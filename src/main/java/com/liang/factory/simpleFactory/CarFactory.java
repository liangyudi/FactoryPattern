package com.liang.factory.simpleFactory;

public class CarFactory {

    public static Car create(String name){

        if("BMW".equals(name)){
            return new BMWCar();
        }else if("Benz".equals(name)){
            return new BenzCar();
        }else{
            return null;
        }
    }
}
