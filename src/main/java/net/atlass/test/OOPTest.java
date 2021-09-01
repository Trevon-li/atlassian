package net.atlass.test;

/**
 * 1、设计类，其实就是设计类的成员
 *
 * 属性 = 成员变量 = field = 域、字段
 * 方法 = 成员方法 = 函数 =method
 *
 * 创建类的对象 = 类的实例化 = 实例化类
 *
 * 2、类和对象的使用(面向对象事项落地的实现)
 *  1.创建类：设计类的成员   看语言是否有生命力是否强大就看他是否给你提供了丰富的类
 *  2.创建类的对象  Person person =new Person();
 *  3.通过 对象.属性 or 对象.方法 调用对象的结构
 *
 *  面向对象的体现
 *   创建类；设计类的成员
 *   创建类的对象  Person person =new Person
 *   通过 对象.属性 or 对象.方法 调用对象的结构
 *
 *   如果创建了一个类的多个对象，则每个对象都拥有一套独立的类属性(非static的)
 *   意味着；如果我们修改了一个对象的属性a，则不影响另外一个对象的属性a值
 */
//测试类
public class OOPTest {
    public static void main(String[] args){
        //创建Person对象
        PerTest person =new PerTest();
        //Scanner scanner =new Scanner(System.in);

        //调用对象结构 属性、方法
        //调用属性 对象.属性
        person.name="Tom";
        person.ismale=true;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.ismale);

        //调用方法 对象.方法
        person.eat();
        person.talk("Chinese");
    }

}

//1.创建类：设计类的成员
class PerTest {

    //属性
    String name;
    int age=1;
    boolean ismale;

    //方法
    public void eat(){
        System.out.println("可以吃饭");
    }
    public void seleep(){
        System.out.println("可以睡觉");
    }
    public void talk(String languange){
        System.out.println("可以说话，使用语言是"+languange);
    }


}
