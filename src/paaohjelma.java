import javax.swing.SwingUtilities;


public class Paaohjelma {
    public static void main(String[] args)  {
        SwingUtilities.invokeLater(new Pelikehys());  // Tämä liittyy Runnableen ja invokeLater varmistaa, että elementit
                                                    // suoritetaan kun ne on kaikki valmiina -tarpeen Swing-juttujen kanssa
                                                    // lukemani perusteella.  

    }
}
