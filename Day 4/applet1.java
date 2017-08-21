/*
OOP Lab: Day 4
Q2. WAP to create an applet with background colour "yellow".
The applet should display the message "Hello World" with blue
coloued font. Also display a message "This is my applet" in
the status bar of the applet window.

Akshay Anand
CSE 5th Sem

*/

import java.applet.*;
import java.awt.*;
public class applet1 extends Applet{
    public void paint(Graphics g)
    { 
        setBackground(Color.YELLOW);
        g.setColor(Color.BLUE);
        g.drawString("Hello world", 20, 10);
        
        showStatus("This is my applet");
    }
}

/* <applet code="applet1.class" width=100 height=400> 
   </applet> */