package net.atlass.view;

public class HelloTest {

}

class HelloA{
    public HelloA(){
        System.out.println("helloa");
    }

    {
        System.out.println("im A class");
    }

    static {
        System.out.println("statica");
    }
}

class HelloB extends HelloA{
    public HelloB(){
        System.out.println("hellob");
    }
    {
        System.out.println("im hellob");
    }
    static {
        System.out.println("static b");
    }

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("D--"+i+"--L"+j);
            }
        }

//        new HelloB();
    }
}