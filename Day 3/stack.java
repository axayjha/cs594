/*
OOP Lab: Day 3
Q1. WAP to create a stack of 20 ints

Akshay Anand
CSE 5th Sem

*/
import java.math.*;
class stack
{	
    int max=20;
    int arr[] = new int[max];
    static int top=-1;

    public void set(int pos, int data)
    {
        arr[pos] = data;
    }

    public int pop()
    {
        if (top<0)
        {
            System.out.println("Stack underflow!");
            return -99999;
        }

        return arr[top--];
    }

    public void push(int x)
    {
        if(top==max)
        {
             System.out.println("Stack overflow!");
             return;
        }
        arr[++top] = x;
    }

    public static void main(String args[])
	{	
        stack st1 = new stack();
        st1.top = 0;
        st1.push(4);
        st1.push(3);
		System.out.println( st1.pop());
        System.out.println( st1.pop());
	}
}