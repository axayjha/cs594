/*<Applet code="tricolour.class" height="700" width="700"></Applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author akshay
 */
public class tricolour extends Applet implements ActionListener {
    Button b = new Button("Anthem");
    AudioClip audioClip ;
    /**
     * @param args the command line arguments
     */
    public void init(){
        
        this.setLayout(null);
        b.addActionListener(this);
        b.setBounds(50,20,80,30);
        add(b);
        audioClip = getAudioClip(getCodeBase(), "national_anthem.wav");
        
    }
    
    public void actionPerformed(ActionEvent e){
        audioClip.play();
    }
    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(100, 100, 150, 50);
        g.setColor(Color.white);
        g.fillRect(100, 150, 150, 50);
        g.setColor(Color.green);
        g.fillRect(100, 200, 150, 50);
    }
   
    
}
