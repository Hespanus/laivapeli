import java.awt.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import javax.swing.text.AttributeSet.FontAttribute;
import java.lang.*;
import java.awt.event.*;



public class Laskinikkuna implements ActionListener {
        
        public JPanel laskinikkuna;
        public JTextField tekstikentta;
        JButton[] numerot = new JButton[10];
        JButton[] funktiot = new JButton[9];
        JButton plussa, miinus, kerto, jako, nelioj;
        JButton piste, yhtakuin, pyyhi, tyhjaa;
        Font fontti = new Font("Verdana", Font.BOLD, 18);

        double num1 = 0, num2 = 0, tulos = 0;
        char operator;

        public Laskinikkuna(){

            laskinikkuna = new JPanel(new GridLayout(5, 4, 10, 10));            
            laskinikkuna.setBounds(1270, 500, 300, 400);
            laskinikkuna.setBackground(Color.white);
            tekstikentta = new JTextField();
            tekstikentta.setBounds(1250, 450, 325, 50);
            tekstikentta.setBackground(Color.white);
            tekstikentta.setFont(fontti);
            tekstikentta.setEditable(false);
        

            //laskinikkuna.add();

             tyhjaa = new JButton("C");
             pyyhi = new JButton("Del");
             nelioj = new JButton("4ju");
             jako = new JButton("/");
             kerto = new JButton("*");

             miinus = new JButton("-");
             plussa = new JButton("+");
             piste = new JButton(".");
             yhtakuin = new JButton("=");

             funktiot[0] = tyhjaa;
             funktiot[1] = pyyhi;
             funktiot[2] = nelioj;
             funktiot[3] = jako;
             funktiot[4] = kerto;
             funktiot[5] = miinus;
             funktiot[6] = plussa;
             funktiot[7] = piste;
             funktiot[8] = yhtakuin;

             for(int i = 0; i < 9; i++){
                     funktiot[i].addActionListener(this);
                     funktiot[i].setFont(fontti);
                     funktiot[i].setFocusable(false);
             }

             for(int i = 0; i < 10; i++){
                     numerot[i] = new JButton(String.valueOf(i));
                     numerot[i].addActionListener(this);
                     numerot[i].setFont(fontti);
                     numerot[i].setFocusable(false);
             }
             
            
            laskinikkuna.add(funktiot[0]);
            laskinikkuna.add(funktiot[1]);
            laskinikkuna.add(funktiot[2]);
            laskinikkuna.add(funktiot[3]);
            laskinikkuna.add(numerot[7]);

            laskinikkuna.add(numerot[8]);
            laskinikkuna.add(numerot[9]);
            laskinikkuna.add(funktiot[4]);
            laskinikkuna.add(numerot[4]);
            laskinikkuna.add(numerot[5]);

            laskinikkuna.add(numerot[6]);            
            laskinikkuna.add(funktiot[5]);
            laskinikkuna.add(numerot[1]);
            laskinikkuna.add(numerot[2]);
            laskinikkuna.add(numerot[3]);

            laskinikkuna.add(funktiot[6]);
            laskinikkuna.add(new JButton(""));
            laskinikkuna.add(numerot[0]);
            laskinikkuna.add(funktiot[7]);
            laskinikkuna.add(funktiot[8]);         


                        
        }

        @Override
        public void actionPerformed(ActionEvent e){
                for( int i = 0; i < 10; i++){
                        if(e.getSource() == numerot[i]){
                               tekstikentta.setText(tekstikentta.getText().concat(String.valueOf(i))); 
                        }
                }

                if(e.getSource() == piste){
                        tekstikentta.setText(tekstikentta.getText().concat("."));
                }
                if(e.getSource() == plussa){
                        num1 = Double.parseDouble(tekstikentta.getText());
                        operator = '+';
                        tekstikentta.setText("");
                }

                if(e.getSource() == miinus){
                        num1 = Double.parseDouble(tekstikentta.getText());
                        operator = '-';
                        tekstikentta.setText("");
                }

                if(e.getSource() == kerto){
                        num1 = Double.parseDouble(tekstikentta.getText());
                        operator = '*';
                        tekstikentta.setText("");
                }

                if(e.getSource() == jako){
                        num1 = Double.parseDouble(tekstikentta.getText());
                        operator = '/';
                        tekstikentta.setText("");
                }

                if(e.getSource() == nelioj){
                        num1 = Double.parseDouble(tekstikentta.getText());
                        //operator = '%';
                        tulos = Math.sqrt(num1);
                        tekstikentta.setText(String.valueOf(tulos));
                        num1 = tulos;
                        
                }

                if(e.getSource() == yhtakuin){
                        num2 = Double.parseDouble(tekstikentta.getText());

                        switch(operator){
                        case '+':
                                tulos = num1 + num2;
                                break; 
                                 
                        case '-':
                                tulos = num1 + num2;
                                break;  
                                
                                
                        case '*':
                                tulos = num1 * num2;
                                break;           
                        
                        case '/':
                                tulos = num1 / num2;
                                break;
                                
                        /*case '%':
                                tulos = Math.sqrt(num2);
                                break;   */   
                        }

                        tekstikentta.setText(String.valueOf(tulos));
                        num1 = tulos;


                }
                
                if(e.getSource() == tyhjaa ){
                        tekstikentta.setText("");
                }

                if(e.getSource() == pyyhi){
                      String pyyhittava =  tekstikentta.getText();
                      tekstikentta.setText(pyyhittava.substring(0, pyyhittava.length()-1));
                }




        }






        public JPanel getLaskinikkuna(){
                return this.laskinikkuna;
        }
        public JTextField gettekstikentta(){
                return this.tekstikentta;
        }

        

        



}
