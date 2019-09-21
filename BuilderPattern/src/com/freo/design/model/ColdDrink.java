package com.freo.design.model;

/*****************************
 * 类名：ColdDrink
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:19
 * 版本：1.0
 * 描述：
 *创建实现提供默认功能的item接口的抽象类。
 * ***************************
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}