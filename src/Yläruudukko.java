import java.awt.*;

import javax.swing.*;


public class Yläruudukko {
    
    public JPanel yläruudukko;

    public Yläruudukko(){

        this.yläruudukko = new JPanel();
        this.yläruudukko.setBounds(1250, 0, 325, 425);
        this.yläruudukko.setBackground(Color.blue);


    }

     public JPanel getYläruudukko(){
         return this.yläruudukko;

     }
}
