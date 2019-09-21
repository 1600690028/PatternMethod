package com.freo.pattern;

/*****************************
 * 类名：Rectangle
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 22:17
 * 版本：1.0
 * 描述：
 *长方形 继承 形状 抽象类
 * ***************************
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
