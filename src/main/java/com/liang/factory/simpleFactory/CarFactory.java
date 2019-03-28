package com.liang.factory.simpleFactory;

import com.liang.factory.ICar;

public class CarFactory {

    public static ICar create(Class<? extends ICar> clazz){

//        if("BMW".equals(name)){
//            return new BMWCar();
//        }else if("Benz".equals(name)){
//            return new BenzCar();
//        }else{
//            return null;
//        }

//        try {
//            if(!(null == className || "".equals(className))){
//                return (ICar) Class.forName(className).newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return null;

        try {
            if(null != clazz ){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
