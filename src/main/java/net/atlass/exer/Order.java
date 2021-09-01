package net.atlass.exer;

/**
 * 单例模式的懒汉式实现
 * 线程不安全的
 */
public class Order {
    //1 私有化构造器
    private Order(){

    }
    //2声明当前对象，没有初始化
    private static Order instance = null;

    //3 声明public static 的返回当前类对象的方法
    public static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}
