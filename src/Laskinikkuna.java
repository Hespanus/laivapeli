import java.awt.*;

import javax.swing.*;
import java.awt.event.*;



public class Laskinikkuna implements ActionListener {
        
        public JPanel laskinikkuna;
        public JTextField tekstikentta;
        JButton[] numerot = new JButton[10];
        JButton[] funktiot = new JButton[8];
        JButton plussa, miinus, kerto, jako;
        JButton piste, yhtakuin, pyyhi, putsaa;

        public Laskinikkuna(){

            laskinikkuna = new JPanel(new GridLayout(5, 4));            
            laskinikkuna.setBounds(1250, 500, 325, 425);
            laskinikkuna.setBackground(Color.red);
            tekstikentta = new JTextField();
            tekstikentta.setBounds(1250, 450, 325, 50);
            tekstikentta.setBackground(Color.green);




        

            //laskinikkuna.add();
            laskinikkuna.add(new JButton("C"));
            laskinikkuna.add(new JButton("Del"));
            laskinikkuna.add(new JButton("/"));
            laskinikkuna.add(new JButton("7"));

            laskinikkuna.add(new JButton("8"));
            laskinikkuna.add(new JButton("9"));
            laskinikkuna.add(new JButton("*"));
            laskinikkuna.add(new JButton("4"));
            laskinikkuna.add(new JButton("5"));

            laskinikkuna.add(new JButton("6"));            
            laskinikkuna.add(new JButton("-"));
            laskinikkuna.add(new JButton("1"));
            laskinikkuna.add(new JButton("2"));
            laskinikkuna.add(new JButton("3"));

            laskinikkuna.add(new JButton("+"));
            laskinikkuna.add(new JButton(""));
            laskinikkuna.add(new JButton("0"));
            laskinikkuna.add(new JButton(","));
            laskinikkuna.add(new JButton("="));
            


            
            


        }
        public JPanel getLaskinikkuna(){
                return this.laskinikkuna;
        }
        public JTextField gettekstikentta(){
                return this.tekstikentta;
        }

        private static void nappulat() {
                
        }

        @Override
        public void actionPerformed(ActionEvent e){

        }
    



}
