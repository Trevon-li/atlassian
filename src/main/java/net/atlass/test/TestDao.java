package net.atlass.test;

public  class TestDao {
    public static void main(String[] args){

        TestDao testDao =new TestDao();
        testDao.exchange();

        testDao.testpr();

    }

    public  void testpr (){
        int m;
        String name;

    }

    public void exchange(){
        int n=10;
        int m=20;
        System.out.println("n--"+n);
        System.out.println("m--"+m);
        int temp =m;
        System.out.println("(temp=m)----temp="+temp);
        m=n;
        System.out.println("(m=n)---m="+m);
        n=temp;
        System.out.println("(n=temp)---n="+n);

        System.out.println("n="+n+"--2--"+"m="+m);
    }
}
