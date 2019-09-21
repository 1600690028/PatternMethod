package com.freo.design.model;

/*****************************
 * 类名：MainApp
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 15:23
 * 版本：1.0
 * 描述：
 *  运行测试设计模式的入口函数
 * ***************************
 */
public class MainApp {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        //通过ComputerFactory直接获取对象
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        //输出
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
