import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Addit extends Applet implements ActionListener
{
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    Label l1 = new Label("Num 1 : ");
    Label l2 = new Label("Num 2 : ");
    Label l3 = new Label("Addition Here");
    Button b = new Button("ADD");
    public void init()
    {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b)
        {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            l3.setText(" " + (n1 + n2));
        }
    }
}