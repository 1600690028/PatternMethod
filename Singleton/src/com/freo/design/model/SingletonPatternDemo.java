package com.freo.design.model;

/*****************************
 * 类名：SingletonPatternDemo
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 20:34
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
