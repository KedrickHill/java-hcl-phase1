import Arithmetic.*;

public class arithmeticCalculator {

    // create variables that are unchangable and hold static flag that can be type casted later
    final static int A = 12;
    final static int B = -67;
    final static float C = 32.4f;
    final static float D = 76.43f;
    final static int Z = 0; 

    
        public static void main(String[] args) {

            // show simple add, sub, mult, and div methods
           arithmetic obj = new arithmetic();
            
            obj.add(C);
            obj.multiply(D);
            obj.divide(C, "hi"); // "num" is the only string that alters this - puts it as numerator
            obj.subtract(D, "hi"); // "first" is th only string that alters this - puts it as the leading value 
            obj.divide(D, "NUM"); // does not matter what Cases teh characters are - applies to subtract too
            obj.subtract(C, "FiRsT");

            // print the final result
            System.out.println(obj.getSum());

            // reset object
            obj.setSum(0);

            
            // type cast the ints to floats and vice versa to so ex/implicit casting
            float a = (float) A;
            float b = (float) B;
            float z = (float) Z;

            System.out.println("New a: " + a + " ; New b: " + b + "; New z: " + z); // 12.0 ; -67.0 ; 0.0

            // prove that these new ones work
            obj.multiply(a);
            obj.add(z);
            obj.subtract(b, "add");
            obj.multiply(D);
            obj.divide(b, "denom");
            obj.multiply(z);

            // print the result of the obj which should be : 0
            System.out.println("The sum of the obj: " + obj.getSum());

            // what happens when we divide by zero
            obj.add(C);
            obj.divide(z, "uh-oh"); // should spawn error message

            System.out.println("The sum of the obj: " + obj.getSum());


           
           

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
