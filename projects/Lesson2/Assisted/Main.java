import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        
    // Using Methods class example

    Methods obj = new Methods();

    double floatDouble = (double) obj.getMyFloat();

    System.out.println("The added doubles equal: " + obj.add(obj.getMyDouble(), floatDouble));

    /**
     * showing the use of a constructor with one object
     */
    Person Mary = new Person("Mary", "Little");
    
    System.out.println("Mary's Last Name is: " + Mary.getLastName());


    /**
     * Showing the use of a constructor using multiple object in an arraylist
     */

     ArrayList<Person> people = new ArrayList<>();

     people.add(new Person("Mary", "Little", 49));
     people.add(new Person("Brock", "Manson", 25));
     people.add(new Person("DeAnn", "Clawson", 87));
     people.add(new Person("Leonard", "Gundstrom", 31));

     System.out.println("First name of all people in this list: ");
     for (Person person : people) {
         System.out.println(person.getFirstName());
     }
     System.out.println();

     System.out.println("Last name of all people in this list: ");
     for (Person person : people) {
         System.out.println(person.getLastName());

    }


    System.out.println("ArrayList: ");
        ArrayList<String> city = new ArrayList<String>();
        city.add("Bangalore");
        city.add("Delhi");
        System.out.println(city);

        //creating a vector
        System.out.println("\nVector: ");
        Vector<Integer> vec = new Vector<Integer>();
        vec.addElement(15);
        vec.addElement(30);
        System.out.println(vec);

        //creating LinkedList  
        System.out.println("\nLinkedList: ");
        LinkedList<String> names = new LinkedList<String>();
        names.add("Alex");
        names.add("John");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //creating Hashsets
        System.out.println("\nHashSet:");
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(101);
        set.add(103); 
        set.add(102);
        set.add(104);
        System.out.println(set);

        //creating linkedhashset
        System.out.println("\nLinkedHashSet:");
        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(11);
        set2.add(13);
        set2.add(12);
        set2.add(14);
        System.out.println(set2 + "\n");


        System.out.println("Hello World");

        //creating a hashmap
        ArrayList<HashMap<String, String>> student = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hash = new HashMap<String, String>();
        
        hash.put("Name", "Tim");
        hash.put("Address", "123 Main Street");
        hash.put("City", "San Antonio");
        hash.put("State", "TX");

        student.add(hash);
               
        System.out.println(student.get(0));

        hash.clear();
        hash.put("Name", "Cass");
        hash.put("Address", "456 Side Avenue");
        hash.put("City", "St.Louis");
        hash.put("State", "MO");
        student.add(hash);


        System.out.println(student.get(1));

        System.out.println("Values: " + hash.values() + "\nKeys: " + hash.keySet());


        /**
         * USING INNER CLASS EXAMPLES
         */

         InnerClass innerClass = new InnerClass("test1");
         System.out.println(innerClass.useMyInnerClass());
    }
    
}
