package com.freo.design.model;

/*****************************
 * 类名：Server
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 15:14
 * 版本：1.0
 * 描述：
 *  定义服务器机子，计算机子类
 * ***************************
 */
public class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
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
