package components;

import java.awt.*;
import java.awt.event.*;
import java.awt.Window.*;
import components.Component3;

class Component4 extends Component3 implements WindowListener{

    Frame f;

    

 public Component4(){
     super();

        f=new Frame();


        f.setSize(375, 420);
        f.setLayout(null);
        f.setVisible(true);


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

        f.dispose();
    }

    public void windowOpened(WindowEvent e) {

    }


}