// AbstractDecorator.java
public abstract class AbstractDecorator implements Coffee {
    protected Coffee coffee; // 持有一个Coffee类型的引用

    public AbstractDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getType() {
        return coffee.getType();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}
