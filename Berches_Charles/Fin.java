import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Fin
{
	static Scanner sc;
	
    public static void main(String args[]) throws IOException
    {
    	sc = new Scanner(System.in);
    	
    	System.out.print("File Name: ");
    	
    	FileWriter fw = new FileWriter(sc.next() + ".cnmb");  
    	System.out.print("Write text here: ");  
       	fw.write(sc.next());    
      	fw.close();  
    }
 
}