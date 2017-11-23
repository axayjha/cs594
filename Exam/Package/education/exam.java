package education;
import java.io.*;
public class exam
{
	String s;
	int m;
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter subjects and marks");
		s=br.readLine();
		m=Integer.parseInt(br.readLine());
	}
	public void display()
	{
		System.out.println("subject and marks:");
		System.out.println(s);
		System.out.println(m);
	}
}
	