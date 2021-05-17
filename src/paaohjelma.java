import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class paaohjelma {
    public static void main(String[] args)  {
        SwingUtilities.invokeLater(new Pelikehys());  // Tämä liittyy Runnableen ja invokeLater varmistaa, että elementit
                                                    // suoritetaan kun ne on kaikki valmiina -tarpeen Swing-juttujen kanssa
                                                    // lukemani perusteella.  
       // JFrame frame = new JFrame("test");
       // frame.setSize(1280, 720);

        //Pelialue testi = new Pelialue();
       // frame.setVisible(true);
    }
}
