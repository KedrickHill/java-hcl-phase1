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
            obj.divide(D, "NUM"); // does not matter what Cases the characters are - applies to subtract too
            obj.subtract(C, "FiRsT");

            // print the final result
            System.out.println("The sum of the obj is: " + obj.getSum());

            // reset object
            obj.setSum(0);

            
            // type cast the ints to floats and vice versa to so ex/implicit casting
            float a = (float) A;
            float b = (float) B;
            float z = (float) Z;

            System.out.println("\nNew a: " + a + " ; New b: " + b + "; New z: " + z); // 12.0 ; -67.0 ; 0.0

            // prove that these new ones work
            obj.multiply(a);
            obj.add(z);
            obj.subtract(b, "add");
            obj.multiply(D);
            obj.divide(b, "denom");
            obj.multiply(z);

            // print the result of the obj which should be : 0
            System.out.println("\nThe sum of the obj: " + obj.getSum() + "\n");

            // what happens when we divide by zero
            obj.add(C);
            obj.divide(z, "uh-oh"); // should spawn error message

            System.out.println("\nThe sum of the obj: " + obj.getSum());


           // using a loop
           obj.setSum(0);

           // does the equation: 10!
           for (int i = 10; i > 0; i--) {
               obj.multiply(i);            
           }
           System.out.println("\n10! =  " + obj.getSum());
           

           // reset and do the equation: summation 56

           obj.setSum(0);

           for (int i = 1; i < 56; i++) {
               obj.add(i);
           }

           System.out.println("\nThe summation of all values between [1-56] = " + obj.getSum() + "\n");

    }
}
