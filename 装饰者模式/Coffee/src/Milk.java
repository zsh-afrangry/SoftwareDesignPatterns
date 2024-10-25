// Milk.java
public class Milk extends AbstractDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getType() {
        return coffee.getType() + ", Milk";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 1.5; // 牛奶价格1.5元
    }
}
