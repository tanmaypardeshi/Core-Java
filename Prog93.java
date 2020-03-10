//an example of a radiobutton

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
					
/*<applet code="Prog93.java" width="500" height="500"></applet>*/

public class Prog93 extends Applet implements ItemListener
{
	Label l;
	CheckboxGroup rbgl;
	Checkbox radm,radum;
	
	public void init()
	{
		setFont(new Font("Arial", Font.BOLD,22));
		setLayout(null);
		
		l = new Label("Marital Status");
		rbgl = new CheckboxGroup();
		radm = new Checkbox("Married",rbgl,true);
		//all 3 parameters are mandatory for radio button
		radum = new Checkbox("Unamrried", rbgl, false);
		
		l.setBounds(50,50,200,30);
		radm.setBounds(50,120,150,30);
		radum.setBounds(200,120,160,30);
		
		radm.addItemListener(this);
		radum.addItemListener(this);
		
		add(l);
		add(radm);
		add(radum);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("I am " + rbgl.getSelectedCheckbox().getLabel(),50,220);
		
		//long cut
		Checkbox c = rbgl.getSelectedCheckbox();
		String caption = c.getLabel();
		g.drawString("I am " + caption,50,300);
	}
}

