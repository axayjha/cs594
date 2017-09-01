import java.applet.*;
import java.awt.*;
/*<Applet code="applet1.class" width="400",height="400">
</Applet>*/
public class applet1 extends Applet
{
	public void paint(Graphics g)
	{
		int w=getSize().width-1;
		int h=getSize().height-1;
                for(int x=0,y=0;x<80&&y<80;)
		{
			//g.drawOval(x,y,w,h);
			Color c1=new Color(x*2,y+2,205);
			g.setColor(c1);
			g.fillOval(x,y,w,h);
			x=x+8;
			y=y+8;
			w=w-16;
                	h=h-16;
                }
                Color c=new Color(22,13,100);
                g.setColor(c);

                g.fillRect(600,400,100,90);
                int a[]= {100,200,343,300,452};
                int b[]={100,200,300,343,654};
                Color d=new Color(22,146,190);
                g.setColor(d);

                g.fillPolygon(a,b,5);
                Color e=new Color(222,146,100);
                g.setColor(e);
                g.fillOval(700,300,200,200);


		
	}
}
