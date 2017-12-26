package model_Principale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.smartcardio.Card;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.BevelBorder;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.GridLayout;

public class InterfaceCentrale1 extends JFrame {

	private JPanel contentPane;
	private JPanel Menu_panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JButton btnQuitter;
	private JButton btnAccuei;
	private JButton btnCrerGraphes;
	private JButton btnCrerGraphes_1;
	private JLabel lconLabel;
	
	PanImage panImage ;
	Interface_Donnee_XY panDonnXY ;
	Interface_Categorie_Donnees panCategoriDonn;
	
	ImageIcon icon ;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	
	private JScrollPane scrollBar; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCentrale1 frame = new InterfaceCentrale1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public InterfaceCentrale1() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[22.00][160.00][:940.00:950px,grow][]", "[121.00,bottom][429.00,fill]"));
		
		panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_3, "cell 1 0,grow");
		panel_3.setLayout(new MigLayout("", "[137.00]", "[100px]"));
		
		panImage = new PanImage() ;
		panImage.setBackground(Color.PINK);
		panCategoriDonn = new Interface_Categorie_Donnees() ;
		panDonnXY = new Interface_Donnee_XY() ;
		
		BufferedImage myPicture = ImageIO.read(new File("images/graphs.jpg"));
		
		lconLabel = new JLabel(new ImageIcon(myPicture));
		
		panel_3.add(lconLabel, "cell 0 0,grow");
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setForeground(Color.RED);
		contentPane.add(panel_2, "cell 2 0,grow");
		panel_2.setLayout(new GridLayout(4,1));
		
		lblNewLabel_2 = new JLabel("Bienvenue \u00E0 TAG   L'outil pour cr\u00E9er des graphiques facilement pour bien visualiser vos donn\u00E9es \u00E0 partir de votre propre PC.");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(" Cr\u00E9ez des graphiques riches, \u00E9l\u00E9gants et color\u00E9s pour les sauvegarder en format PDF ou image.");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Choisir le type de donn\u00E9es pour en suite param\u00E9trer et saisir ses donn\u00E9es du type de graphe choisi");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_4);
		
		Menu_panel = new JPanel();
		Menu_panel.setBackground(SystemColor.activeCaption);
		Menu_panel.setForeground(SystemColor.menu);
		Menu_panel.setBorder(new BevelBorder(BevelBorder.RAISED, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption));
		contentPane.add(Menu_panel, "cell 1 1,grow");
		Menu_panel.setLayout(new MigLayout("", "[18.00]", "[26.00][20.00][34.00][34.00][31.00][31.00][][]"));
		
		lblNewLabel = new JLabel("Menu Principale");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Menu_panel.add(lblNewLabel, "cell 0 0 1 2,alignx center,growy");
		
		btnAccuei = new JButton("Accueil");
		btnAccuei.setBackground(new Color(135, 206, 250));
		btnAccuei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout)(panel_1.getLayout());
			    cl.first(panel_1);
			}
		});
		Menu_panel.add(btnAccuei, "cell 0 2,grow");
		
		btnCrerGraphes = new JButton("Donn\u00E9es X et Y");
		btnCrerGraphes.setBackground(new Color(135, 206, 250));
		btnCrerGraphes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panel_1.getLayout());
			    cl.show(panel_1, "donnXY");
				
			}
		});
		Menu_panel.add(btnCrerGraphes, "cell 0 3,grow");
		
		btnCrerGraphes_1 = new JButton("Cat\u00E9gorie de  Donn\u00E9es");
		btnCrerGraphes_1.setBackground(new Color(173, 216, 230));
		btnCrerGraphes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panel_1.getLayout());
			    cl.last(panel_1);
			}
		});
		Menu_panel.add(btnCrerGraphes_1, "cell 0 4,grow");
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.setBackground(new Color(173, 216, 230));
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Menu_panel.add(btnQuitter, "cell 0 5,grow");
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setForeground(Color.BLUE);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_1, "cell 2 1,grow");
		panel_1.setLayout(new CardLayout(0, 0));
		
        scrollBar = new JScrollPane(panImage,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS) ;
//		scrollBar.setBounds(10, 10, 400, 400);
		
		panel_1.add(scrollBar,"accu") ;
		panel_1.add(panDonnXY,"donnXY") ;
		panel_1.add(panCategoriDonn,"donnC");
		
		//add(scrollBar) ;
		
		
		
		
		
	}
}
