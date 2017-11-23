package education;
import java.io.*;
public class assignment
{
	String subject1,date;
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter subject and date of submission");
		subject1=br.readLine();
		date=br.readLine();
	}
	public void display()
	{
		System.out.println("subject and date:");
		System.out.println(subject1);
		System.out.println(date);
	}
}