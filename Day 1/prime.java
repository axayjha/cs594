/*
OOP Lab: Day 4
Q4. WAP to check if a number is prime

Akshay Anand
CSE 5th Sem

*/
import java.math.*;
class prime
{	public static void main(String args[])
	{	
		int x=9;
        double sqroot = Math.sqrt(x);
        for(int i=2; i<=sqroot; i++)
        {
           if(x%i ==0 )
           {
                System.out.println("Not a prime");
                return;
           }
        }
        System.out.println("Prime!");
        
	}
}