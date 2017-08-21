/*
OOP Lab: Day 4
Q1. WAP to take user at input at runtime using command line
argument concept. If user forgets to pass argument, then the
value should be taken as 10 automatically and it will be displayed.
Use ternary operator.

Akshay Anand
CSE 5th Sem

*/

class cla
{
    public static void main(String[] args)
    {
        int i=0, n=args.length;
        i = (n==0) ?  10 : Integer.valueOf(args[0]);
        System.out.println("i= "+i);
    }
}