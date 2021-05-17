import java.awt.*;

import javax.swing.*;


public class Alaruudukko {

    public JPanel alaruudukko;

    public Alaruudukko(){

        this.alaruudukko = new JPanel();
        this.alaruudukko.setBounds(0, 0, 401, 602);
        this.alaruudukko.setBackground(Color.blue);


    }
        public JPanel getAlaruudukko(){
            return this.alaruudukko;
        }
}