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
        JButton pelinappula = new JButton ("Aloita peli!");
        nappula.setBounds(800, 2, 100, 50);
        pelinappula.setBounds(900, 2, 100, 50);
        alaruudukko.add(nappula);
        alaruudukko.add(pelinappula);
       

        alaruudukko.setLayout(null);
        tekstikentta = new JTextArea();
        tekstikentta.setBounds(2, 2, 700, 200);
        alaruudukko.add(tekstikentta);
      
 
    }
        public JPanel getAlaruudukko(){
            return this.alaruudukko;
        }
      
    }
