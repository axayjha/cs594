//Credits: Shreya Sil
import education.exam;
import education.assignment;
import admission.stud_details;
import admission.library;
import java.io.*;
class student
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		exam e=new exam();
		assignment as=new assignment();
		stud_details sd=new stud_details();
		library l=new library();
		int c;
		do
		{
			System.out.println("1.display marks 2.assignment submission details 3.student details 4.library books details 0.exit");
			System.out.println("enter choice");
			c=Integer.parseInt(br.readLine());
			switch(c)
			{
				case 1:
				e.input();
				e.display();
				break;
				case 2:
				as.input();
				as.display();
				break;
				case 3:
				sd.input();
				sd.display();
				break;
				case 4:
				l.input();
				l.display();
				break;
			}
		}while(c!=0);
	}
}
		
