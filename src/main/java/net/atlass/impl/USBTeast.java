package net.atlass.impl;

/**
 * 接口的使用
 */
public class USBTeast {
    public static void main(String [] args){
        Computer computer =new Computer();
        UP up = new UP();
        Printer printer =new Printer();
        computer.transferDate(printer);
    }
}

//电脑
class Computer{
    //传入USB对象
    public void transferDate(USB usb){
        usb.strart();
        System.out.println("传输数据细节");
        usb.top();
    }
}


interface USB{
    // 常量：定义 长宽高，最大最小速度等
    void strart();

    void top();
}

//U盘
class UP implements USB{

    @Override
    public void strart() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void top() {
        System.out.println("U盘结束工作");
    }
}

//打印机
class Printer implements USB{

    @Override
    public void strart() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void top() {
        System.out.println("打印机结束工作");
    }
}