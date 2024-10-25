// Chocolate.java
public class Chocolate extends AbstractDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getType() {
        return coffee.getType() + ", Chocolate";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 2.0; // 巧克力价格2.0元
    }
}
