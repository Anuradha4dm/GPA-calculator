package components;

import java.awt.*;
import java.awt.event.*;
import java.awt.Window.*;

class Component3 extends Frame implements WindowListener {

    Component3(){

    }
   

    Component3(String select1, String Select2) {

       
        Button b1 = new Button("Next");
        Button b2 = new Button("Cansel");
        Label l1 = new Label("GPA");
        Label l2 = new Label("Select your level:");
        Label l3 = new Label("GPV value");

        // bounds sectio
        l1.setBounds(130, 70, 200, 70);
        l2.setBounds(50, 150, 200, 20);
        l3.setBounds(50, 300, 200, 20);
        b1.setBounds(200, 350, 100, 40);
        b2.setBounds(10, 350, 100, 40);

        // register with actionListener

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
        add(l3);

        // window settings
        setSize(375, 420);
        setLayout(null);
        setVisible(true);

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {

        dispose();
    }

    public void windowOpened(WindowEvent e) {

    }

}
