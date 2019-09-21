package com.freo.pattern;
import java.util.Hashtable;
/*****************************
 * 类名：ShapeCache
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 22:26
 * 版本：1.0
 * 描述：
 * 形状缓冲池
 * ***************************
 */
public class ShapeCache {
    //hashtable存储数据
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();
    //获取形状
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    //加载形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
