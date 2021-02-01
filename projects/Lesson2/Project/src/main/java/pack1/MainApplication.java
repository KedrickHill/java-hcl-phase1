import java.util.ArrayList;
import java.util.Scanner;


public class MainApplication {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.println("Who is sending the Email? ");
    String from = input.nextLine();

    ArrayList<String> to = new ArrayList<String>();
    
    String recip = "start";

    while (!recip.equals("end")) {
        System.out.println("Enter a Recipient (to stop enter 'end'): ");
        recip = input.nextLine();
        to.add(recip)
    }
     

    System.out.println("From: " + from + "\nTo: " + to );

    }
}
