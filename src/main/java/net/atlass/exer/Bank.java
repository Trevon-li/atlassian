package net.atlass.exer;


/**
 * 单例设计模式饿汉式
 * 线程安全的
 */
public class Bank {
    //1 私有化构造器
   private Bank(){

    }
    //2 内部创建类对象
    private static Bank instance = new Bank();

    //3提供公共的方法，返回类对象
    public static Bank getInstance(){

        return instance;
    }
}
