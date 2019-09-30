package components;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import components.Component3;

public class Component1 extends Frame implements ActionListener, WindowListener, ItemListener {

    Checkbox c1, c2, c3;
    String select;

    public Component1() {

        Button b1 = new Button("Next");
        Button b2 = new Button("Cansel");
        Label l1 = new Label("GPA");
        Label l2 = new Label("Select your Stream:");

        // bounds sectio
        l1.setBounds(130, 70, 200, 70);
        l2.setBounds(50, 150, 200, 20);
        b1.setBounds(200, 350, 100, 40);
        b2.setBounds(10, 350, 100, 40);

        controlCheckBax();

        // register with actionListener

        b1.addActionListener(this);
        addWindowListener(this);

        // fonts Section
        Font myFont = new Font("Serif", Font.BOLD, 50);
        l1.setFont(myFont);
        Font myFont1 = new Font("Serif", Font.BOLD, 25);
        b1.setFont(myFont1);
        b2.setFont(myFont1);

        // add components
        add(l1);
        add(l2);
        add(b1);
        add(b2);

        // window settings
        setSize(375, 420);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        Component2 c2 = new Component2(select);
    }

    public void controlCheckBax() {
        CheckboxGroup gp = new CheckboxGroup();

        c1 = new Checkbox("BCS", gp, false);
        c1.setBounds(70, 200, 100, 20);

        c2 = new Checkbox("phy", gp, false);
        c2.setBounds(70, 250, 100, 20);

        c3 = new Checkbox("bio", gp, false);
        c3.setBounds(70, 300, 100, 20);

        add(c1);
        add(c2);
        add(c3);

        // item listener

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            select = "BCS";
        }

        else if (e.getSource() == c2) {
            select = "PHY";
        } else if (e.getSource() == c3) {
            select = "BIO";
        }

    }

    public void windowActivated(WindowEvent args0) {
       
    }

    public void windowDeactivated(WindowEvent args0) { 
        dispose();
    }

    public void windowDeiconified(WindowEvent args0) {
       
    }

    public void windowIconified(WindowEvent args0) {
       
    }

    public void windowClosed(WindowEvent args0) {
       
    }

    public void windowClosing(WindowEvent args0) {  
        dispose();
    }

    public void windowOpened(WindowEvent args0) {
      
    }

}