package Color;

import java.awt.*;

public class GreenColor implements MyColor {
    @Override
    public void applyColor(Graphics g) {
        g.setColor(Color.GREEN);
    }
    public Color getColor() {
        return Color.GREEN;
    }
}
