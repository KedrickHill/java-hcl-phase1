/**
 * A Simple methods class that demonstrates the work of methods
 */
public class Methods {


    double myDouble = 4.0;
    float myFloat = 6.0f;

    public double getMyDouble() {
        return myDouble;
    }

    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }

    public float getMyFloat() {
        return myFloat;
    }

    public void setMyFloat(float myFloat) {
        this.myFloat = myFloat;
    }

    public double add(double a, double b) { return a+b; }
    
    public static void main(String[] args) {

        Methods obj = new Methods();

        double floatDouble = (double) obj.getMyFloat();

        System.out.println("The added doubles equal: " + obj.add(obj.getMyDouble(), floatDouble));
    }
}
