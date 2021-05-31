import java.awt.*;

import javax.swing.*;


public class Alaruudukko {

    public JPanel alaruudukko;
    public JTextField tekstikentta;


    public Alaruudukko(){

        this.alaruudukko = new JPanel();
        this.alaruudukko.setBounds(2, 603, 1200, 302);
        this.alaruudukko.setBackground(Color.white);
        JButton nappula = new JButton ("AMMU");

        nappula.setBounds(200, 610, 100, 50);
        alaruudukko.add(nappula);
       

        JTextField tekstikentta;
        tekstikentta = new JTextField("Ammu laiva!");
        tekstikentta.setBounds(2, 1000, 100, 200);
        alaruudukko.add(tekstikentta);
      
 
    }
        public JPanel getAlaruudukko(){
            return this.alaruudukko;
        }
      
    }
