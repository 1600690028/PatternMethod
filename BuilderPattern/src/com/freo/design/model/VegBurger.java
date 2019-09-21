package com.freo.design.model;

/*****************************
 * 类名：VegBurger
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:21
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
