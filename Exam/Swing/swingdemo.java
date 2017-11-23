//Credits: Shreya Sil
import javax.swing.*;
class swingdemo
{
	swingdemo()
	{
		JFrame jfrm=new JFrame("a simple swing app");
		jfrm.setSize(275,100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab=new JLabel("Swing means powerful");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new swingdemo();
			}
		});
	}
}
