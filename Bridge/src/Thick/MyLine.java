package Thick;
import java.awt.*;
import Color.MyColor;

public class MyLine extends MyThick {

    private int x1, y1, x2, y2;

    public MyLine(MyColor myColor, int thickness, int x1, int y1, int x2, int y2) {
        super(myColor, thickness);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw(Graphics g) {
        myColor.applyColor(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(Thickness));
        g2.drawLine(x1, y1, x2, y2);
    }
}