import java.awt.*;

import javax.swing.*;


public class Alaruudukko {

    public JPanel alaruudukko;
    public JTextField tekstikentta;
    JButton[] ammus = new JButton[1];
    public JButton ammu;

    public Alaruudukko(){

        this.alaruudukko = new JPanel();
        this.alaruudukko.setBounds(2, 603, 1200, 302);
        this.alaruudukko.setBackground(Color.white);


        ammu = new JButton("AMMU");

        ammus[1] = ammu;

        alaruudukko.add(ammus[1]);

    }
        public JPanel getAlaruudukko(){
            return this.alaruudukko;
        }
        public JTextField gettekstikentta(){
            return this.tekstikentta;
    }
}