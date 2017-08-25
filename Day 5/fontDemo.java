import java.applet.*;
import java.awt.*;
public class fontDemo extends Applet{
    public void paint(Graphics g)
    { 
        setBackground(Color.YELLOW);	
        g.setColor(Color.BLUE);
	String msg="";
	String fontlist[];
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	fontlist = ge.getAvailableFontFamilyNames();
	for(int count=0; count<fontlist.length-80; count++)
	{
		msg = fontlist[count];		
		Font myFont = new Font(msg, Font.ITALIC, 10);		
		g.setFont(myFont);
		g.drawString(msg, 20, count*10);
	}

        
        showStatus("This is my applet");
    }
}

/* <applet code="fontDemo.class" width=500 height=2000> 
   </applet> */