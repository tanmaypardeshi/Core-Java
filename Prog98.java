/* Design a frame to accept 2 nos. from user and display their sum */

import java.awt.*;
import java.awt.event.*;

class Prog98 extends Frame implements ActionListener
{
	String msg = "";
	Label l1,l2;
	TextField textno1,textno2;
	public static void main(String args[])
	{
		new Prog98();
	}
	Prog98()
	{	
		setBounds(400,250,500,500);
		setFont(new Font("Arial",Font.BOLD,22));
		setLayout(null);
		
		l1 = new Label("No1:- ");
		l2 = new Label("No2:- ");
		
		textno1 = new TextField();
		textno2 = new TextField();
		
		
		l1.setBounds(50,50,100,30);
		l2.setBounds(50,120,100,30);
		
		textno1.setBounds(170,50,100,30);
		textno2.setBounds(170,120,100,30);
		
		add(l1);
		add(l2);
		add(textno1);
		add(textno2);
		
		textno1.addActionListener(this);
		textno2.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int no1 = Integer.parseInt(textno1.getText());
			int no2 = Integer.parseInt(textno2.getText());
			
			msg = "Sum of given numbers is:- " + (no1+no2);
			
		}
		catch(NumberFormatException e)
		{
			msg= "Please enter numbers only";
		}
		repaint();
	}
	
	public void paint(Graphics g)
	{	
		g.drawString(msg,50,300);
	}
}
