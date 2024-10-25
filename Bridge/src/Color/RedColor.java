package Color;
import java.awt.Color;
import java.awt.Graphics;

public class RedColor implements MyColor {
    @Override
    public void applyColor(Graphics g) {
        g.setColor(Color.RED);
    }
    public Color getColor() {
        return Color.RED;
    }
}
