/*
OOP Lab: Day 1
Q1. WAP to find to the sum of the following series:
1+ x + x^2 + x^3 + ..... upto 30 terms

Akshay Anand
CSE 5th Sem

*/

class sum
{	public static void main(String args[])
	{	
		float x=1;
        float sum=0;
        for(int i=0; i<30; i++)
        {
            float temp=1;
            for(int j=0; j<i; j++)
            {
                temp = temp*x;
            }
            sum+=temp;
        }
        System.out.println(sum);
	}
}