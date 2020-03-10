//an example of a checkbox

import java.applet.*;
import java.awt.*;
import java.awt.event.*;	//ItemEvent class
					//ItemListener interface
					
/*<applet code="Prog92.java" width="500" height="500"></applet>*/

public class Prog92 extends Applet implements ItemListener
{
	Label l;
	
	Checkbox chkhome,chkpc,chkmob;
	
	public void init()
	{
		setFont(new Font("Arial", Font.BOLD,22));
		l = new Label("I own");
		chkhome = new Checkbox("Home",true);
		
		//2nd parameter is optional with default value set to
		//false i.e. it is unchecked
		
		chkhome.setEnabled(false);
		
		chkpc = new Checkbox("PC");
		chkmob = new Checkbox("Mobile", true);
		
		//to switch over to manual layout
		setLayout(null);
		
		//determine position and size of each component
		
		l.setBounds(50,50,100,30);
		chkhome.setBounds(100,110,100,30);
		chkpc.setBounds(100,160,100,30);
		chkmob.setBounds(100,220,150,30);
		
		
		/*setLocation(left,top);
		setSize(width,height);
		setBounds(left,top,width,height);
		*/
		
		add(l);
		add(chkhome);
		add(chkpc);
		add(chkmob);
		
		chkpc.addItemListener(this);
		chkmob.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		//call the print() internally
		repaint();	//refresh the applet window
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawString("Status", 50,280);
		g.setColor(Color.BLUE);
		g.drawString("Home-true",100,340);
		g.drawString("Pc-"+chkpc.getState(),100,400);
		g.drawString("Mobile-"+chkmob.getState(),100,460);
	}
}
		
		
		
		
		
		
		
		
