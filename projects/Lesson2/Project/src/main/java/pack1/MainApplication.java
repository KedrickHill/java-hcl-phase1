package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MainApplication {

    private static ArrayList<EmailID> employeeEmails = new ArrayList<EmailID>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to ('Type me!'): \n-Add Emails ('Add')" + "\n-Check Current Email IDs ('Check')"
                + "\n-Search Email IDs ('Search') \n-('Exit')");
        String in = input.nextLine();

        while (!in.toLowerCase().equals("exit")) {

            if (in.toLowerCase().equals("menu")) {
                System.out.println("\nDo you want to ('Type me!'): \n-Add Emails ('Add')"
                        + "\n-Check Current Email IDs ('Check')" + "\n-Search Email IDs ('Search') \n-('Exit')");
                in = input.nextLine();
            }

            else if (in.toLowerCase().equals("add")) {

                System.out.println("\nAdd Employee Email ID or ('type') to change: ");
                String email = input.nextLine();
                if (!email.contains("@")) {
                    in = email.toLowerCase();
                } else {

                    String[] arrID = email.split("@", 2);

                    while (arrID[1].contains("@")) {
                        System.out.println("\nInvalid Email please enter another");
                        email = input.nextLine();
                        Arrays.fill(arrID, null);
                        arrID = email.split("@", 2);
                    }

                    employeeEmails.add(new EmailID(arrID[0], arrID[1]));
                }

            } else if (in.toLowerCase().equals("check")) {

                if (employeeEmails.isEmpty()) {
                    System.out.println("\nThere are no emails.");
                    in = "menu";
                } else {
                    Iterator<EmailID> itr = employeeEmails.iterator();
                    System.out.println("\nCurrent Emails: ");
                    while (itr.hasNext()) {
                        System.out.println(itr.next().displayEmail());
                    }
                    in = "menu";
                }

            }

            else if (in.toLowerCase().equals("search")) {
                Iterator<EmailID> iter = employeeEmails.iterator();
                System.out.println("");
            }

            else {
                System.out.println("\nInvalid Type! Please try again.");
            }

        }

        // System.out.println("Add another email?");

        // String recip = "start";

        // while (!recip.equals("stop")) {
        // System.out.println("Enter a Recipient (to stop enter 'end'): ");
        // recip = input.nextLine();
        // to.add(recip);
        // }

        input.close();
        // System.out.println("UserName = " + employeeEmails.get(0).getUserName() +
        // "\nDomain = "
        // + employeeEmails.get(0).getDomain() + "\nFull Email = " +
        // employeeEmails.get(0).getUserName() + "@"
        // + employeeEmails.get(0).getDomain());

    }
}
