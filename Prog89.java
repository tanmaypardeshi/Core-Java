//design an applet to wish the user depending upon the time of the day

import java.util.Date;	//to get current time
import java.applet.*;
import java.awt.*;

/*<applet code="Prog89.class" width="500" height="500"></applet>*/

public class Prog89 extends Applet
{
	public void init()
	{
		setFont(new Font("Arial", Font.BOLD,25));
	}
	
	public void paint(Graphics g)
	{
		//create an instance of Date class
		
		Date d = new Date();
		
		int hrs = d.getHours();	//will return the time in hours in
		//24 hour format
		
		String wish= "Good ";
		
		if(hrs<12)
			wish+=" Morning";
		else if(hrs<17)
			wish+=" Afternoon";
		else
			wish+=" Evening";
		
		g.drawString(wish,100,100);
	}
}
