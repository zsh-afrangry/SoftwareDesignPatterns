package calculater;

// 乘法 具体产品
public class MulProduct implements AbstructProduct {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}