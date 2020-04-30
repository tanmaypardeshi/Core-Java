//an eg. of Parent_Frame

import java.awt.*;
import java.awt.event.*;

class Parent_Frame extends Frame implements ActionListener
{
	Button btnchild,btnexit;
	
	public static void main(String args[])
	{
		new Parent_Frame();
	}
	
	Parent_Frame()
	{
		setBounds(400,250,500,500);
		//for frames, default layout is set to null
		//set it to auto layout
		
		setLayout(new FlowLayout());
		
		btnchild = new Button("Open Child Frame");
		btnexit = new Button("Termiate Application");
		
		add(btnchild);
		add(btnexit);
		
		btnchild.addActionListener(this);
		btnexit.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == btnchild)
			new Child_Frame();
		else
			System.exit(0);
	}
}	
		
		
		
		
