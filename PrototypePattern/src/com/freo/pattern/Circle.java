package com.freo.pattern;

/*****************************
 * 类名：Circle
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 22:20
 * 版本：1.0
 * 描述：
 *圆形 继承 形状 抽象类
 * ***************************
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
