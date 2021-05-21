import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Laskinikkuna implements ActionListener {
        
        public JPanel laskinikkuna;
        public JTextField tekstikentta;
        JButton[] numerot = new JButton[10]; //taulukot napeille helpottamaan niiden asetusten tekoa
        JButton[] funktiot = new JButton[9];
        JButton plussa, miinus, kerto, jako, nelioj;
        JButton piste, yhtakuin, pyyhi, tyhjaa;
        Font fontti = new Font("Verdana", Font.BOLD, 18); //fontti oli oletuksena liian pieni
        String SQR = "\u221A";  //Löytyi oikea utf-8 merkki, joskin yläviiva puuttuu.
        double num1 = 0, num2 = 0, tulos = 0;
        char operator; //tarvitaan switch-rakenteessa

        public Laskinikkuna(){

            laskinikkuna = new JPanel(new GridLayout(5, 4, 10, 10)); //kaksi vikaa numeroa antaa borderit napeille           
            laskinikkuna.setBounds(1270, 500, 300, 400); //laskimen asettelu JFrameen ja koko
            laskinikkuna.setBackground(Color.white);
            tekstikentta = new JTextField();
            tekstikentta.setBounds(1250, 450, 325, 50); //tekstikenttä menee JFrameen, olisi voinut kai tehdä sitä ja
            tekstikentta.setBackground(Color.white);   //tekstialuetta varten toisen JPanelin ja laittaa siihen.
            tekstikentta.setFont(fontti);
            tekstikentta.setEditable(false);       

            

             tyhjaa = new JButton("C");
             pyyhi = new JButton("Del");
             nelioj = new JButton(SQR);
             jako = new JButton("/");
             kerto = new JButton("*");

             miinus = new JButton("-");
             plussa = new JButton("+");
             piste = new JButton(".");
             yhtakuin = new JButton("=");

             funktiot[0] = tyhjaa; //laitetaan napit taulukkoon
             funktiot[1] = pyyhi;
             funktiot[2] = nelioj;
             funktiot[3] = jako;
             funktiot[4] = kerto;
             funktiot[5] = miinus;
             funktiot[6] = plussa;
             funktiot[7] = piste;
             funktiot[8] = yhtakuin;

             for(int i = 0; i < 9; i++){
                     funktiot[i].addActionListener(this);//luokka toteuttaa (implements) actionPerformed-metodin kautta
                     funktiot[i].setFont(fontti);  //ActionListenerin ja siihen voidaan viitata nyt määreellä "this".
                     funktiot[i].setFocusable(false);//estää nappuloiden valinnan tab-näppäimellä, ei tule turhia efektejä nappeihin.
             }

             for(int i = 0; i < 10; i++){
                     numerot[i] = new JButton(String.valueOf(i));//luo kätevästi indeksin mukaisen numeronapin
                     numerot[i].addActionListener(this);
                     numerot[i].setFont(fontti);
                     numerot[i].setFocusable(false);
             }
             
            
            laskinikkuna.add(funktiot[0]); //lisätään napit oikeassa järjestyksessä JPaneliin. Gridlayoutissa        
            laskinikkuna.add(funktiot[1]); //ne menevät automaattisesti vasemmalta oikealle ja rivi kerrallaan.
            laskinikkuna.add(funktiot[2]); //välilyönnit ovat vain helpottamaan lukemista.
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
                        if(e.getSource() == numerot[i]){ //jos numero, muunnetaan stringiksi ja katenoidaan yhteen.
                               tekstikentta.setText(tekstikentta.getText().concat(String.valueOf(i))); 
                        }       //liitetään tekstikenttään
                }

                if(e.getSource() == piste){
                        tekstikentta.setText(tekstikentta.getText().concat("."));
                }
                if(e.getSource() == plussa){
                        num1 = Double.parseDouble(tekstikentta.getText()); //muunnetaan doubleksi laskemista varten
                        operator = '+';
                        tekstikentta.setText(""); //kenttä tyhjennetään seuraavaa lukua varten.
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

                if(e.getSource() == nelioj){  //neliöjuuri piti tehdä erikseen näin, ilman swithchiä
                        num1 = Double.parseDouble(tekstikentta.getText());                        
                        tulos = Math.sqrt(num1); //Javan Math-luokan valmis neliöjuurimetodi
                        tekstikentta.setText(String.valueOf(tulos));  //ei tyhjätä nyt, vaan asetetaan tulos.
                        num1 = tulos;   //Jos haluaa käyttää tulosta heti seuraavaan laskuun, pitää num1 olla tulos
                        
                }

                if(e.getSource() == yhtakuin){ // "="-merkkiä painettaessa num2 arvoksi asetetaan kentässä oleva luku
                        num2 = Double.parseDouble(tekstikentta.getText());

                        switch(operator){//tässä käytetään case-kohdissa ylempänä määriteltyjä operator-merkkejä.
                        case '+':       
                                tulos = num1 + num2;
                                break; 
                                 
                        case '-':
                                tulos = num1 - num2;
                                break;  
                                
                                
                        case '*':
                                tulos = num1 * num2;
                                break;           
                        
                        case '/':
                                tulos = num1 / num2;
                                break;
                                
                         
                        }

                        tekstikentta.setText(String.valueOf(tulos));
                        num1 = tulos;


                }
                
                if(e.getSource() == tyhjaa ){
                        tekstikentta.setText("");
                }

                if(e.getSource() == pyyhi){  //luodaan tekstikentän sisällöstä uusi substring, 
                      String pyyhittava =  tekstikentta.getText(); // jossa alkuperäinen ilman vikaa merkkiä.
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
