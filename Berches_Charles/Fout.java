import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Fout
{
	static Scanner sc, in;
	
    public static void main(String args[]) throws IOException
    {
    	sc = new Scanner(System.in);
    	System.out.print("File Name: ");
    	in  = new Scanner(new File(sc.next() + ".cnmb"));
    	System.out.print(in.next());  
    }
 
}
