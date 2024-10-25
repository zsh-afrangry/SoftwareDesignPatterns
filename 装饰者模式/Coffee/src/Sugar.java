// Sugar.java
public class Sugar extends AbstractDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getType() {
        return coffee.getType() + ", Sugar";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.5; // 糖价格0.5元
    }
}
