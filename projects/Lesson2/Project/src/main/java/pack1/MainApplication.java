package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApplication {

    public static ArrayList<EmailID> employeeEmails = new ArrayList<EmailID>();

    public static void main(String[] args) {

        // opens a scanner for user input
        Scanner input = new Scanner(System.in);
        String in = "menu";

        // checks to see if the user has exited the cmd app
        while (!in.toLowerCase().equals("exit")) {

            // whenever input equals menu display menu
            if (in.toLowerCase().equals("menu")) {
                System.out.println("\nDo you want to ('Type me!'): \n-Add Emails ('Add')"
                        + "\n-Check Current Email IDs ('Check')" + "\n-Search Email IDs ('Search') \n-('Exit')");
                in = input.nextLine();
            }

            // whenever add is entered by the user then user can add emails to the list
            else if (in.toLowerCase().equals("add")) {

                System.out.println("\nAdd Employee Email ID or type ('done'): ");
                String email = input.nextLine();
                
                if (email.toLowerCase().equals("done")) {
                    in = "menu";
                }
                else if (!EmailID.isValid(email)) {
                    System.out.println("Invalid Email: enter again");
                }
                else{ // adds the email to the list of email IDs
                    String[] arrID = email.split("@", 2);
                    employeeEmails.add(new EmailID(arrID[0], arrID[1]));
                    Arrays.fill(arrID, null);

                }
        

                // check allows user to look at all the email IDs collected.
            } else if (in.toLowerCase().equals("check")) {
                    
                // List is empty
                if (employeeEmails.isEmpty()) {
                    System.out.println("\nThere are no emails.");
                    in = "menu";

                    // List not empty iterates through all emails and displays
                } else {
                    
                    System.out.println("\nCurrent Emails: ");
                    Iterator<EmailID> itr = employeeEmails.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next().displayEmail());
                    }
                    in = "menu";
                }
            }

            else if (in.toLowerCase().equals("search")) {
                 System.out.println("\nEnter an email to search or ('done'): ");
                //  Iterator<EmailID> iter = employeeEmails.iterator();
                 String matchStr = input.nextLine();
        
                    Pattern user = Pattern.compile(matchStr, Pattern.CASE_INSENSITIVE);

                    // Matcher mat = user.matcher(iter.next().displayEmail());
                    System.out.println("\nMatching Emails: ");
                    for (EmailID email : employeeEmails) {
                        Matcher mat = user.matcher(email.displayEmail());
                          if(mat.find()) {
                              System.out.println(email.displayEmail());
                           }
                        }
                        
                        System.out.println("\nSearch for another? (Y/N) ");

                        if(input.nextLine().toLowerCase().equals("y")) 
                            in = "search";
                        else 
                            in = "menu";
                     }
                    
                
    
             else {
                 System.out.println("\nInvalid Type! Please try again.");
                 in = "menu";
                }

        }

        input.close();
        // System.out.println("Add another email?");

        // String recip = "start";

        // while (!recip.equals("stop")) {
        // System.out.println("Enter a Recipient (to stop enter 'end'): ");
        // recip = input.nextLine();
        // to.add(recip);
        // }

        
        // System.out.println("UserName = " + employeeEmails.get(0).getUserName() +
        // "\nDomain = "
        // + employeeEmails.get(0).getDomain() + "\nFull Email = " +
        // employeeEmails.get(0).getUserName() + "@"
        // + employeeEmails.get(0).getDomain());

    }
}
