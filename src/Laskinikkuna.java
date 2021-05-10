import java.awt.*;

import javax.swing.*;



public class Laskinikkuna  {
        
        public JPanel laskinikkuna;

        public Laskinikkuna(){

            this.laskinikkuna = new JPanel();            
            this.laskinikkuna.setBounds(1205, 300, 395, 500);
            this.laskinikkuna.setBackground(Color.red);
            
            


        }
        public JPanel getLaskinikkuna(){
                return this.laskinikkuna;
        }
    



}
