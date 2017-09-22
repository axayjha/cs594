import java.io.*;


class InvalidInputException extends Exception 
{
	private String detail;
	InvalidInputException(String a)
	{
		detail = a;
	}
	public String toString()
	{
		return "InvalidInputException: [ "+ detail + " ]";
	}
}


class prog1
{
	public static void main(String []args) throws IOException, InvalidInputException
	{ 
		int n=0, sum=0;
		System.out.println("Enter the value of n:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		try{
			n = Integer.parseInt(s);
		}
		catch( NumberFormatException e)
		{
			System.out.println("Enter a valid integer value!");			
		}

		if(n<=0)
		{
			throw new InvalidInputException("Value of n should be greater than 0!");
		}

		int []array = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++)
		{
			s = br.readLine();
			try{
				array[i] = Integer.parseInt(s);
			}
			catch( NumberFormatException e)
			{
				System.out.println("Enter a valid integer value!");			
			}
		}

		for(int i=0; i<n; i++)
			sum+=array[i];

		double average = (double)sum/n;

		System.out.println("Average= " + average);



	}

}