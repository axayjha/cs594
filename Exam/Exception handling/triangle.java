import java.io.*;
class TriangleException extends Exception
{
	public String toString()
	{
		return "Mismatch of sides of triangle";
	}
}
class triangle
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			int side[]=new int[3];
			System.out.println("Enter the sides of the triangle: ");
			for(int i=0;i<3;i++)
			{	
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String a=br.readLine();
				side[i]=Integer.parseInt(a);
			}
			if((side[0]+side[1]<=side[2]) || (side[0]+side[2]<=side[1]) || (side[2]+side[1]<=side[0])) 
			throw new TriangleException();
			else
			{
				double s=(double)(side[0]+side[1]+side[2])/2;
				double area= Math.sqrt(s*(s-side[0])*(s-side[1])*(s-side[2]));
				System.out.println("Area of the triangle: "+area);
			}
		}
		catch(TriangleException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)	
		{
			System.out.println("Input is not a number");
		}
	}
}
