package model_Principale;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JScrollBar;

public class PanImage extends JPanel {
	
	JLabel lblNewLabel ;
	JLabel lblNewLabel_1 ;
	JLabel lblNewLabel_2 ;
	JLabel lblNewLabel_3 ;
	JLabel lblNewLabel_4 ;
	JLabel lblNewLabel_5 ;
	

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public PanImage() throws IOException {
		setBackground(new Color(238, 232, 170));
		setLayout(new GridLayout(2, 3));
		
		BufferedImage bar1 = ImageIO.read(new File("images/Bar.png"));
		BufferedImage bar2 = ImageIO.read(new File("images/vbar.jpg"));
		BufferedImage cir = ImageIO.read(new File("images/Circu.png"));
		BufferedImage line = ImageIO.read(new File("images/line.png"));
		BufferedImage surface = ImageIO.read(new File("images/Area.jpg"));
		BufferedImage po = ImageIO.read(new File("images/po.png"));
		
		lblNewLabel = new JLabel(new ImageIcon(bar1));
		add(lblNewLabel, "cell 2 1");
		
		lblNewLabel_1 = new JLabel(new ImageIcon(bar2));
		add(lblNewLabel_1, "cell 7 1");
		
		lblNewLabel_2 = new JLabel(new ImageIcon(cir));
		add(lblNewLabel_2, "cell 14 1");
		
		lblNewLabel_3 = new JLabel(new ImageIcon(line));
		add(lblNewLabel_3, "cell 2 5");
		
		lblNewLabel_4 = new JLabel(new ImageIcon(surface));
		add(lblNewLabel_4, "cell 7 5");
		
		lblNewLabel_5 = new JLabel(new ImageIcon(po));
		add(lblNewLabel_5, "cell 12 5 3 1");
		
		

	}

}
