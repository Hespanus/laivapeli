import javax.swing.JFrame;









public class Pelikehys implements Runnable {

    public JFrame kehys;
    
    public Pelikehys(){
        this.kehys = new JFrame();
    }
    
    public void run() {
        
        Laskinikkuna laskinikkuna = new Laskinikkuna();

        
        kehys.setTitle("Laivapeli");
        kehys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        kehys.setLayout(null); //Nyt voi asetella käsin JPaneleita yms. kehykseen, kun tuo on nollattu.
        kehys.setSize(1600, 800);
        kehys.add(laskinikkuna.getLaskinikkuna()); //Ei tuntunut toimivan pelkästään olio lisäämällä. Ainakin getterillä toimii.
        kehys.setVisible(true);
        
        


        

    }
}
