import javax.swing.*;
import java.awt.*;
public class Swing_label extends JApplet{
    ImageIcon i = new ImageIcon("C:\\Users\\Admin\\Pictures\\Screenshots\\impImg.png");
    JLabel l1 = new JLabel("Hello Java Developer. \nHow Are You ?");
    JLabel l2 = new JLabel(i);
    public void init() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(l1);
        cp.add(l2);
    }
}