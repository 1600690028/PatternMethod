package com.freo.design.model;

/*****************************
 * 类名：Computer
 * 模块：
 * 创建者：立业/freo
 * 创建时间：2019/9/21 15:07
 * 版本：1.0
 * 描述：
 *  定义计算机抽象类
 * ***************************
 */
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}