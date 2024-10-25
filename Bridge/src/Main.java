import javax.swing.*;
import java.awt.*;
import Color.*;
import Thick.*;

public class Main extends JFrame {
    private Drawing drawing;
    private JComboBox<String> colorCombo;
    private JComboBox<String> thicknessCombo;

    public Main() {
        setTitle("2022112529-张斯涵");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawing = new Drawing();
        drawing.setBackground(Color.WHITE);
        add(drawing, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("颜色:"));
        String[] colors = {"红色", "绿色", "蓝色"};
        colorCombo = new JComboBox<>(colors);
        colorCombo.addActionListener(e -> updateDrawingParameters()); // 添加事件监听器
        controlPanel.add(colorCombo);

        controlPanel.add(new JLabel("粗细:"));
        String[] thicknesses = {"1", "3", "5"};
        thicknessCombo = new JComboBox<>(thicknesses);
        thicknessCombo.addActionListener(e -> updateDrawingParameters()); // 添加事件监听器
        controlPanel.add(thicknessCombo);

        add(controlPanel, BorderLayout.NORTH);
        updateDrawingParameters(); // 初始化绘图参数
    }

    private void updateDrawingParameters() {
        String color = (String) colorCombo.getSelectedItem();
        MyColor myColor;
        switch (color) {
            case "红色": myColor = new RedColor(); break;
            case "绿色": myColor = new GreenColor(); break;
            case "蓝色": myColor = new BlueColor(); break;
            default: myColor = new RedColor();
        }

        int thickness = Integer.parseInt((String) thicknessCombo.getSelectedItem());
        drawing.setDrawingParameters(myColor, thickness);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main demo = new Main();
            demo.setVisible(true);
        });
    }
}
