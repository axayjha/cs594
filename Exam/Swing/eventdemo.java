// Credits: Shreya Sil
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class eventdemo
{
	JLabel jlab;
	eventdemo()
	{
		JFrame jfrm=new JFrame("an event example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220,30);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbtnAlpha= new JButton("alpha");
		JButton jbtnBeta= new JButton("beta");
		jbtnAlpha.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jlab.setText("alpha was pressed");
			}
		});
		jbtnBeta.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jlab.setText("beta was pressed");
			}
		});
		jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);
		jlab=new JLabel("press a button");
		jfrm.add(jlab);
		jfrm.setVisible(true);

	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new eventdemo();
			}
		});
	}
}
