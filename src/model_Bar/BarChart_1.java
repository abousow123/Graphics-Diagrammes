package model_Bar;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart_1 extends JFrame {

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	ArrayList<Double> tabValeur;
	ArrayList<String> nom;
	
	JPanel panel ;
	JLayeredPane layeredPane ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart_1 frame = new BarChart_1();
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
	public BarChart_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(27, 24, 46, 14);
		contentPane.add(lblTitre);

		textField = new JTextField();
		textField.setBounds(99, 21, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblCatgorieaxe = new JLabel("CategorieAxe");
		lblCatgorieaxe.setBounds(10, 60, 76, 14);
		contentPane.add(lblCatgorieaxe);

		textField_1 = new JTextField();
		textField_1.setBounds(99, 52, 121, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblVa = new JLabel("ValuAxe");
		lblVa.setBounds(10, 98, 46, 14);
		contentPane.add(lblVa);

		textField_2 = new JTextField();
		textField_2.setBounds(99, 95, 121, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblCatgorie = new JLabel("Cat\u00E9gorie 1");
		lblCatgorie.setBounds(10, 157, 63, 14);
		contentPane.add(lblCatgorie);

		textField_3 = new JTextField();
		textField_3.setBounds(99, 154, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNomLigne = new JLabel("Nom ligne");
		lblNomLigne.setBounds(63, 185, 46, 14);
		contentPane.add(lblNomLigne);

		JLabel lblValeur = new JLabel("Valeur");
		lblValeur.setBounds(161, 185, 46, 14);
		contentPane.add(lblValeur);

		textField_4 = new JTextField();
		textField_4.setBounds(44, 207, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(140, 207, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(44, 238, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(140, 238, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(44, 269, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(140, 269, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblCatgirie = new JLabel("Cat\u00E9girie 2");
		lblCatgirie.setBounds(10, 327, 63, 14);
		contentPane.add(lblCatgirie);

		textField_10 = new JTextField();
		textField_10.setBounds(99, 324, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNo = new JLabel("Nom ligne");
		lblNo.setBounds(63, 352, 46, 14);
		contentPane.add(lblNo);

		JLabel lblValeur_1 = new JLabel("Valeur");
		lblValeur_1.setBounds(161, 352, 46, 14);
		contentPane.add(lblValeur_1);

		textField_11 = new JTextField();
		textField_11.setBounds(44, 377, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(140, 377, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setBounds(44, 401, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setBounds(140, 401, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setBounds(44, 432, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setBounds(140, 432, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel.setVisible(true);
				layeredPane.setLayer(panel, 0, 0);
				

				JFreeChart chart = null;

//				chart = createBarChart1(createBarGroupe(textField.getText(),createTabNom1(),createTabValeur1()));
//
//				ChartPanel frame = new ChartPanel(chart);
//				frame.setBounds(10, 11, 691, 500);
//				//frame.setVisible(true);
//
//				panel.add(frame);
				panel.repaint();

			}
		});
		btnNewButton.setBounds(63, 499, 122, 41);
		contentPane.add(btnNewButton);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.setBounds(236, 24, 711, 554);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		panel = new JPanel(null);
		panel.setBounds(10, 11, 691, 532);
		layeredPane.add(panel);

		tabValeur = new ArrayList<>();
		nom = new ArrayList<>();
		
		
	}

	public ArrayList<Double> createTabValeur1() {
		ArrayList<Double> a = new ArrayList<>();

		tabValeur.add(new Double(textField_5.getText()));
		tabValeur.add(new Double(textField_7.getText()));
		tabValeur.add(new Double(textField_9.getText()));
		tabValeur.add(new Double(textField_12.getText()));
		tabValeur.add(new Double(textField_14.getText()));
		tabValeur.add(new Double(textField_16.getText()));
		
		a = tabValeur;
		return a;

	}

	public ArrayList<String> createTabNom1() {
		ArrayList<String> b = new ArrayList<>();

		nom.add(textField_4.getText());
		nom.add(textField_6.getText());
		nom.add(textField_8.getText());
		nom.add(textField_11.getText());
		nom.add(textField_13.getText());
		nom.add(textField_15.getText());
		
		b = nom;
		return b;
	}

	public DefaultCategoryDataset createBarGroupe(ArrayList<String> nomGroupe,ArrayList<String> nom,ArrayList<Double> valeur) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		

		for (int i = 0; i < nom.size(); i++) {
			
			dataset.setValue(valeur.get(i), nom.get(i), nomGroupe.get(i));
			
		}

		
		return dataset;
	}

	public JFreeChart createBarChart1(DefaultCategoryDataset dataset) {
		JFreeChart chart = null;

		chart = ChartFactory.createBarChart(textField.getText(),
				textField_1.getText(), textField_2.getText(), dataset,
				PlotOrientation.VERTICAL, true, true, false);
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setRangeGridlinePaint(java.awt.Color.black);

		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setSeriesPaint(0, java.awt.Color.blue);
		renderer.setSeriesPaint(1, java.awt.Color.green);
		renderer.setSeriesPaint(2, java.awt.Color.orange);
		renderer.setItemMargin(0.01);

		renderer.setDrawBarOutline(false);

		return chart;
	}

	public JFreeChart createAriaChart1(DefaultCategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createAreaChart(textField.getText(),
				textField_1.getText(), textField_2.getText(), dataset,
				PlotOrientation.VERTICAL, true, true, false);
		
		return chart ;

	}
}
