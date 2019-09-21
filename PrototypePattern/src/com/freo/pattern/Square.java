package com.freo.pattern;

/*****************************
 * 类名：Square
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 22:18
 * 版本：1.0
 * 描述：
 *正方形 继承 形状 抽象类
 * ***************************
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
