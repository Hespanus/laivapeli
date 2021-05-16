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
        kentta.setBounds(0,0, 1205, 602);
        kehys.setTitle("Laivapeli");
        kehys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        kehys.setLayout(null); //Nyt voi asetella käsin JPaneleita yms. kehykseen, kun tuo on nollattu.
        kehys.setSize(1600, 950);
        kehys.add(kentta);        
        kehys.revalidate();
        kehys.add(laskinikkuna.getLaskinikkuna()); //Ei tuntunut toimivan pelkästään olio lisäämällä. Ainakin getterillä toimii.
        kehys.add(laskinikkuna.gettekstikentta());     
        kehys.setVisible(true);      
        


        

    }
}
