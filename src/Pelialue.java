import javax.swing.JPanel;
import java.awt.*;

public class Pelialue extends JPanel {
    
	
	
	static final int rivit = 11;
	  static final int sarakkeet = 23;
	  
	  static final int alkuX = 40;
	  static final int alkuY = 40;
	  static final int nelioSivu = 50;

      
	  @Override
	  public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i= 0; i<rivit + 1; i++) {
			g.drawString(String.valueOf(50*i), 10, (alkuY + i * nelioSivu)+5);
			g.drawLine(alkuX, alkuY + i * nelioSivu, alkuX + sarakkeet * nelioSivu, alkuY + i * nelioSivu);  
		}
		for(int i= 0; i< sarakkeet + 1; i++) {
			g.drawString(String.valueOf(50*i) , alkuX + i * nelioSivu, 30);
			g.drawLine(alkuX + i * nelioSivu, alkuY, alkuX + i * nelioSivu, alkuY + rivit * nelioSivu);
		}
	}
	
    
}
