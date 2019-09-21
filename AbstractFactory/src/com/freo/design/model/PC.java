package com.freo.design.model;

/*****************************
 * 类名：PC
 * 模块：
 * 创建者：立业/zqsw
 * 创建时间：2019/9/21 15:10
 * 版本：1.0
 * 描述：
 *  定义PC机子，计算机的子类
 * ***************************
 */
public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}
