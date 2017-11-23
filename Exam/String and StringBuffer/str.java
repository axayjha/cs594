// Credits: Ananya Das
import java.io.*;
class str
{
	public static void main(String args[]) throws IOException
	{
		/*System.out.println("Enter a string: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();*/

		String s = "In literary theory, a text is any object that can be read, whether this object is work of literature, a street sign, an arrangement of buildings on a city block, or styles of clothing && It is a coherent set of signs that transmits some kind of informative message.";
	
		//UpperCase
		System.out.println(s.toUpperCase());
		System.out.println();
	
		//LowerCase
		System.out.println(s.toLowerCase());
		System.out.println();

		//No. of words
		int words=0,i;
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i))==' ')
			words++;
		}
		System.out.println("Words : "+(words+1));
		System.out.println();
	
		//No. of characters
		int characters=s.length();
		System.out.println("Characters: "+characters);
		System.out.println();

		//Vowel and consonant
		int vowel=0,cons=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			vowel++;
			else
			cons++;	
		}
		System.out.println("Vowels: "+vowel+", Consonant: "+cons);
		System.out.println();

		//Finding occurences
		int pos=s.indexOf("&&");
		System.out.println("Location of &&: "+pos);
		System.out.println();
		pos=s.indexOf("the");
		System.out.println("Location of THE: "+pos);
		System.out.println();

		//Replacing
		String mod="";
		mod=s.substring(0,9);
		mod+="abcdef";
		mod+=s.substring(16);
		System.out.println(mod);	
		System.out.println();

		//Position of first character of second word
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.println("Position of 1st chararcter of 2nd word: "+(i+1));
				System.out.println();
				break;
			}
		}

		//Check presence of "formative"
		pos=s.indexOf("formative");
		System.out.println("Substring formative is present at index: "+pos);	
		System.out.println();

		//Finding words starting with I
		if(s.charAt(0) == 'i' || s.charAt(0)=='I')
		System.out.println(s.substring(0,s.indexOf(' ')));
		for(i=1;i<s.length();i++)
		{
			if(s.charAt(i-1)==' ' && (s.charAt(i)=='i' || s.charAt(i)=='I'))
			System.out.println(s.substring(i,s.indexOf(' ',i)));
		}

		//Concat of
		String s1=s,s2;
		int ind;
		for(i=0;i<s.length();i++)
		{
			ind=s1.indexOf("of",i);
			if(ind!=-1)
			{
				s2=s1.substring(ind+3);
				s1=s1.substring(0,ind-1);
				s1+=s2;
			}
			else
			break;
		}
		System.out.println(s1);

		//Delete spaces
		s1=s;
		for(i=0;i<s.length();i++)
		{
			ind=s1.indexOf(' ',i);
			if(ind!=-1)
			{
				s2=s1.substring(ind+1);
				s1=s1.substring(0,ind);
				s1+=s2;
			}
			else
			break;
		}
		System.out.println(s1);
	}
}
			
		
		
