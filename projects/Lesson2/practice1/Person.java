import java.util.ArrayList;

/**
 * this is a simple constructor for a practice session with constructors
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    
public static void main(String[] args) {

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
}




    
}
