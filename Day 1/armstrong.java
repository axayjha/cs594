/*
OOP Lab: Day 1
Q7. WAP to check if a number is an armstrong number

Akshay Anand
CSE 5th Sem

*/

import java.math.*;
class armstrong
{	public static void main(String args[])
	{	
        int sum=0;
		int x=153;
        int y=x;
        while(x!=0)
        {
            sum += Math.pow(x%10, 3);
            x=x/10;
        }
        if(y==sum)
            System.out.println("Armstrong!");
        else
            System.out.println("Not Armstrong");
	}
}