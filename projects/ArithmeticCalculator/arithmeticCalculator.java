import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.xml.ws.soap.AddressingFeature;

import Addition.*;
import Division.*;
import Multiplication.*;
import Subtraction.*;

public class arithmeticCalculator {

    // create variables that are unchangable and hold static flag that can be type casted later
    final static int A = 12;
    final static int B = -67;
    final static float C = 32.4f;
    final static float D = 76.43f;
    final static int Z = 0; 

    /**
     * TODO: type casting
     */

        public static void main(String[] args) {

            // show simple add, sub, mult, and div methods
            addition Oa = new addition();
            subtraction Os = new subtraction();
            multiplication Om = new multiplication();
            division Od = new division();
            
            Oa.add(C,D);
            System.out.println("The sum of C + D = " + Oa.getSum());

            Os.subtract(C, D);
            System.out.println("The sum of C - D = " + Os.getSum());

            Om.multiply(C, D);
            System.out.println("The sum of C x D = " + Om.getSum());

            Od.divide(C, D);
            System.out.println("The sum of C / D = " + Od.getSum());

            // type cast the ints to floats and vice versa to so ex/implicit casting

            float a = (float) A;
            float b = (float) B;
            float z = (float) Z;






           
           

            //
            

    // //  List<String> oper = new ArrayList<>();

    // // Open a scanner to take in user input
    //  Scanner in = new Scanner(System.in);

    //  // Ask for the input from the user for the operation
    //  System.out.println("Enter the operation: ");
    //  String input = in.nextLine();

    //  // Split the operation can be sparsed through
    //  String[] op = input.split("([+-x/ ])");  
    //  //TODO: figure out why the split is not working corretly

    //  // Prints the splitted array to check its contents
    //  for (String string : op) {
    //      System.out.println("The Array: " + string);
    //  }

    //  // convert array to list so that it displayed and used easier
    //  List<String> operation = Arrays.asList(op);
    //  in.close();
                
    //  // print to confirm the operation is seperated correctly
    //  System.out.println("The List contains: " + operation);

    }
}
