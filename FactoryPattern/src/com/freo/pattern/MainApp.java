package com.freo.pattern;

/*****************************
 * 类名：MainApp
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 23:09
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class MainApp {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
