/*
OOP Lab: Day 3
Q2. WAP to demonstrate method constructor overloading

Akshay Anand
CSE 5th Sem

*/
import java.math.*;
class temperature
{	

    public float temp;
    temperature(float val)
    {
        temp= val;
    }

    temperature(String val)
    {
        temp = Float.parseFloat(val);
    }

    void display()
    {
         System.out.println(temp);
    }

    public static void main(String args[])
	{	
        temperature t1= new temperature(3);
        temperature t2 = new temperature("3");
        t1.display();
        t2.display();
	}
}