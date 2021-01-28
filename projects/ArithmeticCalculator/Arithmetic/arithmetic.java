package Arithmetic;

import java.util.Optional;

public class arithmetic {

    float sum = 0;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

/**
 * add - adds a numeric value to the sum
 * @param a - numeric value that is added to the sum
 */
    public void add(float a) {
        setSum(getSum() + a);
    }

/**
 * divide - divides either by numerator or denominator unless divided by 0 which throws exception
 * @param a - numeric numerator or denominator
 * @param s - string case for numerator position
 * @throws ArithmeticException
 */
    public void divide(float a, String s) throws ArithmeticException {
        if (getSum() == 0) {
            setSum(1);
        }
        if (a == 0) {
            System.err.println("ERROR: Cannot divide by 0");
        }
        else {
            if (s.toLowerCase().equals("num")) { 
                setSum(a/getSum());
            }
            else {
                setSum(getSum()/a);
            }
            
        }
        
    }

/**
 * multiply - multiplies a numeric value to the sum.
 * @param a - numeric value that is multiplied to the sum
 */
    public void multiply(float a) {
        if (getSum() == 0) {
            setSum(1);
        }
        setSum(getSum() * a);
    }


    /**
     * subtract - subtracts a variable from the current sum
     * @param a - numeric value that is added
     * @param s - string case to check if the user wants it first (optional)
     */
    public void subtract(float a, String s) {
        if (s.toLowerCase().equals("first")) {
            setSum(a - getSum());
        }
        else {
            setSum(getSum() - a);
        }
        
    }
}
