package model_Principale;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import modelAreaChart.Area1;
import model_Bar.BarChart;
import model_Line.LineChartStraight;
import net.miginfocom.swing.MigLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Interface_Donnee_XY extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	JTextPane textPane;
	JTextPane textPane_1;
	JTextPane textPane_2;
	JTextPane textPane_3;
	JTextPane textPane_4;
	JTextPane textPane_5;
	JTextPane textPane_6;
	JTextPane textPane_7;
	private JTextField textField_7;

	JLabel lblX_1;
	JLabel lblX_2;
	JLabel lblX_3;
	JLabel lblY_1;
	JLabel lblY_2;
	JLabel lblY_3;

	JComboBox comboBox;

	JCheckBox chckbxNewCheckBox_1;
	JCheckBox chckbxd;

	static int counter = 0;
	int decounter = 0;

	String[] typeGraphe = { "Barres", "Linèaire", "Surface", "polar",
			"scatter", "Strep" };

	public Interface_Donnee_XY() {
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setBackground(SystemColor.activeCaptionBorder);
		setLayout(new MigLayout("", "[774.00,grow]",
				"[][34.00][30.00][44.00][51.00][302.00]"));

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED,
				null, null, null, null), "PARAMETRE GRAPHIQUE",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0,
						255)));
		add(panel, "cell 0 0 1 5,grow");
		panel.setLayout(new MigLayout("",
				"[][62.00][131.00][46.00][48.00][][118.00][88px][][][142.00]",
				"[][][][][][][15.00][][]"));

		counter = 0;

		JLabel lblTitre = new JLabel("Titre  Graphique:");
		lblTitre.setForeground(Color.BLACK);
		lblTitre.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblTitre, "cell 5 2,alignx center,aligny center");

		textField_7 = new JTextField();
		panel.add(textField_7, "cell 6 2,growx");
		textField_7.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Type Graphe");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panel.add(lblNewLabel_2, "cell 2 3");

		JLabel lblAxeX = new JLabel("Titre axe X");
		lblAxeX.setForeground(Color.BLACK);
		lblAxeX.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblAxeX, "cell 5 3,alignx right,aligny center");

		textField_1 = new JTextField();
		panel.add(textField_1, "cell 6 3,grow");
		textField_1.setColumns(10);

		comboBox = new JComboBox(typeGraphe);
		panel.add(comboBox, "cell 2 4 2 1,growx");

		JLabel lblAxeY = new JLabel("Titre axe Y");
		lblAxeY.setForeground(Color.BLACK);
		lblAxeY.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblAxeY, "cell 5 4,alignx right");

		textField_2 = new JTextField();
		panel.add(textField_2, "cell 6 4,growx");
		textField_2.setColumns(10);

		JLabel lblSource = new JLabel("Source");
		lblSource.setForeground(Color.BLACK);
		lblSource.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblSource, "cell 5 5,alignx right");

		textField_3 = new JTextField();
		panel.add(textField_3, "cell 6 5,growx");
		textField_3.setColumns(10);

		chckbxd = new JCheckBox("3D");
		panel.add(chckbxd, "flowx,cell 6 7,alignx left");

		chckbxNewCheckBox_1 = new JCheckBox("Legende");
		panel.add(chckbxNewCheckBox_1, "cell 6 7");

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED,
				null, null, null, null), "DONNEES GRAPHIQUE",
				TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		add(panel_1, "cell 0 5,grow");
		panel_1.setLayout(new MigLayout(
				"",
				"[][][][][][60.00,grow][60.00,grow][40.00][60.00,grow][60.00,grow][40.00][60,grow][60,grow][40][60,grow][60,grow][]",
				"[][82.00][][][][][]"));

		JLabel lblCoordonnes = new JLabel("Coordonn\u00E9es:");
		lblCoordonnes.setForeground(Color.RED);
		lblCoordonnes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblCoordonnes, "cell 1 0");

		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblX, "cell 5 0,alignx center");

		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblY, "cell 6 0,alignx center");

		lblX_1 = new JLabel("X");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblX_1.setVisible(false);
		panel_1.add(lblX_1, "cell 8 0,alignx center");

		lblY_1 = new JLabel("Y");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblY_1.setVisible(false);
		panel_1.add(lblY_1, "cell 9 0,alignx center");

		lblX_2 = new JLabel("X");
		lblX_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblX_2.setVisible(false);
		panel_1.add(lblX_2, "cell 11 0,alignx center");

		lblY_2 = new JLabel("Y");
		lblY_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblY_2.setVisible(false);
		panel_1.add(lblY_2, "cell 12 0,alignx center");

		lblX_3 = new JLabel("X");
		lblX_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblX_3.setVisible(false);
		panel_1.add(lblX_3, "cell 14 0,alignx center");

		lblY_3 = new JLabel("Y");
		lblY_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblY_3.setVisible(false);
		panel_1.add(lblY_3, "cell 15 0,alignx center");

		textPane = new JTextPane();
		panel_1.add(textPane, "cell 5 1,grow");

		textPane_1 = new JTextPane();
		panel_1.add(textPane_1, "cell 6 1,grow");

		textPane_2 = new JTextPane();
		textPane_2.setVisible(false);
		panel_1.add(textPane_2, "cell 8 1,grow");

		textPane_3 = new JTextPane();
		textPane_3.setVisible(false);
		panel_1.add(textPane_3, "cell 9 1,grow");

		textPane_4 = new JTextPane();
		textPane_4.setVisible(false);
		panel_1.add(textPane_4, "cell 11 1,grow");

		textPane_5 = new JTextPane();
		textPane_5.setVisible(false);
		panel_1.add(textPane_5, "cell 12 1,grow");

		textPane_6 = new JTextPane();
		textPane_6.setVisible(false);
		panel_1.add(textPane_6, "cell 14 1,grow");

		textPane_7 = new JTextPane();
		textPane_7.setVisible(false);
		panel_1.add(textPane_7, "cell 15 1,grow");

		JLabel lblNo = new JLabel("Nom:");
		lblNo.setForeground(Color.RED);
		lblNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNo, "cell 1 2,alignx center");

		textField = new JTextField();
		panel_1.add(textField, "cell 5 2 2 1,growx");
		textField.setColumns(10);

		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 8 2 2 1,growx");
		textField_4.setVisible(false);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		panel_1.add(textField_5, "cell 11 2 2 1,growx");
		textField_5.setVisible(false);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 14 2 2 1,growx");
		textField_6.setVisible(false);
		textField_6.setColumns(10);

		JButton btnAjouterChamps = new JButton("ajouter champs");
		panel_1.add(btnAjouterChamps, "cell 1 3");

		JButton btnRduireChamp = new JButton("r\u00E9duire champs");
		panel_1.add(btnRduireChamp, "cell 1 4");

		JButton btnVa = new JButton("Cr\u00E9er graphe");
		panel_1.add(btnVa, "cell 7 5 5 2,grow");
		btnVa.setFont(new Font("Tahoma", Font.PLAIN, 15));

		ButPlus1 p = new ButPlus1();
		ButMoins1 o = new ButMoins1();
		butValider v = new butValider();
		btnVa.addActionListener(v);
		btnAjouterChamps.addActionListener(p);
		btnRduireChamp.addActionListener(o);

		System.out.println(counter);

	}

	public class ButPlus1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			counter++;
			if (counter == 1) {
				textPane_2.setVisible(true);
				textPane_3.setVisible(true);
				textField_4.setVisible(true);
				lblY_1.setVisible(true);
				lblX_1.setVisible(true);
			}
			if (counter == 2) {
				textPane_4.setVisible(true);
				textPane_5.setVisible(true);
				textField_5.setVisible(true);
				lblY_2.setVisible(true);
				lblX_2.setVisible(true);
			}
			if (counter == 3) {
				textPane_6.setVisible(true);
				textPane_7.setVisible(true);
				textField_6.setVisible(true);
				lblY_3.setVisible(true);
				lblX_3.setVisible(true);
			}

			if (counter > 3) {
				counter = 3;

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
				textPane_3.setVisible(false);
				textField_4.setVisible(false);
				textPane_2.setText("");
				textPane_3.setText("");
				textField_4.setText("");
				lblY_1.setVisible(false);
				lblX_1.setVisible(false);

				counter = 0;

			}
			if (counter == 2) {
				textPane_4.setVisible(false);
				textPane_5.setVisible(false);
				textField_5.setVisible(false);
				textPane_4.setText("");
				textPane_5.setText("");
				textField_5.setText("");
				lblY_2.setVisible(false);
				lblX_2.setVisible(false);
				counter = 1;
			}
			if (counter == 3) {
				textPane_6.setVisible(false);
				textPane_7.setVisible(false);
				textField_6.setVisible(false);
				textPane_6.setText("");
				textPane_7.setText("");
				textField_6.setText("");
				lblY_3.setVisible(false);
				lblX_3.setVisible(false);

				counter = 2;
			}

		}

	}

	public class butValider implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[1])) {
				JFreeChart chart = null;
				LineChartStraight xy = new LineChartStraight();
				try {
					XYDataset dataset = createXYDataset(counter);
					chart = xy.createFreechartLine(textField_7.getText(),
							textField_1.getText(), textField_2.getText(),
							dataset, chckbxNewCheckBox_1.isSelected());
					ChartFrame frame = new ChartFrame(textField_7.getText(),
							chart);
					frame.setBounds(100, 100, 610, 610);
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erreur de frappe");

				}
			}

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[2])) {
				JFreeChart chart = null;
				Area1 area = new Area1();

				try {
					TableXYDataset dataset = createTableXYDataset(counter);
					if (chckbxd.isSelected()) {
						chart = area.createAriaChart(textField_7.getText(),
								textField_1.getText(), textField_2.getText(),
								dataset, chckbxNewCheckBox_1.isSelected());
						ChartFrame frame = new ChartFrame(
								textField_7.getText(), chart);
						frame.setBounds(100, 100, 610, 610);
						frame.setVisible(true);
					} else {
						chart = area.createStackedAreaChart(
								textField_7.getText(), textField_1.getText(),
								textField_2.getText(), dataset,
								chckbxNewCheckBox_1.isSelected());
						ChartFrame frame = new ChartFrame(
								textField_7.getText(), chart);
						frame.setBounds(100, 100, 610, 610);
						frame.setVisible(true);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erreur de saisi");

				}
			}

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[0])) {
				JFreeChart chart = null;
				BarChart bar = new BarChart();
				try {
					IntervalXYDataset dataset = createIntervalXYDataset(counter);
					if (chckbxd.isSelected()) {
						chart = bar.createXYBarChart(textField_7.getText(),
								textField_1.getText(), textField_2.getText(),
								dataset, chckbxNewCheckBox_1.isSelected());
						ChartFrame frame = new ChartFrame(
								textField_7.getText(), chart);
						frame.setBounds(100, 100, 610, 610);
						frame.setVisible(true);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erreur de saisi");
				}

			}

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[3])) {
				JFreeChart chart = null;

				try {
					XYDataset dataset = createXYDataset(counter);
					chart = ChartFactory.createPolarChart(
							textField_7.getText(), dataset, true, true, false);
					ChartFrame frame = new ChartFrame(textField_7.getText(),
							chart);
					frame.setBounds(100, 100, 610, 610);
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erreur de Saisi");

				}
			}

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[4])) {
				JFreeChart chart = null;

				try {
					XYDataset dataset = createXYDataset(counter);
					chart = ChartFactory.createScatterPlot(
							textField_7.getText(), textField_1.getText(),
							textField_2.getText(), dataset,
							PlotOrientation.HORIZONTAL,
							chckbxNewCheckBox_1.isSelected(), true, false);
					ChartFrame frame = new ChartFrame(textField_7.getText(),
							chart);
					frame.setBounds(100, 100, 610, 610);
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erreur de saisi");

				}
			}

			if (comboBox.getSelectedItem().toString()
					.equalsIgnoreCase(typeGraphe[5])) {
				JFreeChart chart = null;

				try {
					XYDataset dataset = createXYDataset(counter);
					chart = ChartFactory.createXYStepChart(
							textField_7.getText(), textField_1.getText(),
							textField_2.getText(), dataset,
							PlotOrientation.VERTICAL, true, true, false);
					ChartFrame frame = new ChartFrame(textField_7.getText(),
							chart);
					frame.setBounds(100, 100, 610, 610);
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erreur de saisi");

				}
			}
		}

	}

	// *************************************************************
	// TABLEAU DE DONNEES
	// *************************************************************

	public ArrayList<Double> createDonneX_1() {
		ArrayList<Double> tabDonneeX1 = new ArrayList<>();
		String[] a = textPane.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeX1.add(new Double(a[i]));
		}
		return tabDonneeX1;

	}

	public ArrayList<Double> createDonneY_1() {
		ArrayList<Double> tabDonneeY = new ArrayList<>();

		String[] a = textPane_1.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY.add(new Double(a[i]));
		}
		return tabDonneeY;

	}

	public ArrayList<Double> createDonneX_2() {
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

	public ArrayList<Double> createDonneX_3() {
		ArrayList<Double> tabDonneeY3 = new ArrayList<>();

		String[] a = textPane_4.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY3.add(new Double(a[i]));
		}
		return tabDonneeY3;

	}

	public ArrayList<Double> createDonneY_3() {
		ArrayList<Double> tabDonneeY4 = new ArrayList<>();

		String[] a = textPane_5.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY4.add(new Double(a[i]));
		}
		return tabDonneeY4;

	}

	public ArrayList<Double> createDonneX_4() {
		ArrayList<Double> tabDonneeY3 = new ArrayList<>();

		String[] a = textPane_6.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY3.add(new Double(a[i]));
		}
		return tabDonneeY3;

	}

	public ArrayList<Double> createDonneY_4() {
		ArrayList<Double> tabDonneeY4 = new ArrayList<>();

		String[] a = textPane_7.getText().split("\n");
		for (int i = 0; i < a.length; i++) {
			tabDonneeY4.add(new Double(a[i]));
		}
		return tabDonneeY4;

	}

	// ****************************************************
	// XYDATASET
	// ****************************************************

	public XYDataset createXYDataset(int nb) {

		XYSeries serie1 = new XYSeries(textField.getText());
		XYSeries serie2 = new XYSeries(textField_4.getText());
		XYSeries serie3 = new XYSeries(textField_5.getText());
		XYSeries serie4 = new XYSeries(textField_6.getText());

		XYSeriesCollection dataset = new XYSeriesCollection();
		if (nb == 0) {

			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}

			dataset.addSeries(serie1);
		} else if (nb == 1) {
			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			for (int i = 0; i < createDonneX_2().size(); i++) {
				serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

			}
			dataset.addSeries(serie1);
			dataset.addSeries(serie2);
		} else if (nb == 2) {
			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			for (int i = 0; i < createDonneX_2().size(); i++) {
				serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

			}

			for (int i = 0; i < createDonneX_3().size(); i++) {

				serie3.add(createDonneX_3().get(i), createDonneY_3().get(i));
			}

			dataset.addSeries(serie1);
			dataset.addSeries(serie2);
			dataset.addSeries(serie3);
		} else {
			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			for (int i = 0; i < createDonneX_2().size(); i++) {
				serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

			}

			for (int i = 0; i < createDonneX_3().size(); i++) {

				serie3.add(createDonneX_3().get(i), createDonneY_3().get(i));
			}

			for (int i = 0; i < createDonneX_4().size(); i++) {

				serie4.add(createDonneX_4().get(i), createDonneY_4().get(i));

			}
			dataset.addSeries(serie1);
			dataset.addSeries(serie2);
			dataset.addSeries(serie3);
			dataset.addSeries(serie4);
		}

		return dataset;
	}

	// ***********************************************************
	// TableXYDataset
	// ***********************************************************

	private TableXYDataset createTableXYDataset(int nb) {
		XYSeries serie1 = new XYSeries(textField.getText(), true, false);
		XYSeries serie2 = new XYSeries(textField_4.getText(), true, false);
		XYSeries serie3 = new XYSeries(textField_5.getText(), true, false);
		XYSeries serie4 = new XYSeries(textField_6.getText(), true, false);

		DefaultTableXYDataset dataset = new DefaultTableXYDataset();

		try {

			if (nb == 0) {

				for (int i = 0; i < createDonneX_1().size(); i++) {

					serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

				}
				dataset.addSeries(serie1);
			} else if (nb == 1) {
				for (int i = 0; i < createDonneX_1().size(); i++) {

					serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

				}
				for (int i = 0; i < createDonneX_2().size(); i++) {
					serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

				}
				dataset.addSeries(serie1);
				dataset.addSeries(serie2);
			} else if (nb == 2) {
				for (int i = 0; i < createDonneX_1().size(); i++) {

					serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

				}
				for (int i = 0; i < createDonneX_2().size(); i++) {
					serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

				}

				for (int i = 0; i < createDonneX_3().size(); i++) {

					serie3.add(createDonneX_3().get(i), createDonneY_3().get(i));
				}

				dataset.addSeries(serie1);
				dataset.addSeries(serie2);
				dataset.addSeries(serie3);
			} else {
				for (int i = 0; i < createDonneX_1().size(); i++) {

					serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

				}
				for (int i = 0; i < createDonneX_2().size(); i++) {
					serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

				}

				for (int i = 0; i < createDonneX_3().size(); i++) {

					serie3.add(createDonneX_3().get(i), createDonneY_3().get(i));
				}

				for (int i = 0; i < createDonneX_4().size(); i++) {

					serie4.add(createDonneX_4().get(i), createDonneY_4().get(i));

				}
				dataset.addSeries(serie1);
				dataset.addSeries(serie2);
				dataset.addSeries(serie3);
				dataset.addSeries(serie4);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erreur");
			return null;
		}

		return dataset;
	}

	// ***************************************************************
	// IntervalXYDataset
	// ***************************************************************
	private IntervalXYDataset createIntervalXYDataset(int nb) {

		XYSeries serie1 = new XYSeries(textField.getText(), true, false);
		XYSeries serie2 = new XYSeries(textField_4.getText(), true, false);
		XYSeries serie3 = new XYSeries(textField_5.getText(), true, false);
		XYSeries serie4 = new XYSeries(textField_6.getText(), true, false);

		XYSeriesCollection dataset = new XYSeriesCollection();

		if (nb == 0) {

			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			dataset.addSeries(serie1);
		} else if (nb == 1) {
			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			for (int i = 0; i < createDonneX_2().size(); i++) {
				serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

			}
			dataset.addSeries(serie1);
			dataset.addSeries(serie2);
		} else if (nb == 2) {
			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			for (int i = 0; i < createDonneX_2().size(); i++) {
				serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

			}

			for (int i = 0; i < createDonneX_3().size(); i++) {

				serie3.add(createDonneX_3().get(i), createDonneY_3().get(i));
			}

			dataset.addSeries(serie1);
			dataset.addSeries(serie2);
			dataset.addSeries(serie3);
		} else {
			for (int i = 0; i < createDonneX_1().size(); i++) {

				serie1.add(createDonneX_1().get(i), createDonneY_1().get(i));

			}
			for (int i = 0; i < createDonneX_2().size(); i++) {
				serie2.add(createDonneX_2().get(i), createDonneY_2().get(i));

			}

			for (int i = 0; i < createDonneX_3().size(); i++) {

				serie3.add(createDonneX_3().get(i), createDonneY_3().get(i));
			}

			for (int i = 0; i < createDonneX_4().size(); i++) {

				serie4.add(createDonneX_4().get(i), createDonneY_4().get(i));

			}
			dataset.addSeries(serie1);
			dataset.addSeries(serie2);
			dataset.addSeries(serie3);
			dataset.addSeries(serie4);
		}

		return dataset;

	}

}
