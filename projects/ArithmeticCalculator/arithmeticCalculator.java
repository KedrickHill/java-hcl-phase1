import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arithmeticCalculator {
    public static void main(String[] args) {
    //  List<String> oper = new ArrayList<>();
     Scanner in = new Scanner(System.in);

     System.out.println("Enter the operation: ");
     String input = in.nextLine();

     String[] op = input.split("([+-x/ ])");

     for (String string : op) {
         System.out.println("The Array: " + string);
     }

     List<String> operation = Arrays.asList(op);
     in.close();
                
     System.out.println("The List contains: " + operation);

    }
}
