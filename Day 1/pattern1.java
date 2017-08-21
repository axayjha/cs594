/*
OOP Lab: Day 1
Q5.(i) WAP to display the following pattern:

    *
    * *
    * * *
    * * * *

Akshay Anand
CSE 5th Sem

*/
class pattern1
{	public static void main(String args[])
	{	
		int x=5;
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
	}
}