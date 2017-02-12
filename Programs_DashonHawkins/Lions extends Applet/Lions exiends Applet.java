import java-applet.*; 

import java.awt;


//http://pirate.shu.edu/~rwachsmut/Teaching/CSAS2214/Virtual/Lectures/lecture12/1ecture12- 
4.html 

public class Lions extends Applet 
{
	private Button prev = new Button("Previous"); 
	private Button next = new 
	private Image img(l = new Image(a); 
	private String imgNames() {"lions.gif","tigers.gif","bears.gif","ohmy gif"); 
	private int current!mage = O; 
	
	
	public void init() 
	
	{
	Panel buttons = new Panel(); 
	buttons.add(prev); 
	buttons.add(next); 
	setLayout(new Borderlayout()); 
	add("North", buttons); 
	for (int i = O; i < imgNames.length; i++) 
		img[i) null; 
 
	public boolean action(Cvent e, Object o) 
	
	{
		
		if (e.target==prev) 
			handlePrev(); 
		
	else if (o.target next) 
		
		handleNext(); 
		
	return true; 
	
	}
	
	public void paint(Gcaphics g)
	
	{
		
	if (img(currentlmage) null) 
	loadlmage()', 
	g 50, I(X), this); 
	public void loadjmage() 
	try 
	Gng(currentlmage) • 
	irngNameslcurrenttmageJ); 
	catch(txception e) 
	System.err loading image"); 
