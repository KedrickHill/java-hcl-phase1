package filing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingMain 
{
    private static File txtFile;
    final static String QUESTION = "----------------------------------------------\n" +
                      "What do you want to add to your grocery list?\n" +
                      "----------------------------------------------\n";

    final static String REPLY = "\nThis is the stuff that will be going into the shopping list" +
                   "-Eggs\n-Milk\n-Oranges\n-Bacon\n";

    public static void main( String[] args ) throws IOException
    {
        // System.out.println( "Hello World!" );

        txtFile = new File("myTextFile.txt");
        FileWriter wr = new FileWriter(txtFile.getName());

        //TODO: Create and Read a File
        try {
            System.out.println("Creating File Named: " + txtFile.getName());

            if(txtFile.createNewFile()) {
                System.out.println("File Created ...");
            }
            else {
                System.out.println("File Already Exists.");
            }

            fileInfo(txtFile);
            writeToFile(txtFile);
            displayFileContents(txtFile);
            appendToFile(txtFile);
            txtFile.delete();
                      

        }
        catch (FileNotFoundException e1) {
            System.err.println("File Not Found.");

        }


    }

    public static void displayFileContents(File file) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String s;
            System.out.println("\nREADING FILE...");
            System.out.println("FILE CONTENTS: ");
            while((s = in.readLine()) != null) {
                System.out.println(s);
                }
                in.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        
    }

    public static void writeToFile(File file) {
        try {
            FileWriter wr = new FileWriter(file.getName());
            //TODO: write to a file
            System.out.println("\nWRITING TO: " + file.getName());
            System.out.println("WRITING...");
            wr.write(QUESTION);
            System.out.println("Succesfully wrote to " + file.getName() + " .");
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(File file) {
                //TODO: append to a file    

        try {
            FileWriter wr = new FileWriter(file.getName(), true);
            System.out.println("\nWRITING TO: " + file.getName());
            System.out.println("WRITING...");
            wr.write(REPLY);
            System.out.println("Succesfully wrote to " + file.getName() + " .");
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInfo(File file) {

        System.out.println("\nFile Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("Can Read:  " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());

    }

        
}
