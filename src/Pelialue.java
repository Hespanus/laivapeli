import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Pelialue extends JPanel{

	
	
	
	final int xNopeus = 5;
	final int rivit = 11;
	final int sarakkeet = 23;

	  
	final int alkuX = 40;
	final int alkuY = 40;
	final int nelioSivu = 50;

	int laivaX = 640;
	int laivaY = 190;
	static final int laivaHalkaisija = 5;

	/*Timer piirra = new Timer(1000, new ActionListener() {
  
        public void actionPerformed(ActionEvent e) {
            
            move();
            repaint();
         
         
        }
        
       });*/


	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i= 0; i<rivit + 1; i++) {
			g.drawString(String.valueOf(500*i), 10, (alkuY + i * nelioSivu)+5);
			g.drawLine(alkuX, alkuY + i * nelioSivu, alkuX + sarakkeet * nelioSivu, alkuY + i * nelioSivu);  
		}
		for(int i= 0; i< sarakkeet + 1; i++) {
			g.drawString(String.valueOf(500*i) , alkuX + i * nelioSivu, 30);
			g.drawLine(alkuX + i * nelioSivu, alkuY, alkuX + i * nelioSivu, alkuY + rivit * nelioSivu);
		}

		g.setColor(Color.red);
		g.fillOval(laivaX, laivaY, laivaHalkaisija, laivaHalkaisija);
		Toolkit.getDefaultToolkit().sync();
		

	}

	/*public void move() {
		
		laivaX += xNopeus;
		
		
	}
	public void piirrastart(){
		piirra.start();
	}*/



	

	
	
    
}
