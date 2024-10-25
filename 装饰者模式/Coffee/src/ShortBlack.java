// 具体组件A
public class ShortBlack implements Coffee{
    public String getType() {
        return "Short Black";
    }

    @Override
    public double getPrice() {
        return 5.0; // 基础价格为5元
    }
}
