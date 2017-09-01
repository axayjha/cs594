import java.util.*;
class comdLine
{
	public static void main(String args[])
	{
		int l=args.length;
		int invalid=0;
		int temp=0,i;
		for(i=0;i<l;i++)
		{
			try{
				temp=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				invalid++;
			}
		}

		if(l==0)
		System.out.println("no arguments provided");
		else
		{
			System.out.println("valid are :"+(l-invalid));
			System.out.println("invalid are :"+invalid);
		}
	}
}