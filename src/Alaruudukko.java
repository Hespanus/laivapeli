import java.awt.*;

import javax.swing.*;


public class Alaruudukko {

    public JPanel alaruudukko;
    //public JTextArea tekstikentta;    
    //public JButton ammu;

    public Alaruudukko(){

        this.alaruudukko = new JPanel();
        this.alaruudukko.setBounds(2, 603, 1200, 302);
        this.alaruudukko.setBackground(Color.white);

        //tekstikentta = new JTextArea();
       // alaruudukko.add(tekstikentta);
        //ammu = new JButton("AMMU");

        

        //alaruudukko.add(ammu);

    }
        public JPanel getAlaruudukko(){
            return this.alaruudukko;
        }
        //public JTextArea gettekstikentta(){
          //  return this.tekstikentta;
    //}
}