/* my first applet to display a welcome message */

import java.applet.*;	//Applet class
import java.awt.*;	//Graphics, Font, Color classes

/*<applet code = "Prog88.class" width="500" height="500"></applet>*/
		
public class Prog88 extends Applet
{
	//declare variables/references to objecrs globally so that
	//they are accessible to all standard methods of Applet class
	
	String msg;
	Font f;
	
	public void init()
	{
		msg = "Welcome to databyte";
		
		f= new Font("Arial", Font.BOLD|Font.ITALIC,25);
		
		/* Font() accept 3 args
		1. Font name as string
		2. Font style as a constant from Font class
		3. Font size as int and in unit pixels
		*/
		
		this.setFont(f);
		
		setBackground(Color.YELLOW);
		setForeground(Color.RED);
		
		//these are also called by this keyword. They are present in
		//component class
		
	}
	public void paint(Graphics g)
	{	
		g.drawString(msg,100,100);
	}
}
