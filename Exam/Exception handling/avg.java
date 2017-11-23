import java.io.*;
class MyException extends Exception
{
	public String toString()
	{
		return "n is invalid";
	}
}
class avg
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			System.out.println("Enter the value of n: ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String a=br.readLine();
			int n=Integer.parseInt(a);
			if(n<=0)
			throw new MyException();
			else
			{
				try
				{
					int sum=0;
					int arr[]=new int[20];
					System.out.println("Enter the numbers");
					for(int i=0;i<n;i++)
					{
						BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
						String a1=br1.readLine();
						arr[i]=Integer.parseInt(a1);
						sum+=arr[i];
					}
					int average=sum/n;
					System.out.println("Average is "+average);
				}
				catch(NumberFormatException e)	
				{
					System.out.println("Input is not a number");
				}
			}	
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input is not a number");
		}
	}
}