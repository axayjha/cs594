/*
OOP Lab: Day 1
Q3. WAP to find the sum of digits of a number

Akshay Anand
CSE 5th Sem

*/

class sumofdigits
{	public static void main(String args[])
	{	
        int sum=0;
		int x=12345;
        while(x!=0)
        {
            sum += x%10;
            x=x/10;
        }
        System.out.println(sum);
	}
}