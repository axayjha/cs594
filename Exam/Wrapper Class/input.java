import java.io.*;

public class input{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = br.readLine();
		System.out.println("Hello "+ name);
	}
}