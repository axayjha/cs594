package education;
import java.io.*;
public class exam
{
	String subject;
	int marks;
	void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter subjects and marks");
		subject=br.readLine();
		marks=Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("subject and marks:");
		System.out.println(subject);
		System.out.println(marks);
	}
}
	