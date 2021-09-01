package net.atlass.test;

public class TriAngle {
    private String name;
    private int age;

    public TriAngle(){
        System.out.println("DefaultPersonExer");
    }

    public TriAngle(String name, int age){
        System.out.println("String name,int age");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void  setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
