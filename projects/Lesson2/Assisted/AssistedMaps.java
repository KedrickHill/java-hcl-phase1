import java.util.HashMap;
import java.util.jar.Attributes.Name;
import java.util.ArrayList;

public class AssistedMaps {
    public static void main(String[] args) {
        
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

    }
}
