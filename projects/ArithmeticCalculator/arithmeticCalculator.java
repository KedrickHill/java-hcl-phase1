import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arithmeticCalculator {

    /** TODO: create a method that orders the list by contents 
     *  - pemdas: reorders the list to do the math according to pendas rules
     **/ 

    /** TODO: create a method that does the operation 
     *  - add, subtract, multiply, divide each should take two variables
     *  - should be able to figure out the correct var type
     *  
     * 
     *  - Figure out how to allow input to take any variable type and convert
     *     them appropriately
     *  - */ 
    
        public static void main(String[] args) {
    //  List<String> oper = new ArrayList<>();

    // Open a scanner to take in user input
     Scanner in = new Scanner(System.in);

     // Ask for the input from the user for the operation
     System.out.println("Enter the operation: ");
     String input = in.nextLine();

     // Split the operation can be sparsed through
     String[] op = input.split("([+-x/ ])");  
     //TODO: figure out why the split is not working corretly

     // Prints the splitted array to check its contents
     for (String string : op) {
         System.out.println("The Array: " + string);
     }

     // convert array to list so that it displayed and used easier
     List<String> operation = Arrays.asList(op);
     in.close();
                
     // print to confirm the operation is seperated correctly
     System.out.println("The List contains: " + operation);

    }
}
