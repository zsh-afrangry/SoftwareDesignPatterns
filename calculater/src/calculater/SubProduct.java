package calculater;

// 减法 具体产品
public class SubProduct implements AbstructProduct {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}