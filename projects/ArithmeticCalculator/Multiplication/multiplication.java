package Multiplication;

public class multiplication {
    
    float sum;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public void multiply(float a, float b) {
        setSum(a*b);
    }
}
