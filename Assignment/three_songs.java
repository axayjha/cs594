/*<Applet code="three_songs.class" height="300" width="300"> </Applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class three_songs extends Applet implements ActionListener{
	Button b1= new Button("Play");
	Button b2= new Button("Play");
	Button b3= new Button("Play");
	Button b4= new Button("Stop");
	Label l1= new Label("Hear me roar");
	Label l2= new Label("Song of ice and fire");
	Label l3= new Label("Game of Thrones theme");
	AudioClip song1, song2, song3;
	public void init(){
		this.setLayout(null);
		l1.setBounds(0,20, 160, 30);
		add(l1);
		b1.setBounds(180,20, 80, 30);
		b1.addActionListener(this);
		add(b1);

		l2.setBounds(0,50, 160, 30);
		add(l2);
		b2.setBounds(180,50, 80, 30);
		b2.addActionListener(this);
		add(b2);

		l3.setBounds(0,80, 160, 30);
		add(l3);
		b3.setBounds(180,80, 80, 30);
		b3.addActionListener(this);
		add(b3);

		b4.setBounds(90, 120, 80, 30);
		b4.addActionListener(this);
		add(b4);

		song1 = getAudioClip(getCodeBase(), "Rains of Castamere.wav");
		song2 = getAudioClip(getCodeBase(), "Truth.wav");
		song3 = getAudioClip(getCodeBase(), "Game of Thrones theme.wav");

	}
	public void paint(Graphics g){

	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			System.out.println("Playing Rains of Castamere");
			song2.stop();
			song3.stop();
			song1.play();
		}
		else if(e.getSource() == b2){
			System.out.println("Playing Truth");
			song1.stop();
			song3.stop();
			song2.play();

		}
		else if(e.getSource() == b3){
			song1.stop();
			song2.stop();
			song3.play();
			System.out.println("Playing GoT theme");

		}
		else{
			song1.stop();
			song2.stop();
			song3.stop();
			System.out.println("Stopped");
		}

	}
}