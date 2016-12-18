package model_Principale;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import model_Principale.Panel_XY.ButMoins1;
import model_Principale.Panel_XY.ButPlus1;
import net.miginfocom.swing.MigLayout;

public class Test extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	JTextField textField_7 ;
	JTextPane textPane ;
	JTextPane textPane_1 ;
	JTextPane textPane_2 ;
	JTextPane textPane_3 ;
	JTextPane textPane_4 ;
	JTextPane textPane_5 ;
	JTextPane textPane_6 ;
	JTextPane textPane_7 ;
	
	
	JLabel lblX_1 ;
	JLabel lblX_2 ;
	JLabel lblX_3 ;
	JLabel lblY_1 ;
	JLabel lblY_2 ;
	JLabel lblY_3 ;
	public Test() {
 
setLayout(new MigLayout("", "[][grow][][][58.00,grow][][20px:60.00:90px,right][20px:60.00:90px,right][20px:36.00:90px][60.00,right][60.00,right][92.00px][60.00,right][60.00,right][36.00][60.00][60.00]", "[][grow][34.00][30.00][44.00][117.00][17.00][23.00][22.00][][48.00,grow][50px:105.00,bottom][50px:48.00,bottom][24.00,bottom][][][][][]"));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "PARAMETRE GRAPHIQUE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		add(panel, "cell 0 1 17 9,grow");
		panel.setLayout(new MigLayout("", "[][77.00][grow][left][74.00][grow][][grow][][][][][][][][][][][][][][][][][]", "[][][][][][][]"));
		
		JLabel lblNewLabel_2 = new JLabel("Type Graphe");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_2, "cell 4 1");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 5 1,growx");
		
		JLabel lblTitre = new JLabel("Titre :");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblTitre, "cell 1 3 2 1,alignx center");
		
		textField_7 = new JTextField();
		panel.add(textField_7, "cell 3 3 2 1,growx");
		textField_7.setColumns(10);
		
		JLabel lblAxeX = new JLabel("Axe X");
		panel.add(lblAxeX, "cell 1 4,alignx center,aligny center");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 3 4,growx");
		textField_1.setColumns(10);
		
		JLabel lblAxeY = new JLabel("Axe Y");
		panel.add(lblAxeY, "cell 4 4,alignx center");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 5 4,growx");
		textField_2.setColumns(10);
		
		JLabel lblSource = new JLabel("Source");
		panel.add(lblSource, "cell 8 4,alignx trailing");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 9 4,growx");
		textField_3.setColumns(10);
		
		JCheckBox chckbxd = new JCheckBox("3D");
		panel.add(chckbxd, "cell 3 6,alignx center");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Legende");
		panel.add(chckbxNewCheckBox_1, "cell 4 6");
		
		JCheckBox chckbxAfficher = new JCheckBox("Afficher Valeur");
		panel.add(chckbxAfficher, "cell 5 6");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "DONNEES GRAPHIQUE", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		add(panel_1, "cell 0 10 17 6,grow");
		panel_1.setLayout(new MigLayout("", "[][][][][][][60.00][60.00][40.00][60.00][60.00][40.00][60][60][40][60][60][][][][]", "[][][144.00][][][]"));
		
		JLabel lblCoordonnes = new JLabel("Coordonn\u00E9es:");
		panel_1.add(lblCoordonnes, "cell 1 1");
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblX, "cell 6 1,alignx center");
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblY, "cell 7 1,alignx center");
		
		lblX_1 = new JLabel("X");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblX_1.setVisible(false);
		panel_1.add(lblX_1, "cell 9 1,alignx center");
		
		lblY_1 = new JLabel("Y");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblY_1.setVisible(false);
		panel_1.add(lblY_1, "cell 10 1,alignx center");
		
		lblX_2 = new JLabel("X");
		lblX_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblX_2.setVisible(false);
		panel_1.add(lblX_2, "cell 12 1,alignx center");
		
		lblY_2 = new JLabel("Y");
		lblY_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblY_2.setVisible(false);
		panel_1.add(lblY_2, "cell 13 1,alignx center");
		
		lblX_3 = new JLabel("X");
		lblX_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblX_3.setVisible(false);
		panel_1.add(lblX_3, "cell 15 1,alignx center");
		
		lblY_3 = new JLabel("Y");
		lblY_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblY_3.setVisible(false);
		panel_1.add(lblY_3, "cell 16 1,alignx center");
		
		textPane = new JTextPane();
		panel_1.add(textPane, "cell 6 2,grow");
		
		textPane_1 = new JTextPane();
		panel_1.add(textPane_1, "cell 7 2,grow");
		
		textPane_2 = new JTextPane();
		textPane_2.setVisible(false);
		panel_1.add(textPane_2, "cell 9 2,grow");
		
		textPane_3 = new JTextPane();
		textPane_3.setVisible(false);
		panel_1.add(textPane_3, "cell 10 2,grow");
		
		textPane_4 = new JTextPane();
		textPane_4.setVisible(false);
		panel_1.add(textPane_4, "cell 12 2,grow");
		
		textPane_5 = new JTextPane();
		textPane_5.setVisible(false);
		panel_1.add(textPane_5, "cell 13 2,grow");
		
		textPane_6 = new JTextPane();
		textPane_6.setVisible(false);
		panel_1.add(textPane_6, "cell 15 2,grow");
		
		textPane_7 = new JTextPane();
		textPane_7.setVisible(false);
		panel_1.add(textPane_7, "cell 16 2,grow");
		
		JLabel lblNo = new JLabel("Nom:");
		panel_1.add(lblNo, "cell 1 3");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 6 3 2 1,growx");
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 9 3 2 1,growx");
		textField_4.setVisible(false);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		panel_1.add(textField_5, "cell 12 3 2 1,growx");
		textField_5.setVisible(false);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 15 3 2 1,growx");
		textField_6.setVisible(false);
		textField_6.setColumns(10);
		
		JButton button = new JButton("+");
		panel_1.add(button, "cell 6 5");
		
		JButton button_1 = new JButton("-");
		panel_1.add(button_1, "cell 7 5");
		
		JButton btnVa = new JButton("VALIDER");
		add(btnVa, "cell 6 17 2 2,growx");
		
		//ButPlus1 p = new ButPlus1() ;
		//ButMoins1 o = new ButMoins1() ;
		//button.addActionListener(p);
		//button_1.addActionListener(o);

	}

}
