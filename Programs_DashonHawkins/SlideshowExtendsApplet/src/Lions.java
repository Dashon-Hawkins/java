import java.applet.*;
import java.awt.*;

//http://pirate.shu.edu/~wachsmut/Teaching/CSAS2214/Virtual/Lectures/lecture12/lecture12-4.html


public class Lions extends Applet

{

	private Button prev = new Button ("Preview");
	private Button next = new Button ("Next");
	private Image img[] = new Image[4];
	private String imgNames[] = {"lions.gif","tigers.gif",
	"bears.gif","ohmy.gif"};
	private int currentImage = 0
			
	public void init()
	
	{
		
	Panel buttons=new Panel();
	buttons.add(prev);
	buttons.add(next);
	setLayout(new BorderLayout());
	add("North", buttons);
	for (int i=0;<imgNames.legnth;i++)
		img[i]=null;	
			
	}
	
	 {
		// TODO Auto-generated method stub

	}

}
