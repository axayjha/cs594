/*
OOP Lab: Day 3
Q3. WAP to demonstrate returning objects

Akshay Anand
CSE 5th Sem

*/

import java.math.*;
class coordinate
{	
    public int x,y;
    coordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
    }    

    int abscissa()
    {
        return x;
    }

    int ordinate()
    {
        return y;
    }
    public static void main(String args[])
	{	
        coordinate p1 = new coordinate(3,4);
        coordinate p2 = new coordinate(4,5);
        line line1 = new line(p1, p2);
        System.out.println(line1.firstPoint().abscissa());

	}
    
   
}

class line
{
    public coordinate p1, p2;
    line(coordinate p1, coordinate p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    coordinate firstPoint()
    {
        return p1;
    }
    coordinate secondPoint()
    {
        return p2;
    }

    
}