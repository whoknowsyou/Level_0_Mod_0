package learning_random;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiceRoll{
	JFrame window = new JFrame("Roll the Dice!");
	JPanel panel = new JPanel();
	JButton rollButton = new JButton("CLICK HERE TO ROLL");
	JLabel label = new JLabel();
	
	BufferedImage oneImg;
	BufferedImage twoImg;
	BufferedImage threeImg;
	BufferedImage fourImg;
	BufferedImage fiveImg;
	BufferedImage sixImg;
	
	public void run(){
		try {
			oneImg = ImageIO.read(this.getClass().getResourceAsStream("one_dice.jpeg"));
			twoImg = ImageIO.read(this.getClass().getResourceAsStream("two_dice.jpeg"));
			threeImg = ImageIO.read(this.getClass().getResourceAsStream("three_dice.jpeg"));
			fourImg = ImageIO.read(this.getClass().getResourceAsStream("four_dice.jpeg"));
			fiveImg = ImageIO.read(this.getClass().getResourceAsStream("five_dice.jpeg"));
			sixImg = ImageIO.read(this.getClass().getResourceAsStream("six_dice.jpeg"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		label.setIcon(new ImageIcon(oneImg));
		
		rollButton.addActionListener((e)->{
			
			//1. Make randomChoice equal to a random number between 1 and 6
			int randomChoice = 0;
			
			
			//2. Fix the code below so that it displays the correct image
			if(randomChoice == 0){
				label.setIcon(new ImageIcon(oneImg));
			}else if(randomChoice == 0){
				label.setIcon(new ImageIcon(twoImg));
			}else if(randomChoice == 0){
				label.setIcon(new ImageIcon(threeImg));
			}
			else if(randomChoice == 0){
				label.setIcon(new ImageIcon(fourImg));
			}
			else if(randomChoice == 0){
				label.setIcon(new ImageIcon(fiveImg));
			}
			else{
				label.setIcon(new ImageIcon(sixImg));
			}
		});
		
		panel.setPreferredSize(new Dimension(700, 700));
		panel.add(rollButton);
		panel.add(label);
		window.add(panel);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}
	
	public static void main(String[] args) {
		new DiceRoll().run();
	}
}