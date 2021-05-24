import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class Pelialue extends JPanel implements Runnable{

	Thread thread;
    
	Random numGen = new Random();
	int xRand = numGen.nextInt(1150 - 400 + 1) + 400;
	int yRand = numGen.nextInt(550 - 200 + 1) + 200;

	int laivaX = 60;
	int laivaY = 60;
	
	static final int laivaHalkaisija = 20;
	static final int xNopeus = 4;
	static final int yNopeus = 2;
	static final int rivit = 11;
	static final int sarakkeet = 23;

	  
	static final int alkuX = 40;
	static final int alkuY = 40;
	static final int nelioSivu = 50;

	Pelialue(){
		thread = new Thread(this);
		thread.start();
	}

	public void move() {
		if (laivaX < (xRand+30)) {
			laivaX += xNopeus;
		}
		if (laivaY < (yRand+30)) {
			laivaY += yNopeus;
		}
	
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
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

	public void run(){

        long lastTime = System.nanoTime();
        double amountOfTicks =64.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while(true) {
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            if(delta >=1){
                move();
				repaint();
                delta--;
            }
           
        }
    }

	
	
    
}
