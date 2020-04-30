//an eg. of menu driven program

import java.awt.*;
import java.awt.event.*;

class Prog99 extends Frame implements ActionListener, ItemListener
{
	MenuBar mbar;
	Menu mfile,mformat;
	MenuItem mexit;
	CheckboxMenuItem mbold,mitalic;
	Label l;
	Font f = new Font("Arial",Font.BOLD,25);
	
	public static void main(String args[])
	{
		new Prog99();
	}
	
	Prog99()
	{
		setBounds(400,250,500,500);
		setLayout(new FlowLayout());
		
		l = new Label("Databyte Computers");
		
		l.setFont(f);
		
		mbar = new MenuBar();
		mfile = new Menu("File");
		mformat = new Menu("Format");
		mexit = new MenuItem("Exit");
		mbold = new CheckboxMenuItem("Bold",true);
		mitalic = new CheckboxMenuItem("Italic");
		
		add(l);
		setMenuBar(mbar);	//not add() for menu bar
		
		mbar.add(mfile);
		mbar.add(mformat);
		
		mfile.add(mexit);
		mformat.add(mbold);
		mformat.add(mitalic);
		
		mexit.addActionListener(this);
		mbold.addItemListener(this);
		mitalic.addItemListener(this);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(mbold.getState())
		{
		
			if(mitalic.getState())
				f = new Font("Arial",Font.BOLD|Font.ITALIC,25);
			else
				f = new Font("Arial",Font.BOLD,25);
		}
		else
		{
			if(mitalic.getState())
				f = new Font("Arial",Font.ITALIC,25);
			else
				f = new Font("Arial",Font.PLAIN,25);
		}
		l.setFont(f);
	}
}
			
