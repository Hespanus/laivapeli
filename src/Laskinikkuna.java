import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;





public class Laskinikkuna implements Runnable {
    
    @Override
    public void run(){

        JFrame ikkuna = new JFrame();
        ikkuna.setTitle("Laskin");
        ikkuna.setSize(300, 600);
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);

    }
}
