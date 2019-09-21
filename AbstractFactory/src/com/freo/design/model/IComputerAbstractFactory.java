package com.freo.design.model;

/*****************************
 * 接口名：IComputerAbstractFactory
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 15:16
 * 版本：1.0
 * 描述：
 *  需要创建一个Abstract Factory接口或抽象类
 *  每一个子类的工厂类的抽象接口
 * ***************************
 */
public interface IComputerAbstractFactory {
    public Computer createComputer();//方法正在返回超类的实例Computer。现在，我们的工厂类将实现此接口并返回其各自的子类
}
