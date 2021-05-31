import javax.swing.JFrame;
import javax.swing.JPanel;




public class Pelikehys implements Runnable {

    
    
    @Override
    public void run() {

        final JFrame kehys;
        kehys = new JFrame();
        
        
        Laskinikkuna laskinikkuna = new Laskinikkuna();
        Pelialue alue = new Pelialue();
        JPanel kentta = alue;
        Alaruudukko ruudukko = new Alaruudukko();        
        kentta.setBounds(0, 0, 1230, 602);
        kehys.setTitle("Laivapeli");
        kehys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        kehys.setLayout(null); //Nyt voi asetella vapaasti JPaneleita yms. kehykseen, kun tuo on nollattu.
        kehys.setSize(1600, 950);
        kehys.add(kentta);
        kehys.add(laskinikkuna.getLaskinikkuna()); //gettereillä haetaan JPanel ja tekstikentät
        kehys.add(laskinikkuna.gettekstikentta()); 
        kehys.add(laskinikkuna.getlasketut());
        kehys.add(laskinikkuna.getmemo());  
        kehys.add(ruudukko.getAlaruudukko());  
        kehys.setVisible(true);      
        


        

    }
}
