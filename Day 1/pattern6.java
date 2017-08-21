/*
OOP Lab: Day 1
Q6.(iii) WAP to display the following pattern:

    1
    2 2
    3 3 3 
    4 4 4 4

Akshay Anand
CSE 5th Sem

*/

class pattern6
{	public static void main(String args[])
	{	
		int x=5;
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print(i+1 + " ");
            System.out.println();
        }
        
	}
}