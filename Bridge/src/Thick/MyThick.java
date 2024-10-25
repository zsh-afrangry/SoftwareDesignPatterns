package Thick;
import Color.MyColor;
import java.awt.*;

public abstract class MyThick {
    protected MyColor myColor;
    protected int Thickness;
    protected MyThick(MyColor mc, int thickness) {
        this.myColor = mc;
        this.Thickness = thickness;
    }

    public abstract void draw(Graphics g);
}
