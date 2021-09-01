package net.atlass.test;

public  class TestDao {
    public static void main(String[] args){

        TestDao testDao =new TestDao();
        testDao.exchange();

        testDao.testpr();

    }

    public  void testpr (){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("--第"+i+"楼--第"+j+"室");
                for (int k = 1; k <= 2; k++) {
                    System.out.println("第"+i+"楼"+k+"室");
                }

            }
        }

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
