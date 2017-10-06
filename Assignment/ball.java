/*<Applet code="ball.class" height="300" width="300"></Applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ball extends Applet{
    
    Button right = new Button("Right");
    Button left = new Button("Left");
    Button up = new Button("Up");
    Button down = new Button("Down");
    public int location_x =this.getSize().width/2-30;
    public int location_y =(this.getSize().height-70)/2;
    
    
    public void init(){                  
        this.setLayout(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width, dim.height);
        
        down.setBounds(this.getSize().width/2 - 40, this.getSize().height-40, 80, 30);
        add(down);
        down.addActionListener(new downHandler());
        
        up.setBounds(this.getSize().width/2 - 40, this.getSize().height-70, 80, 30);
        add(up);
        up.addActionListener(new upHandler());
        
        left.setBounds(this.getSize().width/2-120, this.getSize().height-40, 80, 30);
        add(left);
        left.addActionListener(new leftHandler());
        
        right.setBounds(this.getSize().width/2+40, this.getSize().height-40, 80, 30);
        add(right);
        right.addActionListener(new rightHandler());
        
        location_x =this.getSize().width/2-30;
        location_y =(this.getSize().height-70)/2;
        
    }
    
    public void paint(Graphics g)
    {       
        
        
        down.setBounds(this.getSize().width/2 - 40, this.getSize().height-40, 80, 30);
        up.setBounds(this.getSize().width/2 - 40, this.getSize().height-70, 80, 30);
        left.setBounds(this.getSize().width/2-120, this.getSize().height-40, 80, 30);
        right.setBounds(this.getSize().width/2+40, this.getSize().height-40, 80, 30);
        g.setColor(Color.yellow);
        g.fillOval(location_x,location_y,60,60);
        
    }   
   
    
    
    class upHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(location_y>0)location_y -= 5;
            repaint();
        }
    }
    class downHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(location_y<Toolkit.getDefaultToolkit().getScreenSize().height-200)location_y += 5;
            repaint();
        }
    }
    class leftHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(location_x>0)location_x -= 5;
            repaint();
        }
    }class rightHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(location_x<Toolkit.getDefaultToolkit().getScreenSize().width-200)location_x += 5;
            repaint();
        }
    }
    
    
    
}
