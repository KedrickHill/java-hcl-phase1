package filing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class FileHandlingMain 
{
    private static File txtFile;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        txtFile = new File("filing", "myTextFile.txt");

        String msg = "This is the stuff that will be going into the shopping list" +
                    "-Eggs\n-Milk\n-Oranges\n-Bacon\n";

        //TODO: Read a file
        try {
            BufferedReader in = new BufferedReader(new FileReader(txtFile));
            String s = in.readLine();
            while(s != null) {
                System.out.println("READ: " + s);
                s = in.readLine();
            }
        } 
        catch (FileNotFoundException e1) {
            System.err.println("File not found: " + txtFile.getName());
        } 
        catch (IOException e2) {
            e2.printStackTrace();
        }
        finally{
            in.close();
        }
        
        //TODO: write to a file
        //TODO: append to a file



       
    }
}
