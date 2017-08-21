/*
OOP Lab: Day 1
Q5.(iii) WAP to display the following pattern:
    
          *
        * * *
      * * * * *
    * * * * * * *

Akshay Anand
CSE 5th Sem

*/

class pattern3
{	public static void main(String args[])
	{	
		int x=5;
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<x-i; j++)
                System.out.print(" ");
            for(int j=0; j<=i; j++)
                System.out.print("*");
            for(int j=0; j<i; j++)
                System.out.print("*");    
            System.out.println();
        }
        
	}
}