//an eg. of Child_Frame

import java.awt.*;
import java.awt.event.*;

class Child_Frame extends Frame implements ActionListener
{
	Button btnclose;
	
	//v.imp. no main() can be called. It can only be called from parent frame
	
	Child_Frame()
	{
		setBounds(550,400,200,200);
		setLayout(new FlowLayout());
		
		btnclose = new Button("Close child frame");
		
		add(btnclose);
		
		btnclose.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}
}
