package com.freo.design.model;

/*****************************
 * 类名：ServerFactory
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 15:19
 * 版本：1.0
 * 描述：
 *  Server计算机工厂接口实现类，用于创建Server计算机实例
 * ***************************
 */
public class ServerFactory implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
