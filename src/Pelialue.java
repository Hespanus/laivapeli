import javax.swing.JPanel;
import java.awt.*;

public class Pelialue extends JPanel {
    
	
	
	static final int rivit = 12;
	  static final int sarakkeet = 24;
	  
	  static final int alkuX = 0;
	  static final int alkuY = 0;
	  static final int nelioSivu = 50;

      
	  @Override
	  public void paintComponent(Graphics g) {
		  super.paintComponent(g);
		  
		  for(int i= 0; i<rivit + 1; i++) {
			  g.drawLine(alkuX, alkuY + i * nelioSivu, alkuX + sarakkeet * nelioSivu, alkuY + i * nelioSivu);
		  }
		  for(int i= 0; i< sarakkeet + 1; i++) {
			  g.drawLine(alkuX + i * nelioSivu, alkuY, alkuX + i * nelioSivu, alkuY + rivit * nelioSivu);
		  }
		  
		  
	  
        
    }
	
    
}
