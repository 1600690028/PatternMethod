package com.freo.design.model;

/*****************************
 * 类名：ChickenBurger
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:21
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}