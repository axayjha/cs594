/*<applet code="banner" width=300 height=50>
</applet>*/

import java.awt.*;
import java.applet.*;

public class banner extends Applet implements Runnable{
    String msg = "Hello World";
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    public void init(){
        setBackground(Color.CYAN);
        setForeground(Color.RED);
    }

    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run(){
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag) break;
            } catch(InterruptedException e) {}
        }
    }

    public void stop(){
        stopFlag = true;
        t=null;
    }

    public void paint(Graphics g){
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        g.drawString(msg, 50, 30);
    }
}
