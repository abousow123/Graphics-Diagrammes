package model_Principale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelAreaChart.Area2;
import model_Bar.BarChart;
import model_Pie.PieChart;
import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.UIManager;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;

public class InterfaceCentrale extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	JTextPane textPane;
	JTextPane textPane_1;

	JComboBox comboBox;

	String[] typeGraphe = { "Barres", "Linèaire", "Circulaire", "Surface" };
	private JTextField textField_4;

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
		setBounds(100, 100, 709, 614);
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
		panel.setBounds(128, 11, 555, 252);
		contentPane.add(panel);
		panel.setLayout(null);

		comboBox = new JComboBox(typeGraphe);
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

		JCheckBox chckbxEnd = new JCheckBox("en 3D");
		chckbxEnd.setBounds(10, 183, 97, 23);
		panel.add(chckbxEnd);

		JCheckBox chckbxLegende = new JCheckBox("Legende");
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

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Donn\u00E9es graphique",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(128, 274, 555, 291);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		textPane = new JTextPane();
		textPane.setBounds(10, 46, 115, 111);
		panel_1.add(textPane);

		JLabel lblDonnesX = new JLabel("Donn\u00E9es X");
		lblDonnesX.setBounds(10, 21, 62, 14);
		panel_1.add(lblDonnesX);

		textPane_1 = new JTextPane();
		textPane_1.setBounds(173, 46, 115, 111);
		panel_1.add(textPane_1);

		JLabel lblDonnesY = new JLabel("Donn\u00E9es Y");
		lblDonnesY.setBounds(177, 21, 62, 14);
		panel_1.add(lblDonnesY);

		JLabel lblGroupe = new JLabel("Groupe");
		lblGroupe.setBounds(117, 171, 46, 14);
		panel_1.add(lblGroupe);

		textField_3 = new JTextField();
		textField_3.setBounds(173, 168, 115, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[2])) {
					JFreeChart chart = null ;
					
					if(chckbxEnd.isSelected()){
						PieChart pie = new PieChart();
						PieDataset dataset = pie.createPieDataset(createDonneX(),
								createDonneY());
						chart = pie.createChart3D(textField.getText(), dataset);
						ChartFrame frame = new ChartFrame(textField.getText(), chart) ;
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}
					
					else {
						PieChart pie = new PieChart();
						PieDataset dataset = pie.createPieDataset(createDonneX(),
								createDonneY());
						chart = pie.createPieChart(textField.getText(), dataset);
						ChartFrame frame = new ChartFrame(textField.getText(), chart) ;
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}
					
				}
				
				//BarChart
				
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[0])) {
					JFreeChart chart = null ;
					BarChart bar = new BarChart() ;
					DefaultCategoryDataset dataset = bar.createBarDataset(textField_1.getText(), createDonneX(), createDonneY()) ;
					if(chckbxEnd.isSelected()){
						
						chart = bar.creteFreeChart3D(textField.getText(),textField_1.getText(),textField_2.getText(), dataset) ;
					
						ChartFrame frame = new ChartFrame(textField.getText(), chart) ;
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}
					
					else {
						
						chart = bar.creteFreeChart(textField.getText(),textField_1.getText(),textField_2.getText(), dataset) ;
						
						ChartFrame frame = new ChartFrame(textField.getText(), chart) ;
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}
					
				}
				
				if (comboBox.getSelectedItem().toString().equalsIgnoreCase(typeGraphe[3])){
					JFreeChart chart = null ;
					Area2 area = new Area2() ;
					DefaultCategoryDataset dataset = area.createDataset(textField_4.getText(), createDonneX(), createDonneY()) ;
					chart = area.createChart(textField.getText(), textField_1.getText(), textField_2.getText(), dataset) ;
					ChartFrame frame = new ChartFrame(textField.getText(), chart) ;
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(105, 243, 115, 37);
		panel_1.add(btnNewButton);

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
