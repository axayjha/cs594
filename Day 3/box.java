/*
OOP Lab: Day 3

Q4. Create a class named box which has height, length
and breadth. Calculate surface area and volume of the box.
Use this operator to access attributes.

Akshay Anand
CSE 5th Sem

*/
class box
{
    int h, l, b;
    box(int h, int l, int b)
    {
        this.h = h;
        this.l = l;
        this.b = b;
    }

    int area()
    {
        return 2*(l*b + b*h + l*h);
    }

    int volume()
    {
        return l*b*h;
    }

    public static void main(String args[])
    {
        box b1 = new box(3,4,5);
        System.out.println("Area = "+ b1.area());
        System.out.println("Volume = "+ b1.volume());
    }
}
