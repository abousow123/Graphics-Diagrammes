package model_Principale;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import modelAreaChart.Area2;
import model_Bar.BarChart;
import model_Line.LineChartStraight;
import model_Pie.PieChart;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;

import java.awt.Font;
import java.awt.GridLayout;

public class InterfaceCentrale extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	JLabel lblDonnesX ;

	JTextPane textPane;
	JTextPane textPane_1 ;
	JTextPane textPane_2 ;
	JTextPane textPane_6 ;
	JTextPane textPane_4 ;
	JTextPane textPane_5 ;
	JTextPane textPane_3 ;
	JTextPane textPane_9 ;
	JTextPane textPane_10 ;
	JTextPane textPane_11 ;
	JTextPane textPane_8 ;

	JComboBox comboBox;

	String[] typeGraphe = { "Barres", "Linèaire", "Circulaire", "Surface" };
	private JTextField textField_4;
	
	JCheckBox chckbxEnd ;
	JCheckBox chckbxLegende ;
	JCheckBox chckbxWaterfa ;
	
	  int  counter = 0 ;
	  int decounter = 0 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCentrale frame = new InterfaceCentrale();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public InterfaceCentrale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 614);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED,
				null, null, null, null), "Param\u00E9tre Graphe",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0,
						255)));
		panel.setToolTipText("sdsd");
		panel.setBounds(169, 0, 623, 252);
		contentPane.add(panel);
		panel.setLayout(null);

		comboBox = new JComboBox(typeGraphe);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[1])) {
					lblDonnesX.setText("Abou");
					//chckbxEnd.setVisible(false);
					//textField.setVisible(false);
				}
			}
		});
		comboBox.setBounds(233, 21, 100, 20);
		panel.add(comboBox);

		JLabel lblTypeDeGraphe = new JLabel("Type de graphique");
		lblTypeDeGraphe.setBounds(84, 24, 106, 14);
		panel.add(lblTypeDeGraphe);

		JLabel lblTitreGraphique = new JLabel("Titre graphique");
		lblTitreGraphique.setBounds(10, 74, 97, 14);
		panel.add(lblTitreGraphique);

		textField = new JTextField();
		textField.setBounds(143, 71, 127, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblTitreAxeX = new JLabel("Titre Axe X");
		lblTitreAxeX.setBounds(21, 113, 69, 14);
		panel.add(lblTitreAxeX);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 134, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblTitreAxeY = new JLabel("Titre Axe Y");
		lblTitreAxeY.setBounds(144, 113, 62, 14);
		panel.add(lblTitreAxeY);

		textField_2 = new JTextField();
		textField_2.setBounds(130, 134, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		chckbxEnd = new JCheckBox("en 3D");
		chckbxEnd.setBounds(10, 183, 97, 23);
		panel.add(chckbxEnd);

		chckbxLegende = new JCheckBox("Legende");
		chckbxLegende.setBounds(109, 183, 97, 23);
		panel.add(chckbxLegende);

		JCheckBox chckbxAfficherValeurs = new JCheckBox("Afficher Valeurs");
		chckbxAfficherValeurs.setBounds(216, 183, 117, 23);
		panel.add(chckbxAfficherValeurs);

		JLabel lblSource = new JLabel("Source");
		lblSource.setBounds(267, 113, 46, 14);
		panel.add(lblSource);

		textField_4 = new JTextField();
		textField_4.setBounds(247, 134, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10); 
		
		chckbxWaterfa = new JCheckBox("Waterfall");
		chckbxWaterfa.setBounds(349, 183, 97, 23);
		panel.add(chckbxWaterfa);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Donnees graphique",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(169, 257, 623, 297);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		textPane = new JTextPane();
		textPane.setBounds(10, 46, 105, 111);
		panel_1.add(textPane);

		lblDonnesX = new JLabel("Donnees X");
		lblDonnesX.setBounds(10, 21, 62, 14);
		panel_1.add(lblDonnesX);

		JLabel lblDonnesY = new JLabel("Donnees Y");
		lblDonnesY.setBounds(153, 21, 62, 14);
		panel_1.add(lblDonnesY);

		JLabel lblGroupe = new JLabel("Groupe");
		lblGroupe.setBounds(80, 168, 46, 14);
		panel_1.add(lblGroupe);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[2])) {
					JFreeChart chart = null;

					if (chckbxEnd.isSelected()) {
						PieChart pie = new PieChart();
						PieDataset dataset = pie.createPieDataset(
								createDonneX(), createDonneY());
						chart = pie.createChart3D(textField.getText(), dataset,chckbxLegende.isSelected());
						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}

					else {
						PieChart pie = new PieChart();
						PieDataset dataset = pie.createPieDataset(
								createDonneX(), createDonneY());
						chart = pie.createPieChart(textField.getText(), dataset,chckbxLegende.isSelected());
						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}

				}

				// BarChart

				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[0])) {
					JFreeChart chart = null;
					BarChart bar = new BarChart();
					DefaultCategoryDataset dataset = bar.createBarDataset(
							textField_1.getText(), createDonneX(),
							createDonneY());
					if (chckbxEnd.isSelected()) {

						chart = bar.creteFreeChart3D(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								dataset,chckbxLegende.isSelected());

						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}

					else {

						chart = bar.creteFreeChart(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								dataset,chckbxLegende.isSelected());

						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}

				}

				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[3])) {
					JFreeChart chart = null;
					Area2 area = new Area2();
					DefaultCategoryDataset dataset = area.createDataset(
							textField_4.getText(), createDonneX(),
							createDonneY());
					chart = area.createChart(textField.getText(),
							textField_1.getText(), textField_2.getText(),
							dataset,chckbxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[1])) {
					JFreeChart chart = null;
					if (chckbxEnd.isSelected()){
						LineChartStraight line = new LineChartStraight();
						CategoryDataset dataset = line.createLineDataset(
								createDonneX(), createDonneY());
						chart = line.createChartLine3D(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								textField_4.getText(), dataset,chckbxLegende.isSelected());
						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}
					else{
					LineChartStraight line = new LineChartStraight();
					CategoryDataset dataset = line.createLineDataset(
							createDonneX(), createDonneY());
					chart = line.createChartLine(textField.getText(),
							textField_1.getText(), textField_2.getText(),
							textField_4.getText(), dataset,chckbxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
					}
				}
			}
		});
		btnNewButton.setBounds(105, 219, 115, 37);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Toolkit.getDefaultToolkit().beep();
				counter++ ;
				if(counter==1){
					textPane_4.setVisible(true);
					textPane_9.setVisible(true);
				}
				if(counter==2){
					textPane_5.setVisible(true);
					textPane_10.setVisible(true);
				}
				if(counter==3){
					textPane_6.setVisible(true);
					textPane_11.setVisible(true);
				}
				if(counter==4){
					textPane_3.setVisible(true);
					textPane_8.setVisible(true);
					counter = 0 ;
				}
				
				
				System.out.println(""+counter);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button.setBounds(261, 223, 46, 23);
		panel_1.add(button);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(230, 46, 344, 111);
		panel_1.add(panel_2);
		GridLayout g1 = new GridLayout() ;
		GridLayout gl_panel_2 = new GridLayout(1,4);
		gl_panel_2.setHgap(8);
		panel_2.setLayout(gl_panel_2);
		
		textPane_4 = new JTextPane();
		textPane_4.setVisible(false);
		panel_2.add(textPane_4);
		
		textPane_5 = new JTextPane();
		textPane_5.setVisible(false);
		panel_2.add(textPane_5);
		
		textPane_6 = new JTextPane();
		textPane_6.setVisible(false);
		panel_2.add(textPane_6);
		
		textPane_3 = new JTextPane();
		textPane_3.setVisible(false);
		panel_2.add(textPane_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(230, 166, 344, 23);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 8, 0));
		
		textPane_9 = new JTextPane();
		textPane_9.setVisible(false);
		panel_3.add(textPane_9);
		
		textPane_10 = new JTextPane();
		textPane_10.setVisible(false);
		panel_3.add(textPane_10);
		
		textPane_11 = new JTextPane();
		textPane_11.setVisible(false);
		panel_3.add(textPane_11);
		
		textPane_8 = new JTextPane();
		textPane_8.setVisible(false);
		panel_3.add(textPane_8);
		
		textPane_2 = new JTextPane();
		textPane_2.setBounds(139, 46, 81, 111);
		panel_1.add(textPane_2);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(139, 166, 84, 23);
		panel_1.add(textPane_7);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Toolkit.getDefaultToolkit().beep();
				decounter++ ;
				if(decounter==1){
					textPane_4.setVisible(false);
					textPane_9.setVisible(false);
					counter = 0  ;
				}
				if(decounter==2){
					textPane_5.setVisible(false);
					textPane_10.setVisible(false);
				}
				if(decounter==3){
					textPane_6.setVisible(false);
					textPane_11.setVisible(false);
				}
				if(decounter==4){
					textPane_3.setVisible(false);
					textPane_8.setVisible(false);
					decounter = 0 ;
				}
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBounds(317, 223, 46, 23);
		panel_1.add(button_1);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(10, 11, 149, 554);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);

		// tabDonneeX = new ArrayList<>() ;

	}

	public ArrayList<String> createDonneX() {
		ArrayList<String> tabDonneeX = new ArrayList<>();
		String[] a = textPane.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeX.add(a[i]);
		}
		return tabDonneeX;

	}

	public ArrayList<Double> createDonneY() {
		ArrayList<Double> tabDonneeY = new ArrayList<>();

		String[] a = textPane_1.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY.add(new Double(a[i]));
		}
		return tabDonneeY;

	}
}
