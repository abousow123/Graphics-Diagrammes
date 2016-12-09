package model_Bar;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.sun.prism.paint.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

public class BarChart extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	JLayeredPane layeredPane;

	JPanel panel_1;

	ArrayList<Double> tabValeur;
	ArrayList<String> nom;
	private JTextField textField_10;

	ButtonGroup group;

	JRadioButton rSimplBarRadioButton;
	JRadioButton DBarRadioButton;
	JRadioButton rWaterfallRadioButton;
	JRadioButton rdbtnStackedbar;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart frame = new BarChart();
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
	public BarChart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		panel.setBounds(10, 11, 359, 440);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(167, 23, 178, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblTitre = new JLabel("TITRE");
		lblTitre.setBounds(68, 26, 46, 14);
		panel.add(lblTitre);

		textField_1 = new JTextField();
		textField_1.setBounds(189, 102, 127, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(90, 105, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNo = new JLabel("NOM");
		lblNo.setBounds(116, 156, 46, 14);
		panel.add(lblNo);

		JLabel lblValeur = new JLabel("VALEUR");
		lblValeur.setBounds(219, 156, 46, 14);
		panel.add(lblValeur);

		textField_2 = new JTextField();
		textField_2.setBounds(91, 181, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(199, 181, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(91, 212, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(199, 212, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(91, 243, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(199, 243, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(91, 274, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(199, 274, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);

		JButton btnValider = new JButton("VALIDER");
		// btnValider.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		//
		//
		// JFreeChart chart = null;
		//
		// if (rSimplBarRadioButton.isSelected()) {
		// panel_1.setVisible(true);
		// layeredPane.setLayer(panel_1, 0, 0);
		// panel_2.setVisible(false);
		// chart = creteFreeChart(createSimpleBarChart());
		//
		// ChartPanel frame = new ChartPanel(chart);
		// frame.setBounds(5, 10, 400, 410);
		//
		// panel_1.add(frame);
		// panel_1.repaint();
		// }
		//
		// if (DBarRadioButton.isSelected()) {
		//
		// panel_2.setVisible(true);
		// layeredPane.setLayer(panel_2, 0, 0);
		// panel_2.setVisible(false);
		//
		// chart = creteFreeChart3D(createSimpleBarChart());
		//
		// ChartPanel frame = new ChartPanel(chart);
		// frame.setBounds(5, 10, 400, 410);
		//
		// panel_2.add(frame);
		// panel_2.repaint();
		// }
		//

		//
		// // ChartPanel frame = new ChartPanel(chart);
		// // frame.setBounds(5, 10, 400, 410);
		// //
		// // panel_1.add(frame);
		// // panel_1.repaint();
		//
		// }
		// });
		btnValider.setBounds(140, 406, 89, 23);
		panel.add(btnValider);

		textField_10 = new JTextField();
		textField_10.setBounds(167, 54, 178, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblSousTitre = new JLabel("Sous Titre");
		lblSousTitre.setBounds(68, 57, 68, 14);
		panel.add(lblSousTitre);

		rSimplBarRadioButton = new JRadioButton("Simple Bar");
		rSimplBarRadioButton.setBounds(47, 314, 86, 23);
		panel.add(rSimplBarRadioButton);

		DBarRadioButton = new JRadioButton("3D Bar");
		DBarRadioButton.setBounds(140, 314, 76, 23);
		panel.add(DBarRadioButton);

		rWaterfallRadioButton = new JRadioButton("Waterfall Bar");
		rWaterfallRadioButton.setBounds(219, 314, 109, 23);
		panel.add(rWaterfallRadioButton);

		rdbtnStackedbar = new JRadioButton("StackedBar");
		rdbtnStackedbar.setBounds(107, 353, 109, 23);
		panel.add(rdbtnStackedbar);

		group = new ButtonGroup();
		group.add(rSimplBarRadioButton);
		group.add(DBarRadioButton);
		group.add(rWaterfallRadioButton);
		group.add(rdbtnStackedbar);

		layeredPane = new JLayeredPane();
		layeredPane.setForeground(java.awt.Color.GRAY);
		layeredPane.setBounds(379, 566, 771, -567);
		layeredPane.setBackground(java.awt.Color.WHITE);
		layeredPane.setBorder(new CompoundBorder());
		contentPane.add(layeredPane);

		panel_3 = new JPanel(null);
		panel_3.setBounds(379, 11, 720, 498);
		contentPane.add(panel_3);

		panel_4 = new JPanel(null);
		panel_4.setBounds(379, 11, 720, 487);
		contentPane.add(panel_4);

		panel_2 = new JPanel(null);
		panel_2.setBounds(379, 11, 720, 487);
		contentPane.add(panel_2);

		panel_5 = new JPanel(null);
		panel_5.setBounds(379, 11, 720, 498);
		contentPane.add(panel_5);
		panel_5.setVisible(true);

		panel_2.setVisible(false);
		panel_4.setVisible(false);
		panel_3.setVisible(false);

		tabValeur = new ArrayList<>();
		nom = new ArrayList<>();

		event e = new event();
		btnValider.addActionListener(e);
	}

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			JFreeChart chart;

			if (rSimplBarRadioButton.isSelected()) {
				panel_2.setVisible(true);
				layeredPane.setLayer(panel_2, 0, 0);
				panel_4.setVisible(false);
				panel_3.setVisible(false);
				panel_5.setVisible(false);
				chart = creteFreeChart(textField.getText(), textField_1.getText(),
						textField_10.getText(),createBarDataset(textField_1.getText(),
						 createTabNom(),
						createTabValeur()));

				ChartPanel frame = new ChartPanel(chart);
				frame.setBounds(10, 29, 600, 450);
				frame.setVisible(true);

				panel_2.add(frame);
				panel_2.repaint();
			}

			if (DBarRadioButton.isSelected()) {

				panel_3.setVisible(true);
				layeredPane.setLayer(panel_3, 0, 0);
				panel_2.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);

				chart = creteFreeChart3D(textField.getText(), textField_1.getText(),
						textField_10.getText(),createBarDataset(textField_1.getText(),
								 createTabNom(),
								createTabValeur()));

				ChartPanel frame = new ChartPanel(chart);
				frame.setBounds(10, 29, 600, 450);
				// frame.setVisible(true);
				panel_3.add(frame);
				panel_3.repaint();
			}

			if (rWaterfallRadioButton.isSelected()) {
				panel_4.setVisible(true);
				layeredPane.setLayer(panel_4, 0, 0);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_5.setVisible(false);
				chart = creteFreeChartWaterfall(createBarDataset(textField_1.getText(),
						createTabNom(), createTabValeur()));

				ChartPanel frame = new ChartPanel(chart);
				frame.setBounds(10, 29, 600, 450);

				panel_4.add(frame);
				panel_4.repaint();
			}

			if (rdbtnStackedbar.isSelected()) {
				panel_5.setVisible(true);
				layeredPane.setLayer(panel_5, 0, 0);
				panel_4.setVisible(false);
				panel_3.setVisible(false);
				panel_2.setVisible(false);
				chart = createStackedBarChart(createBarDataset(textField_1.getText(),
						createTabNom(), createTabValeur()));

				ChartPanel frame = new ChartPanel(chart);
				frame.setBounds(10, 29, 600, 450);
				frame.setVisible(true);

				panel_5.add(frame);
				panel_5.repaint();
			}
		}
	}

	public DefaultCategoryDataset createBarDataset(String axeX,
			ArrayList<String> nom, ArrayList<Double> valeur) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		for (int i = 0; i < nom.size(); i++) {
			dataset.setValue(valeur.get(i), axeX, nom.get(i));
		}

		return dataset;
	}

	public ArrayList<Double> createTabValeur() {
		ArrayList<Double> a = new ArrayList<>();

		tabValeur.add(new Double(textField_3.getText()));
		tabValeur.add(new Double(textField_5.getText()));
		tabValeur.add(new Double(textField_7.getText()));
		tabValeur.add(new Double(textField_9.getText()));
		a = tabValeur;
		return a;

	}

	public ArrayList<String> createTabNom() {
		ArrayList<String> b = new ArrayList<>();

		nom.add(textField_2.getText());
		nom.add(textField_4.getText());
		nom.add(textField_6.getText());
		nom.add(textField_8.getText());
		b = nom;
		return b;
	}

	public JFreeChart creteFreeChart(String titre, String axeX, String axeY,
			DefaultCategoryDataset dataset) {
		JFreeChart chart = null;

		chart = ChartFactory.createBarChart(titre, axeX, axeY, dataset,
				PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setRangeGridlinePaint(java.awt.Color.black);

		return chart;
	}

	public JFreeChart creteFreeChart3D(String titre, String axeX, String axeY,
			DefaultCategoryDataset dataset) {
		JFreeChart chart = null;

		chart = ChartFactory.createBarChart3D(titre, axeX, axeY, dataset,
				PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setRangeGridlinePaint(java.awt.Color.black);

		// plot.setWeight(5);

		return chart;
	}

	public JFreeChart createStackedBarChart(DefaultCategoryDataset dataset) {
		JFreeChart chart = null;

		chart = ChartFactory.createStackedBarChart(textField.getText(),
				textField_1.getText(), textField_10.getText(), dataset,
				PlotOrientation.VERTICAL, true, true, false);

		return chart;

	}

	public JFreeChart creteFreeChartWaterfall(DefaultCategoryDataset dataset) {
		JFreeChart chart = null;

		chart = ChartFactory.createWaterfallChart(textField.getText(),
				textField_1.getText(), textField_10.getText(), dataset,
				PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setRangeGridlinePaint(java.awt.Color.black);

		return chart;
	}
}
