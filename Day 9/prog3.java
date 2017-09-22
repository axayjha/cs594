import java.io.*;

class prog3{
    public static void main(String []args) throws IOException{
        FileReader fr = new FileReader("input.txt");
        try  {
            int c;
            while((c=fr.read())!= -1)
                System.out.println((char)c);
        } catch (IOException e) {
                System.out.println("IO Error : " + e);
        }
    }
}