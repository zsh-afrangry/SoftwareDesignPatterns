// Main.java
public class Main {
    public static void main(String[] args) {
        // 创建一杯Short Black
        Coffee shortBlack = new ShortBlack();
        System.out.println(shortBlack.getType() + "价格：" + shortBlack.getPrice() + "元");

        // 给Short Black加牛奶和糖
        Coffee shortBlackWithMilk = new Milk(shortBlack);
        Coffee shortBlackWithMilkAndSugar = new Sugar(shortBlackWithMilk);
        System.out.println(shortBlackWithMilkAndSugar.getType() + "价格：" + shortBlackWithMilkAndSugar.getPrice() + "元");

        // 创建一杯Long Black
        Coffee longBlack = new LongBlack();
        System.out.println(longBlack.getType() + "价格：" + longBlack.getPrice() + "元");

        // 给Long Black加巧克力
        Coffee longBlackWithChocolate = new Chocolate(longBlack);
        System.out.println(longBlackWithChocolate.getType() + "价格：" + longBlackWithChocolate.getPrice() + "元");

        // 给Long Black加牛奶、糖和巧克力
        Coffee longBlackWithAll = new Milk(new Sugar(new Chocolate(longBlack)));
        System.out.println(longBlackWithAll.getType() + "价格：" + longBlackWithAll.getPrice() + "元");
    }
}
