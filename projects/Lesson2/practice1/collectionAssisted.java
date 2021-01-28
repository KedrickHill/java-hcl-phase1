import java.util.*;

/**
 * A practice class that contains collections Arraylist, vectors, linkedlists,
 * hashsets, and linked hashsets.
 */
public class collectionAssisted {
    // creating an arraylist
    public static void main(String[] args) {
        //creating arraylists
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
    }
}
