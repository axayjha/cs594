package admission;
import java.io.*;
public class stud_details
{
	String name,dept,dob;
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter student name,dept,DoB");
		name=br.readLine();
		dept=br.readLine();
		dob=br.readLine();
	}
	public void display()
	{
		System.out.println("student name, dept, DoB:");
		System.out.println(name);
		System.out.println(dept);
		System.out.println(dob);
	}
}
