package admission;
import java.io.*;
public class library
{
	String returndate[]=new String[5];
	String issuedate[]=new String[5];
	String books[]=new String[5];
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("enter name of books,issue date,return date");
			books[i]=br.readLine();
			issuedate[i]=br.readLine();
			returndate[i]=br.readLine();
		}
	}
	public void display()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("name of books,issue date,return date:");
			System.out.println(books[i]);
			System.out.println(issuedate[i]);
			System.out.println(returndate[i]);
		}
	}
}