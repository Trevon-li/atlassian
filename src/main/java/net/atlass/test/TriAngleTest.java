package net.atlass.test;

public class TriAngleTest {

public static void main(String[] args){

    TriAngle p1 = new TriAngle();
    p1.setName("tom");
    p1.setAge(21);
    System.out.println("name=" + p1.getName() + "--age=" + p1.getAge());

    TriAngle personExer1=new TriAngle("aaa",21);
    System.out.println("name=" + personExer1.getName() + "--age=" + personExer1.getAge());

}


}
