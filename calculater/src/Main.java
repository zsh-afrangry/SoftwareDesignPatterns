import Apperance.AbstractFactory_2;
import Apperance.ConcreteFactory;
import calculater.AbstructFactory;
import calculater.CalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstructFactory abstructFactory = new CalFactory(); // 实装 具体工厂
        AbstractFactory_2 abstractFactory2 = new ConcreteFactory();
        Client client = new Client(abstructFactory, abstractFactory2); //计算器
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                client.changeApp(1);
                Thread.sleep(1000);
                client.changeApp(2);
                Thread.sleep(1000);

                System.out.print("请输入第一个数字：");
                double a = scanner.nextDouble();

                System.out.print("请输入运算符：");
                String b = scanner.next();

                System.out.print("请输入第二个数字：");
                double c = scanner.nextDouble();

                double ans = client.calculate(a, c, b);
                System.out.println("计算结果为：" + ans);
                break;
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            } catch (UnsupportedOperationException e) {
                System.err.println(e.getMessage());
            } catch (Exception e){
                System.err.println("请输入正确的数字或字符！");
            }
        }
    }
}