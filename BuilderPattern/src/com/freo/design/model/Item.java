package com.freo.design.model;

/*****************************
 * 类名：Item
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:13
 * 版本：1.0
 * 描述：
 *  创建代表食品和包装的界面物料接口
 * ***************************
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
