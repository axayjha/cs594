/*
<applet code = "fonts.class" width = "300" height = "300">
</applet>
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class fonts extends Applet {

    TextField tf = new TextField();
    Button b1 = new Button("Arial");
    Button b2 = new Button("Times Roman");
    Button b3 = new Button("Courier");
    Button b4 = new Button("+");
    Button b5 = new Button("-");   
    
    public void init(){
        this.setLayout(null);
        tf.setBounds(20,20,200,60);
        add(tf);
        b1.setBounds(20,80, 100, 40);
        b1.addActionListener(new ArialHandler());
        add(b1);
        b2.setBounds(20,120,100,40);
        b2.addActionListener(new CourierHandler());
        add(b2);
        b3.setBounds(20,160,100,40);
        b3.addActionListener(new RomanHandler());
        add(b3);
        b4.setBounds(120,80,60,40);
        b4.addActionListener(new PlusHandler());
        add(b4);
        b5.setBounds(120,120,30,20);
        b5.addActionListener(new MinusHandler());
        add(b5);           
        
    }
    
    public void paint(Graphics g){
        tf.setText("Welcome to Java world!");
    }
    
    
    class ArialHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Font myFont = new Font("Arial", Font.PLAIN, tf.getFont().getSize());
            tf.setFont(myFont);
            repaint();
        }
    }
    
    class CourierHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Font myFont = new Font("Courier", Font.PLAIN, tf.getFont().getSize());
            tf.setFont(myFont);
            repaint();
        }
    }
    class RomanHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Font myFont = new Font("Times Roman", Font.PLAIN, tf.getFont().getSize());
            tf.setFont(myFont);
            repaint();
        }
    }
    
    class PlusHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(tf.getFont().getSize()<=48)
            {
                Font newFont = new Font(tf.getFont().getFontName(), Font.PLAIN, tf.getFont().getSize()+2 );;
                tf.setFont(newFont);
                repaint();
            }
        }
    }
    class MinusHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            if(tf.getFont().getSize()>=12)
            {
                Font newFont = new Font(tf.getFont().getFontName(), Font.PLAIN, tf.getFont().getSize()-2 );
                tf.setFont(newFont);
                repaint();
            }
        }
    }
}
