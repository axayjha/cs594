import java.applet.*;
import java.awt.*;
public class circles extends Applet{
    public void paint(Graphics g)
    { 
	String colorlist[];
        setBackground(Color.YELLOW);	
	int size=500, location=250;
	
	for(int i=90; i<200; i+=10)
	{
		g.setColor(new Color(i, i, i));
		g.fillOval(location, location, size, size);
		location+=25;
		size-=50;
	}	
	
    }
}

/* <applet code="circles.class" width=800 height=1000> 
   </applet> */