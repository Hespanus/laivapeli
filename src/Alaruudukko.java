import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;


import javax.swing.*;



public class Alaruudukko implements ActionListener {

    

    public JPanel alaruudukko;
    public JTextArea tekstikentta;
    JButton ammuNappi;
    JButton aloitaNappi;
    JLabel kuljettuMatka;
    JLabel ammusMatka;
    JLabel ammusMatkaY;
    Ammus ammus;

    JLabel tahtaysOhje;

    JTextField tahtaysx;
    double tahtaysX; 
    String tuulenSuunta;
    Font fontti = new Font("Verdana", Font.PLAIN, 14);

    JLabel laivainfo; 
    JLabel ammusinfo;
    JLabel ammusinfoY;
    
    

    ThreadLocalRandom tuuli = ThreadLocalRandom.current();		
    int tuulinopeus = tuuli.nextInt(-11, 11);

    ThreadLocalRandom random = ThreadLocalRandom.current();		
    int nopeus = random.nextInt(35, 51);   
      
    


    Laiva laiva = new Laiva(nopeus);
     


    Timer laivakello = new Timer(100, new ActionListener() { //laivaa liikuttava Timer-luuppi, liikuttaa laivaa 10 kertaa sekunnissa
  
        public void actionPerformed(ActionEvent e) {
            laiva.liikutaLaivaa();
            kuljettuMatka.setText(String.valueOf(laiva.getsijaintiX()));
                     
            
                    
         
        }
        
       });

       Timer ammuskello = new Timer(100, new ActionListener() { // ammusta liikuttava Timer-luuppi 
  
        public void actionPerformed(ActionEvent e) {

            if(ammus.getSijaintiY() > 1500){
                ammus.liikutaAmmusta();                
                ammusMatka.setText(String.valueOf(ammus.getSijaintiX()));
                ammusMatkaY.setText(String.valueOf(ammus.getSijaintiY()));
            }
            
            

            if(ammus.getSijaintiY() == 1500){
                if(laiva.getsijaintiX() >= ammus.getSijaintiX()-10 && laiva.getsijaintiX() <= ammus.getSijaintiX()+10){
                    tekstikentta.setText("Osuma, Laiva upposi!");
                    ammus.pysaytaAmmus();
                    ammuskello.stop();
                    laivakello.stop(); 
                } else{
                    tekstikentta.setText("Ohi meni, pelaa uudelleen!");
                    ammus.pysaytaAmmus();
                    ammuskello.stop();
                }
            }
                
           
                
                     
                                                 
                            
        }
        
       });

    
    @Override
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == aloitaNappi){
             tekstikentta.setText("");
             tekstikentta.setText("Laivan nopeus: "+String.valueOf(nopeus)+"km/h");
             if(tuulinopeus < 0){
                tuulenSuunta = ("<---");
            } else if(tuulinopeus > 0){
                tuulenSuunta = ("--->");
            } else{
                tuulenSuunta =("0");
            }
            tekstikentta.append("\n"+ "Tykki: X=6000, Y=5500");
            tekstikentta.append("\n"+ "Yritä osua kohdassa X=6000, Y=1500");
            tekstikentta.append("\n"+ "Ammuksen nopeus 500 m/s");
            tekstikentta.append("\n"+ "Tuulen nopeus: " + String.valueOf(Math.abs(tuulinopeus))+" m/s");

            tekstikentta.append("\n"+"Tuulen suunta: "+tuulenSuunta);
            tekstikentta.append("\n"+"1 m/s tuulta poikkeuttaa ammusta 2m/kuljettu sekunti");
            laivastart();
             //piirrastart(); //käytetään jos liikkuva grafiikka lisätään myöhemmin.

        }

        if(e.getSource() == ammuNappi){
            tahtaysX = Double.parseDouble(tahtaysx.getText());
            ammus = new Ammus(tuulinopeus, tahtaysX, 1500);
            ammustart();
            


        }
    }

    void laivastart(){
        laivakello.start();
    }

    void ammustart(){
        ammuskello.start();
    }


    public Alaruudukko(){

        alaruudukko = new JPanel();
        alaruudukko.setLayout(null);
        alaruudukko.setBounds(2, 603, 1188, 302);
        alaruudukko.setBackground(Color.lightGray);
        alaruudukko.setBorder(BorderFactory.createBevelBorder(1));
        ammuNappi = new JButton ("AMMU");
        aloitaNappi = new JButton("ALOITA");

        ammuNappi.setBounds(550, 220, 100, 50);
        ammuNappi.addActionListener(this);
        alaruudukko.add(ammuNappi);

        tahtaysOhje = new JLabel("Aseta tähtäys X:");
        tahtaysOhje.setBounds(300, 220, 125, 50);
        alaruudukko.add(tahtaysOhje);

        aloitaNappi.setBounds(150, 220, 100, 50);
        aloitaNappi.addActionListener(this);
        alaruudukko.add(aloitaNappi);
        kuljettuMatka = new JLabel();
        kuljettuMatka.setBounds(725, 50, 200, 50);
        kuljettuMatka.setBackground(Color.white);
        kuljettuMatka.setBorder(BorderFactory.createBevelBorder(1));
        kuljettuMatka.setOpaque(true);
        //kuljettuMatka.setText("teksti");
        alaruudukko.add(kuljettuMatka);

        ammusMatka = new JLabel();
        ammusMatka.setBounds(950, 50, 200, 50);
        ammusMatka.setBackground(Color.white);
        ammusMatka.setBorder(BorderFactory.createBevelBorder(1));
        ammusMatka.setOpaque(true);
        alaruudukko.add(ammusMatka);

        ammusMatkaY = new JLabel();
        ammusMatkaY.setBounds(950, 170, 200, 50);
        ammusMatkaY.setBackground(Color.white);
        ammusMatkaY.setBorder(BorderFactory.createBevelBorder(1));
        ammusMatkaY.setOpaque(true);
        alaruudukko.add(ammusMatkaY);

        tahtaysx = new JTextField();
        tahtaysx.setBounds(410, 220, 100, 50);
        alaruudukko.add(tahtaysx);

        laivainfo = new JLabel("Laiva kulkenut / metriä:");
        laivainfo.setBounds(725, 25, 200, 24);
        alaruudukko.add(laivainfo);

        ammusinfo = new JLabel("Ammus X-suunnassa:");
        ammusinfo.setBounds(950, 25, 200, 24);
        alaruudukko.add(ammusinfo);

        ammusinfoY = new JLabel("Ammus Y-suunnassa:");
        ammusinfoY.setBounds(950, 140, 200, 24);
        alaruudukko.add(ammusinfoY);


        
        tekstikentta = new JTextArea();
        tekstikentta.setFont(fontti);        
        tekstikentta.setBounds(2, 2, 700, 200);
        tekstikentta.setBorder(BorderFactory.createBevelBorder(1));
        tekstikentta.append("Tavoitteena on ampua ruudukolla etenevä laiva" +  "\n" + "Tuulen nopeus ja suunta vaikuttavat ammuksen kulkuun." + "\n" + "Voit käyttää laskinta apuna" +
        "\n" + "Aseta x-koordinaatin tähtäys ja paina oikeaan aikaan ammu-nappia" + "\n" + "Kun haluat aloittaa pelin, paina aloita-nappia.");
        //tekstikentta.append("\n"+ String.valueOf(laiva.getnopeus()));
        alaruudukko.add(tekstikentta);
      
 
    }
    public JPanel getAlaruudukko(){
        return this.alaruudukko;
    }
    
      
}
