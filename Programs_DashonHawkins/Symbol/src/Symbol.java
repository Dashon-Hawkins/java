import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt. *;

public class Symbol extends JApplet
{
	public void paint (Graphics canvas)
	{
		super.paint(canvas);
		
		
		Graphics2D oval1 = (Graphics2D) canvas;
		Graphics2D oval2 = (Graphics2D) canvas;
		Graphics2D oval3 = (Graphics2D) canvas;
		Graphics2D oval4 = (Graphics2D) canvas;
		Graphics2D oval5 = (Graphics2D) canvas;
		
		oval1.setStroke(new BasicStroke(8));			
		oval2.setStroke(new BasicStroke(8));
		oval3.setStroke(new BasicStroke(8));
		oval4.setStroke(new BasicStroke(8));
		oval5.setStroke(new BasicStroke(8));

		oval1.setColor(Color.BLUE);		
		oval1.drawOval(100,  50,  200,  200);
		
		oval2.setColor(Color.BLACK);
		oval2.drawOval(350,  50, 200, 200);
		
		oval3.setColor(Color.RED);		
		oval3.drawOval(600,  50, 200, 200);
		
		oval4.setColor(Color.YELLOW);		
		oval4.drawOval(225,  150, 200, 200);
		
		oval5.setColor(Color.GREEN);
		oval5.drawOval(475,  150, 200, 200);
		
			}
}
