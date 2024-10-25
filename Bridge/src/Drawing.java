import Thick.MyLine;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import Color.*;

public class Drawing extends JPanel {
    private List<MyLine> myLines = new ArrayList<>();
    private MyLine currentLine;
    private int startX, startY, endX, endY;
    private MyColor currentColor;
    private int currentThickness;

    public Drawing() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endX = e.getX();
                endY = e.getY();
                if (currentColor != null) {
                    currentLine = new MyLine(currentColor, currentThickness, startX, startY, endX, endY);
                    addShape(currentLine);
                    currentLine = null; // 重置当前线条
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                endX = e.getX();
                endY = e.getY();
                repaint();
            }
        });
    }

    public void setDrawingParameters(MyColor color, int thickness) {
        currentColor = color;
        currentThickness = thickness;
    }

    public void addShape(MyLine myLine) {
        myLines.add(myLine);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyLine ml : myLines) {
            ml.draw(g);
        }
        // 临时绘制正在拖动的线条
        if (currentLine != null || (startX != endX && startY != endY)) {
            g.setColor(currentColor.getColor());
            ((Graphics2D) g).setStroke(new BasicStroke(currentThickness));
            g.drawLine(startX, startY, endX, endY);
        }
    }
}