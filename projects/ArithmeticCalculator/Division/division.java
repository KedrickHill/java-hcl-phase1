package Division;

public class division {
    
    float sum;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public void divide(float a, float b) throws ArithmeticException {
        if (a == 0 || b == 0) {
            System.err.println("Cannot divide by 0");
        }
        else {
            setSum(a/b);
        }
        
    }
}
