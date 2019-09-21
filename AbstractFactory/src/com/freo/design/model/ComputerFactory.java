package com.freo.design.model;

/*****************************
 * 类名：ComputerFactory
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 15:21
 * 版本：1.0
 * 描述：
 *  创建一个消费者类，该类将提供客户端类创建子类的入口点
 * ***************************
 */
public class ComputerFactory {
    /**
     * 静态方法：用于创建对应子类的实例对象
     * @param factory
     * @return
     */
    public static Computer getComputer(IComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
