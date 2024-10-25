package Apperance;

public class ConcreteFactory implements AbstractFactory_2 {
    @Override
    public AbstractProduct_2 createAppearance(int id) {
        if (id == 1){
            return new ConcreteProduct_1();
        }
        else {
            return new ConcreteProduct_2();
        }
    }
}
