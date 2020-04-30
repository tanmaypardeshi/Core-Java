/* an eg of adapter class. Design a frame in which the background color changes
from reg-green-blue on left-center-right click of mouse button*/

import java.awt.*;
import java.awt.event.*;

class Prog96 extends Frame
{
	public static void main(String args[])
	{
		new Prog96();
	}
	Prog96()
	{
		setBounds(400,250,500,500);
		
		addMouseListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());
		
		setVisible(true);
	}
	//inner class for event handling
	class MyMouseAdapter extends MouseAdapter
	{
		//override reqd method
		public void mouseClicked(MouseEvent me)
		{
			//determine which button is clicked
			if(me.getButton()==1)	//left
				setBackground(Color.RED);
			else if(me.getButton() == 2)	//center
				setBackground(Color.BLUE);
			else	 //right
				setBackground(Color.GREEN);
		}
	}
	
	class MyWindowAdapter extends WindowAdapter 
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}
