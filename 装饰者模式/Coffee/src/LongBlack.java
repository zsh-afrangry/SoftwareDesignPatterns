// 具体组件B
public class LongBlack implements Coffee {
    @Override
    public String getType() {
        return "Long Black";
    }

    @Override
    public double getPrice() {
        return 6.0; // 基础价格为6元
    }
}
