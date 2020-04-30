/* an eg. of anonymous inner class.
design a frame in which the background color of frame changes to some
random color on clock of mouse button */

import java.awt.*;
import java.awt.event.*;

class Prog97 extends Frame
{
	public static void main(String args[])
	{
		new Prog97();
	}
	Prog97()
	{
		setBounds(400,250,500,500);
		
		addMouseListener(new MouseAdapter()
		{
			/*scope of anonymous inner class which inherits MouseAdapter*/
			public void mouseClicked(MouseEvent me)
			{
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				setBackground(new Color(r,g,b));
			}
		});
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
}
