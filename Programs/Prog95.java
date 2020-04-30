/* an eg. of frame which displays the coordinates of a point where the mouse
button is clicked and also display below it the keyboard character types.
Note- To achieve this, we need to register the mouse and keyboard with main
frame */

import java.awt.*; //Frame class
import java.awt.event.*; //MouseListener,KeyListener


class Prog95 extends Frame implements MouseListener,KeyListener,WindowListener
{
	String msg1="", msg2="";
	
	public static void main(String args[])
	{
		//create a frame object
		
		new Prog95();	//nameless object
	}
	Prog95()
	{
		setTitle("An example of frame");
		
		setBounds(400,250,500,500);	//compulsory
		
		setFont(new Font("Arial", Font.BOLD, 25));
		setResizable(false);
		//register mouse and keyboard
		addMouseListener(this);
		addKeyListener(this);
		addWindowListener(this);
		
		setVisible(true);	//false->default value i.e. frames are created
						//in memory but not displayed
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg1,50,100);
		g.drawString(msg2,50,180);
	}
	
	//override the methods of interface 
	public void mouseClicked(MouseEvent me)
	{
		msg1 = "Mouse clicked @ pos " + me.getX() + "," + me.getY();
		repaint();
	}
	
	//provide blank implementation of remaining methods
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	
	public void keyTyped(KeyEvent ke)
	{
		msg2="Key typed is "+ ke.getKeyChar();
		repaint();
	}
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}		
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
