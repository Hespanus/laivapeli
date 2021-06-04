import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;


import javax.swing.*;



public class Alaruudukko extends Pelialue implements ActionListener {

    static final double xNopeus = 1;
	static final int rivit = 11;
	static final int sarakkeet = 23;

	  
	static final int alkuX = 40;
	static final int alkuY = 40;
	static final int nelioSivu = 50;

	int laivaX = 40;
	int laivaY = 190;
	static final int laivaHalkaisija = 3;

    public JPanel alaruudukko;
    public JTextArea tekstikentta;
    JButton ammuNappi;
    JButton aloitaNappi;
    JLabel kuljettuMatka;
    JLabel ammusMatka;

    JTextField tahtaysx; 
    

    

    ThreadLocalRandom random = ThreadLocalRandom.current();		
    int nopeus = random.nextInt(35, 51);
    
    ThreadLocalRandom tuuli = ThreadLocalRandom.current();		
    int tuulinopeus = random.nextInt(0, 11);

    Laiva laiva = new Laiva(nopeus);
    Ammus ammus = new Ammus(tuulinopeus, 6000, 6000);


    Timer laivakello = new Timer(100, new ActionListener() {
  
        public void actionPerformed(ActionEvent e) {
            laiva.liikutaLaivaa();
            kuljettuMatka.setText(String.valueOf(laiva.getsijaintiX()));          
            
                    
         
        }
        
       });

       Timer ammuskello = new Timer(100, new ActionListener() {
  
        public void actionPerformed(ActionEvent e) {
            
            ammus.liikutaAmmusta();
            if(ammus.getSijaintiY() == ammus.getTahtaysY()){
                if(laiva.getsijaintiX() >= ammus.getSijaintiX()-3 && laiva.getsijaintiX() <= ammus.getSijaintiX()+3){
                    tekstikentta.setText("Osuma, Laiva upposi!");
                } else{
                    tekstikentta.setText("Ohi meni, pelaa uudelleen!");
                }
            
            }
                                  
            
         
         
        }
        
       });


    public Alaruudukko(){

        alaruudukko = new JPanel();
        alaruudukko.setLayout(null);
        alaruudukko.setBounds(2, 603, 1200, 302);
        alaruudukko.setBackground(Color.gray);
        ammuNappi = new JButton ("AMMU");
        aloitaNappi = new JButton("ALOITA");

        ammuNappi.setBounds(300, 220, 100, 50);
        ammuNappi.addActionListener(this);
        alaruudukko.add(ammuNappi);
        aloitaNappi.setBounds(150, 220, 100, 50);
        aloitaNappi.addActionListener(this);
        alaruudukko.add(aloitaNappi);
        kuljettuMatka = new JLabel();
        kuljettuMatka.setBounds(725, 125, 200, 50);
        kuljettuMatka.setBackground(Color.white);
        kuljettuMatka.setBorder(BorderFactory.createBevelBorder(1));
        kuljettuMatka.setOpaque(true);
        //kuljettuMatka.setText("teksti");
        alaruudukko.add(kuljettuMatka);

        ammusMatka = new JLabel();
        ammusMatka.setBounds(950, 125, 200, 50);
        ammusMatka.setBackground(Color.white);
        ammusMatka.setBorder(BorderFactory.createBevelBorder(1));
        ammusMatka.setOpaque(true);
        alaruudukko.add(ammusMatka);

        tahtaysx = new JTextField();
        tahtaysx.setBounds(800, 2, 100, 50);
        alaruudukko.add(tahtaysx);

        
        tekstikentta = new JTextArea("Ammu laiva!");        
        tekstikentta.setBounds(2, 2, 700, 200);
        tekstikentta.setText(String.valueOf(nopeus));
        tekstikentta.append("\n"+ String.valueOf(laiva.getnopeus()));
        alaruudukko.add(tekstikentta);
      
 
    }
    public JPanel getAlaruudukko(){
        return this.alaruudukko;
    }
    @Override
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == aloitaNappi){
             laivastart();
             piirrastart();

        }

        if(e.getSource() == ammuNappi){
            ammustart();
            //tahtaysx.getinte


        }
    }

    void laivastart(){
        laivakello.start();
    }

    void ammustart(){
        ammuskello.start();
    }
    
      
}
