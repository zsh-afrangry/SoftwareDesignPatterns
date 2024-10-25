package calculater;

// 除法 具体产品
public class DivProduct implements AbstructProduct {
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return a / b;
    }
}