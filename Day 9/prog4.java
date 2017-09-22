import java.io.*;

class prog4{
    public static void main(String []args) throws IOException{
        String source = "This is a sample output text.";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        FileWriter f0 = new FileWriter("output0.txt");
        FileWriter f1 = new FileWriter("output1.txt");
        FileWriter f2 = new FileWriter("output2.txt");
        try  {
           for(int i=0; i<buffer.length; i+=2)
                f0.write(buffer[i]);
           f1.write(buffer);
           f2.write(buffer, buffer.length-buffer.length/4, buffer.length/4);
           f0.close();
           f1.close();
           f2.close();
        } catch (IOException e) {
                System.out.println("IO Error : " + e);
        }
    }
}