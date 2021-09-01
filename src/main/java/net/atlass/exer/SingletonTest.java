package net.atlass.exer;

//单列设计模式
public class SingletonTest {

public static void main(String [] args){

    Bank bank1 = Bank.getInstance();
    Bank bank2 = Bank.getInstance();
    System.out.println(bank1 == bank2);

    Order order1 = Order.getInstance();
    Order order2 = Order.getInstance();
    System.out.println(order1 == order2);
}



}
