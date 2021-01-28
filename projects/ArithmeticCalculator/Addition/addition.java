package Addition;

public class addition {

    float sum;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public void add(float a, float b) {
        setSum(a + b);
    }
}
