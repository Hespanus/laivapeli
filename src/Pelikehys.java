import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;






public class Pelikehys extends JFrame {

    Laskinikkuna laskinikkuna;

    
    Pelikehys(){

        laskinikkuna = new Laskinikkuna();

        
        this.setTitle("Laivanupotus");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        
        this.setSize(1600, 800);
        this.setVisible(true);
        this.add(laskinikkuna);
        


        

    }
}
