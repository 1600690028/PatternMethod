package com.freo.design.model;

/*****************************
 * 类名：Coke
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:22
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}