package com.freo.design.model;

/*****************************
 * 类名：PCFactory
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 15:18
 * 版本：1.0
 * 描述：
 *  PC 计算机工厂接口实现类，用于创建PC计算机实例
 * ***************************
 */
public class PCFactory implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
