import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.*;


public class AudioDemo2 extends JApplet {
	
	private JLabel credit;
	private JButton playButton;
	private JButton loopButton;
	private JButton stopButton;
	private AudioClip sound;
	
	public void init() {
		setLayout(new FlowLayout());
		
		credit = new JLabel("Audio source: Airplane the movie");
		add(credit);
		
		makeButtons();
		
		sound = getAudioClip(getDocumentBase(), "clearance.wav");
		//System.out.println(getDocumentBase());
	}

	private void makeButtons() {
		playButton = new JButton("Play");
		loopButton = new JButton("Loop");
		stopButton = new JButton("Stop");
		
		playButton.addActionListener(new ButtonListener());
		loopButton.addActionListener(new ButtonListener());
		stopButton.addActionListener(new ButtonListener());
		
		add(playButton);
		add(loopButton);
		add(stopButton);
	}
	
	
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == playButton) {
				sound.play();
			}
			else if (e.getSource() == loopButton) {
				sound.loop();
			}
			else if (e.getSource() == stopButton) {
				sound.stop();
			}
			
		}
		
	}
}
