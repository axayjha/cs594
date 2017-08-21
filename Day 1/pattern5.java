/*
OOP Lab: Day 1
Q6.(ii) WAP to display the following pattern:

          1
        1 2
      1 2 3 
    1 2 3 4

Akshay Anand
CSE 5th Sem

*/

class pattern5
{	public static void main(String args[])
	{	
		int x=5;
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<x-i; j++)
                System.out.print("  ");
            for(int j=0; j<=i; j++)
                System.out.print(j+1 + " ");    
            System.out.println();
        }
        
	}
}