package com.freo.design.model;

/*****************************
 * 类名：SingleObject
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 20:30
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
