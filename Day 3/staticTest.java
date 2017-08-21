// Just a demo to show the working of a static block and static class
class staticDemo
{
    static int a=10;
    static int b;
    static void myMeth(int x)
    {
        System.out.println("x is: "+ x);
        System.out.println("a is: "+ a);
        System.out.println("b is: "+ b);
    }

    static{
        System.out.println("This statement will execute first");
        b=a*10;
    }
}

class staticTest
{
    public static void main(String args[])
    {
        staticDemo.myMeth(200);
    }
}