import java.io.*;
class InvalidTriangleException extends Exception 
{
	private String detail;
	InvalidTriangleException(String a)
	{
		detail = a;
	}
	public String toString()
	{
		return "InvalidTriangleException: [ "+ detail + " ]";
	}
}

class prog2{
	public static void main(String []args) throws IOException, InvalidTriangleException{
		double a=0.0, b=0.0, c=0.0;
		System.out.println("Enter the values of sides of triangle: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		String []arr = S.split(" ");

		try{
			a=Double.parseDouble(arr[0]);
			b=Double.parseDouble(arr[1]);
			c=Double.parseDouble(arr[2]);
		}
		catch( NumberFormatException e){
			System.out.println("Enter a valid number!");
		}

		if(!(a+b>c && b+c>a && a+c>b)){
			throw new InvalidTriangleException("Dimensions provided won't form a triangle.");
		}
		System.out.println(a+" "+b + " "+c);
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("Area of the triangle: " + area);


	}
}