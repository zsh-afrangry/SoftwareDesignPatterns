package calculater;

//这是具体工厂
public class CalFactory implements AbstructFactory {
    public AbstructProduct createProduct(String Operator){
        switch (Operator){
            case "+":
                return new AddProduct();
            case "-":
                return new SubProduct();
            case "*":
                return new MulProduct();
            case "/":
                return new DivProduct();
            default:
                throw new UnsupportedOperationException("不支持的运算符: " + Operator);
        }
    }
}
