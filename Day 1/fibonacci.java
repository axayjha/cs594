/*
OOP Lab: Day 1
Q2. WAP in java to check to find sum of fibonacci series 
upto 50 terms

Akshay Anand
CSE 5th Sem

*/

import java.math.*;
class fibonacci
{	
    public int fib(int n)
    {
        /* Using recursion : Bad O(2^n) complexity */
        if(n==0 || n==1)
            return 1;
        else 
            return fib(n-1) + fib(n-2);    
    }

    public long fib1(int n)
    {
        /* Using golden ratio method: Nice O(1) complexity */
        return Math.round(Math.pow(((Math.sqrt(5)+1)/2), n)/Math.sqrt(5));

    }

    public static void main(String args[])
	{	
        fibonacci f = new fibonacci();
        long sum=0;
        for(int i=0; i<50; i++)
        {
            sum+= f.fib1(i);
        }
		System.out.println(sum);
	}
}