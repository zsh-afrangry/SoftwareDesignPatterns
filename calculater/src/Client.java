import Apperance.AbstractFactory_2;
import Apperance.AbstractProduct_2;
import calculater.AbstructFactory;
import calculater.AbstructProduct;

// 计算器
public class Client {
    private AbstructFactory abstructFactory;
    private AbstractFactory_2 abstractFactory2;

    public Client(AbstructFactory abstructFactory, AbstractFactory_2 abstractFactory2){
        this.abstructFactory = abstructFactory;
        this.abstractFactory2 = abstractFactory2;
    }

    public double calculate(double a, double b, String operator){
        AbstructProduct abstructProduct = abstructFactory.createProduct(operator);
        return abstructProduct.execute(a,b);
    }

    public void changeApp(int id){
        AbstractProduct_2 abs = abstractFactory2.createAppearance(id);
        abs.show();
    }
}
