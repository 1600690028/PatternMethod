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

    //创建一个唯一的静态实例对象
    private static SingleObject instance = new SingleObject();

    //构造器初始化
    //instantiated
    private SingleObject(){}

    //获取唯一对象实例的方法
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
