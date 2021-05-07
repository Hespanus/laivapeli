import java.awt.*;

import javax.swing.*;



public class Laskinikkuna  {
        
        public JPanel laskinikkuna;

        public Laskinikkuna(){

            this.laskinikkuna = new JPanel();            
            this.laskinikkuna.setBounds(1200, 300, 400, 500);
            this.laskinikkuna.setBackground(Color.red);
            
            


        }
        public JPanel getLaskinikkuna(){
                return this.laskinikkuna;
        }
    



}
