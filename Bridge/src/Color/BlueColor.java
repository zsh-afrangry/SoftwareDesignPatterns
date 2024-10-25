package Color;
import java.awt.Graphics;
import java.awt.Color;

public class BlueColor implements MyColor {
    @Override
    public void applyColor(Graphics g) {
        g.setColor(Color.BLUE);
    }
    public Color getColor() {
        return Color.BLUE;
    }
}
