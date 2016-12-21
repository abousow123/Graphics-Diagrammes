package model_Principale;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import modelAreaChart.Area1;
import modelAreaChart.Area2;
import model_Bar.BarChart;
import model_Bar.BarChart_1;
import model_Line.LineChartStraight;
import model_Line.LineChartXY;
import model_Pie.PieChart;
import net.miginfocom.swing.MigLayout;

import javax.swing.JTextPane;
import javax.swing.JButton;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;

import javax.swing.JRadioButton;

public class Panel_Categorie extends JPanel {

	static int counter = 0;
	int decounter = 0;

	String[] typeGraphe = { "Barres", "Linèaire", "Circulaire", "Surface" };
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	JCheckBox chckbx3D;
	JCheckBox CheckBoxLegende;
	JCheckBox chckbxAfficherValeurs;

	JLabel lblDonnesX;
	JLabel lblDonnesY;
	JLabel lblDonnesY_1;
	JLabel lblDonnesY_2;
	JLabel lblDonnesY_3;
	JLabel lblDonnesY_4;

	JTextPane textPane;

	JTextPane textPane_1;

	JTextPane textPane_2;

	JTextPane textPane_3;

	JTextPane textPane_4;

	JTextPane textPane_5;

	JButton button;

	JButton btnVa;

	JButton button_1;
	
	JLabel lblGroupes ;

	JComboBox comboBox;
	private JCheckBox chckbxWaterfa;

	JButton buttonPlus;

	JButton buttonMoins;
	private JRadioButton rdbtnDonnesSi;
	private JRadioButton rdbtnSriesDeDonnes;
	ButtonGroup group;

	/**
	 * Create the panel.
	 */
	public Panel_Categorie() {
		setLayout(new MigLayout("", "[grow]",
				"[][][126.00,grow][][][grow][grow]"));

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.PINK, null,
				null, null));
		add(panel, "cell 0 2,grow");
		panel.setLayout(new MigLayout(
				"",
				"[][100px:118.00:200px,grow][15.00][100px:n:200px][][][15px][][][15.00][][][]",
				"[][][][][]"));

		JLabel lblTypeGraphe = new JLabel("Type Graphe");
		panel.add(lblTypeGraphe, "cell 3 0,alignx center");

		comboBox = new JComboBox(typeGraphe);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[1]) || comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[2])) {
					buttonPlus.setEnabled(false);
					textField_4.setVisible(false);
					lblGroupes.setVisible(false);
					
				}
				if (comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[0]) || comboBox.getSelectedItem().toString()
						.equalsIgnoreCase(typeGraphe[3])) {
					buttonPlus.setEnabled(true);
					textField_4.setVisible(true);
					lblGroupes.setVisible(true);
					
				}
			}
		});
		panel.add(comboBox, "cell 4 0 2 1,growx");

		rdbtnDonnesSi = new JRadioButton("Donn\u00E9es Simple");
		panel.add(rdbtnDonnesSi, "cell 7 0");

		rdbtnSriesDeDonnes = new JRadioButton("S\u00E8ries de donn\u00E9es");
		panel.add(rdbtnSriesDeDonnes, "cell 7 1");

		group = new ButtonGroup();
		group.add(rdbtnDonnesSi);
		group.add(rdbtnSriesDeDonnes);

		JLabel lblTitreGraphe = new JLabel("Titre Graphe:");
		panel.add(lblTitreGraphe, "cell 0 2,alignx trailing");

		textField = new JTextField();
		panel.add(textField, "cell 1 2,growx");
		textField.setColumns(10);

		JLabel lblAxeX = new JLabel("Axe X:");
		panel.add(lblAxeX, "cell 2 2,alignx trailing");

		textField_1 = new JTextField();
		panel.add(textField_1, "cell 3 2,growx,aligny baseline");
		textField_1.setColumns(10);

		JLabel lblAxeY = new JLabel("Axe Y:");
		panel.add(lblAxeY, "cell 4 2,alignx trailing");

		textField_2 = new JTextField();
		panel.add(textField_2, "cell 5 2,growx");
		textField_2.setColumns(10);

		JLabel lblSource = new JLabel("Source:");
		panel.add(lblSource, "cell 6 2,alignx center");

		textField_3 = new JTextField();
		panel.add(textField_3, "cell 7 2,growx");
		textField_3.setColumns(10);

		chckbx3D = new JCheckBox("3D");
		panel.add(chckbx3D, "cell 2 4");

		CheckBoxLegende = new JCheckBox("Legende");
		panel.add(CheckBoxLegende, "cell 3 4");

		chckbxAfficherValeurs = new JCheckBox("Afficher Valeurs");
		panel.add(chckbxAfficherValeurs, "cell 5 4");

		chckbxWaterfa = new JCheckBox("Waterfall");
		panel.add(chckbxWaterfa, "cell 6 4");

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		add(panel_1, "cell 0 4 1 3,grow");
		panel_1.setLayout(new MigLayout(
				"",
				"[108.00][][62.00,grow,right][pref!][62.00,grow,right][][62px,grow,right][][62px,grow][][62,grow][]",
				"[25.00][][74.00,grow][40.00][][][][][]"));

		lblDonnesX = new JLabel("Donn\u00E9es X");
		panel_1.add(lblDonnesX, "cell 0 1");

		lblDonnesY = new JLabel("Donn\u00E9es Y");
		panel_1.add(lblDonnesY, "cell 2 1,alignx center");

		lblDonnesY_1 = new JLabel("Donn\u00E9es Y");
		panel_1.add(lblDonnesY_1, "cell 4 1,alignx center");

		lblDonnesY_2 = new JLabel("Donn\u00E9es Y");
		panel_1.add(lblDonnesY_2, "cell 6 1,alignx center");

		lblDonnesY_3 = new JLabel("Donn\u00E9es Y");
		panel_1.add(lblDonnesY_3, "cell 8 1,alignx center");

		lblDonnesY_4 = new JLabel("Donn\u00E9es Y");
		panel_1.add(lblDonnesY_4, "cell 10 1,alignx center");

		textPane = new JTextPane();
		panel_1.add(textPane, "cell 0 2 1 2,grow");

		textPane_1 = new JTextPane();
		panel_1.add(textPane_1, "cell 2 2 1 2,grow");

		textPane_2 = new JTextPane();
		panel_1.add(textPane_2, "cell 4 2 1 2,grow");

		textPane_3 = new JTextPane();
		panel_1.add(textPane_3, "cell 6 2 1 2,grow");

		textPane_4 = new JTextPane();
		panel_1.add(textPane_4, "cell 8 2 1 2,grow");

		textPane_5 = new JTextPane();
		panel_1.add(textPane_5, "cell 10 2 1 2,grow");

		lblGroupes = new JLabel("Groupes:");
		panel_1.add(lblGroupes, "cell 0 4,alignx right");

		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 2 4,growx");
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		panel_1.add(textField_5, "cell 4 4,growx");
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 6 4,growx");
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		panel_1.add(textField_7, "cell 8 4,growx");
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		panel_1.add(textField_8, "cell 10 4,growx");
		textField_8.setColumns(10);

		buttonPlus = new JButton("+");
		// buttonPlus.setEnabled(false);
		panel_1.add(buttonPlus, "flowx,cell 0 6,alignx left");

		btnVa = new JButton("VALIDER");
		panel_1.add(btnVa, "cell 4 8 3 1,grow");

		buttonMoins = new JButton("-");
		panel_1.add(buttonMoins, "cell 0 6");

		textPane_2.setVisible(false);
		textPane_3.setVisible(false);
		textPane_4.setVisible(false);
		textPane_5.setVisible(false);

		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textField_7.setVisible(false);
		textField_8.setVisible(false);

		lblDonnesY_1.setVisible(false);
		lblDonnesY_2.setVisible(false);
		lblDonnesY_3.setVisible(false);
		lblDonnesY_4.setVisible(false);

		if (counter == 0) {
			buttonMoins.setVisible(false);
		}
		ButPlus1 p = new ButPlus1();
		ButMoins1 m = new ButMoins1();
		Valide1 va = new Valide1();

		buttonPlus.addActionListener(p);
		buttonMoins.addActionListener(m);
		btnVa.addActionListener(va);

	}

	public class ButPlus1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			counter++;

			if (counter == 1) {
				textPane_2.setVisible(true);
				lblDonnesY_1.setVisible(true);
				textField_5.setVisible(true);
				buttonMoins.setVisible(true);
			}
			if (counter == 2) {
				textPane_3.setVisible(true);
				lblDonnesY_2.setVisible(true);
				textField_6.setVisible(true);
				buttonMoins.setVisible(true);
			}
			if (counter == 3) {
				textPane_4.setVisible(true);
				lblDonnesY_3.setVisible(true);
				textField_7.setVisible(true);
				buttonMoins.setVisible(true);
			}
			if (counter == 4) {
				textPane_5.setVisible(true);
				lblDonnesY_4.setVisible(true);
				textField_8.setVisible(true);
				buttonMoins.setVisible(true);
				buttonPlus.setEnabled(false);

			}

			if (counter > 4) {
				counter = 4;
				

			}

			System.out.println("" + counter);

		}

	}

	public class ButMoins1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Toolkit.getDefaultToolkit().beep();
			decounter++;
			if (counter == 1) {
				textPane_2.setVisible(false);
				lblDonnesY_1.setVisible(false);
				textField_5.setVisible(false);
				textPane_2.setText("");
				textField_5.setText("");

				counter = 0;
				buttonMoins.setVisible(false);
				buttonPlus.setEnabled(true);

			}
			if (counter == 2) {
				textPane_3.setVisible(false);
				lblDonnesY_2.setVisible(false);
				textField_6.setVisible(false);
				textPane_3.setText("");
				textField_6.setText("");

				counter = 1;
				buttonPlus.setEnabled(true);
			}
			if (counter == 3) {
				textPane_4.setVisible(false);
				lblDonnesY_3.setVisible(false);
				textField_7.setVisible(false);
				textPane_4.setText("");
				textField_7.setText("");

				counter = 2;
				buttonPlus.setEnabled(true);
			}
			if (counter == 4) {
				textPane_5.setVisible(false);
				lblDonnesY_4.setVisible(false);
				textField_8.setVisible(false);
				textPane_5.setText("");
				textField_8.setText("");

				counter = 3;
				buttonPlus.setEnabled(true);
			}

		}

	}

	public class Valide1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {


			// BarChart

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[0])) {
				if (rdbtnDonnesSi.isSelected()) {
					JFreeChart chart = null;
					BarChart bar = new BarChart();

					DefaultCategoryDataset dataset = bar.createBarDataset(
							textField_1.getText(), createDonneX(),
							createDonneY());
					if (chckbxWaterfa.isSelected()) {
						chart = bar.creteFreeChartWaterfall(
								textField.getText(), textField_1.getText(),
								textField_2.getText(), dataset,
								CheckBoxLegende.isSelected());

						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					} else {
						if (chckbx3D.isSelected()) {

							chart = bar.creteFreeChart3D(textField.getText(),
									textField_1.getText(),
									textField_2.getText(), dataset,
									CheckBoxLegende.isSelected());

							ChartFrame frame = new ChartFrame(
									textField.getText(), chart);
							frame.setBounds(100, 100, 709, 614);
							frame.setVisible(true);
						}

						else {

							chart = bar.creteFreeChart(textField.getText(),
									textField_1.getText(),
									textField_2.getText(), dataset,
									CheckBoxLegende.isSelected());

							ChartFrame frame = new ChartFrame(
									textField.getText(), chart);
							frame.setBounds(100, 100, 709, 614);
							frame.setVisible(true);
						}
					}

				}

				if (rdbtnSriesDeDonnes.isSelected()) {
					JFreeChart chart = null;
					BarChart_1 b = new BarChart_1();
					DefaultCategoryDataset dataset = createBarDataset(counter);
					chart = b.createBarChart1(dataset);
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}

			}
			
			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[1])) {
				JFreeChart chart = null;
				if (chckbx3D.isSelected()) {
					LineChartStraight line = new LineChartStraight();
					CategoryDataset dataset = line.createLineDataset(
							createDonneX(), createDonneY());
					chart = line.createChartLine3D(textField.getText(),
							textField_1.getText(), textField_2.getText(),
							textField_3.getText(), dataset,
							CheckBoxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				} else {
					LineChartStraight line = new LineChartStraight();
					CategoryDataset dataset = line.createLineDataset(
							createDonneX(), createDonneY());
					chart = line.createChartLine(textField.getText(),
							textField_1.getText(), textField_2.getText(),
							textField_3.getText(), dataset,
							CheckBoxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}
			}

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[2])) {
				JFreeChart chart = null;
				buttonPlus.setEnabled(true);

				if (chckbx3D.isSelected()) {
					PieChart pie = new PieChart();
					PieDataset dataset = pie.createPieDataset(createDonneX(),
							createDonneY());
					chart = pie.createChart3D(textField.getText(), dataset,
							CheckBoxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}

				else {
					PieChart pie = new PieChart();
					PieDataset dataset = pie.createPieDataset(createDonneX(),
							createDonneY());
					chart = pie.createPieChart(textField.getText(), dataset,
							CheckBoxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}

			}
			
			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[3])) {
				if (rdbtnDonnesSi.isSelected()) {
					JFreeChart chart = null;

					Area2 area = new Area2();
					DefaultCategoryDataset dataset = area.createDataset(
							textField_4.getText(), createDonneX(),
							createDonneY());
					chart = area.createChart(textField.getText(),
							textField_1.getText(), textField_2.getText(),
							dataset, CheckBoxLegende.isSelected());
					ChartFrame frame = new ChartFrame(textField.getText(),
							chart);
					frame.setBounds(100, 100, 709, 614);
					frame.setVisible(true);
				}

				if (rdbtnSriesDeDonnes.isSelected()) {
					JFreeChart chart = null;
					Area2 b = new Area2();
					if (chckbx3D.isSelected()) {
						CategoryDataset dataset = createAreaDataset(counter);
						chart = b.createAreaSerieChart3D(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								dataset, CheckBoxLegende.isSelected());
						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					} else {
						CategoryDataset dataset = createAreaDataset(counter);
						chart = b.createAreaSerieChart(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								dataset, CheckBoxLegende.isSelected());
						ChartFrame frame = new ChartFrame(textField.getText(),
								chart);
						frame.setBounds(100, 100, 709, 614);
						frame.setVisible(true);
					}
				}

			}


		}

	}

	public ArrayList<Double> createDonneY() {
		ArrayList<Double> tabDonneeY = new ArrayList<>();

		String[] a = textPane_1.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY.add(new Double(a[i]));
		}
		return tabDonneeY;

	}

	public ArrayList<String> createDonneX() {
		ArrayList<String> tabDonneeX = new ArrayList<>();
		String[] a = textPane.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeX.add(a[i]);
		}
		return tabDonneeX;

	}

	public ArrayList<Double> createDonneY_1() {
		ArrayList<Double> tabDonneeY1 = new ArrayList<>();

		String[] a = textPane_2.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY1.add(new Double(a[i]));
		}
		return tabDonneeY1;

	}

	public ArrayList<Double> createDonneY_2() {
		ArrayList<Double> tabDonneeY2 = new ArrayList<>();

		String[] a = textPane_3.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY2.add(new Double(a[i]));
		}
		return tabDonneeY2;

	}

	public ArrayList<Double> createDonneY_3() {
		ArrayList<Double> tabDonneeY3 = new ArrayList<>();

		String[] a = textPane_4.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY3.add(new Double(a[i]));
		}
		return tabDonneeY3;

	}

	public ArrayList<Double> createDonneY_4() {
		ArrayList<Double> tabDonneeY4 = new ArrayList<>();

		String[] a = textPane_5.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY4.add(new Double(a[i]));
		}
		return tabDonneeY4;

	}

	// public ArrayList<String> tabGroupe() {
	// ArrayList<String> groupe = new ArrayList<>();
	// groupe.add(textPane_7.getText());
	// groupe.add(txtpnScxc.getText());
	// groupe.add(textPane_10.getText());
	// groupe.add(textPane_11.getText());
	// groupe.add(textPane_8.getText());
	//
	// return groupe;
	// }

	public DefaultCategoryDataset createBarDataset(int nb) {
		ArrayList<String> nom = createDonneX();
		ArrayList<Double> y0 = createDonneY();

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		if (nb == 0) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(createDonneY().get(i), nom.get(i),
						textField_4.getText());

			}
		}
		if (nb == 1) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
			}
		}

		if (nb == 2) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
				dataset.addValue(createDonneY_2().get(i), nom.get(i),
						textField_6.getText());
			}
		}

		if (nb == 3) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
				dataset.addValue(createDonneY_2().get(i), nom.get(i),
						textField_6.getText());
				dataset.addValue(createDonneY_3().get(i), nom.get(i),
						textField_7.getText());
			}
		}

		if (nb == 4) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
				dataset.addValue(createDonneY_2().get(i), nom.get(i),
						textField_6.getText());
				dataset.addValue(createDonneY_3().get(i), nom.get(i),
						textField_7.getText());
				dataset.addValue(createDonneY_4().get(i), nom.get(i),
						textField_8.getText());
			}
		}

		return dataset;

	}

	public CategoryDataset createAreaDataset(int nb) {
		ArrayList<String> nom = createDonneX();
		ArrayList<Double> y0 = createDonneY();

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		if (nb == 0) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(createDonneY().get(i), nom.get(i),
						textField_4.getText());

			}
		}
		if (nb == 1) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
			}
		}

		if (nb == 2) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
				dataset.addValue(createDonneY_2().get(i), nom.get(i),
						textField_6.getText());
			}
		}

		if (nb == 3) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
				dataset.addValue(createDonneY_2().get(i), nom.get(i),
						textField_6.getText());
				dataset.addValue(createDonneY_3().get(i), nom.get(i),
						textField_7.getText());
			}
		}

		if (nb == 4) {
			for (int i = 0; i < nom.size(); i++) {
				dataset.addValue(y0.get(i), nom.get(i), textField_4.getText());
				dataset.addValue(createDonneY_1().get(i), nom.get(i),
						textField_5.getText());
				dataset.addValue(createDonneY_2().get(i), nom.get(i),
						textField_6.getText());
				dataset.addValue(createDonneY_3().get(i), nom.get(i),
						textField_7.getText());
				dataset.addValue(createDonneY_4().get(i), nom.get(i),
						textField_8.getText());
			}
		}

		return dataset;

	}

}
