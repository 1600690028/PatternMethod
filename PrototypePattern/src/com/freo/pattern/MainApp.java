package com.freo.pattern;

/*****************************
 * 类名：MainApp
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 22:29
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class MainApp {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
