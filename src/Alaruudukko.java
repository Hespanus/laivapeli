import java.awt.*;

import javax.swing.*;


public class Alaruudukko {

    public JPanel alaruudukko;
    public JTextArea tekstikentta;


    public Alaruudukko(){

        this.alaruudukko = new JPanel();
        alaruudukko.setLayout(null);
        this.alaruudukko.setBounds(2, 603, 1200, 302);
        this.alaruudukko.setBackground(Color.gray);
        JButton nappula = new JButton ("AMMU");

        nappula.setBounds(800, 2, 100, 50);
        alaruudukko.add(nappula);
       

        
        tekstikentta = new JTextArea("Ammu laiva!");
        tekstikentta.setBounds(2, 2, 700, 200);
        alaruudukko.add(tekstikentta);
      
 
    }
        public JPanel getAlaruudukko(){
            return this.alaruudukko;
        }
      
    }
