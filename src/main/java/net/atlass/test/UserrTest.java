package net.atlass.test;

/**
 * 类中属性的使用
 *
 * 属性(成员变量) vs 局部变量
 * 1.相同点
 *      1.1定义变量格式；数据类型 变量名 =变量值
 *      1.2先声明.后使用(变量特点)
 *      1.3变量都有其对应的作用域
 *
 * 2.不同点
 *      2.1在类中声明的位置不同
 *      属性(成员变量)；直接定义在类的一对{}内
 *      局部变量；声明在方法内、方法形参、代码块、构造器内部的变量
        2.2关于权限修饰符的不同
        属性(成员变量) 可以在声明时 指明其权限 使用权限修饰符
        局部变量 不可以使用权限修饰符
        2.3默认初始化值情况
        属性(成员变量) 类的属性 根据其类型 都有默认初始化值
            整形(byte、short、int、long)：0
            浮点型(float、double)；0.0
            字符型(char)：0(或'\u0000')
            布尔类型(Boolean)：false
            引用类型(类、数组、接口)：null
        局部变量；没有默认初始化值
                意味着我们调用局部变量之前,一定要显示赋值
                特别的；形参在调用时我们复制即可。
        2.4在内存中加载的位置不同
        属性(成员变量) 加载到堆空间中(非static)
        局部变量加载到栈空间

 */
public class UserrTest {
}

class User{
    //属性(成员变量)
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//形参，局部变量

        System.out.println("语言"+language);
    }

    public void eat(){
        String food ="烙饼";//形参，局部变量
        System.out.println("喜欢吃"+food);
    }
}