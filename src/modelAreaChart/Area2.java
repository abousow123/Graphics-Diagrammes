package modelAreaChart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.chart.Chart;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Area2 extends JFrame {

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

	JPanel panel_1;
	JLayeredPane layeredPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area2 frame = new Area2();
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
	public Area2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		panel.setBounds(10, 11, 304, 442);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(10, 11, 46, 14);
		panel.add(lblTitre);

		textField = new JTextField();
		textField.setBounds(84, 11, 170, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Category Axe");
		lblNewLabel.setBounds(10, 64, 100, 14);
		panel.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(132, 61, 122, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblValuesAxe = new JLabel("Values Axe");
		lblValuesAxe.setBounds(10, 101, 78, 14);
		panel.add(lblValuesAxe);

		textField_2 = new JTextField();
		textField_2.setBounds(132, 98, 122, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(64, 138, 46, 14);
		panel.add(lblNom);

		JLabel lblValeur = new JLabel("Valeur");
		lblValeur.setBounds(181, 138, 46, 14);
		panel.add(lblValeur);

		textField_3 = new JTextField();
		textField_3.setBounds(44, 166, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(150, 166, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(44, 197, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(150, 197, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(44, 225, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(150, 225, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				layeredPane.setLayer(panel_1, 0,0);
//				JFreeChart chart = createChart(createDataset()) ;
//				ChartPanel chartPanel = new ChartPanel(chart) ;
//				chartPanel.setBounds(11, 0, 483, 430);
//				
//				panel_1.add(chartPanel) ;
//				panel_1.repaint();
				
			}
		});
		btnValider.setBounds(94, 281, 89, 23);
		panel.add(btnValider);

		layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null,
				null, null));
		layeredPane.setBounds(817, 11, -494, 442);
		contentPane.add(layeredPane);
		
				panel_1 = new JPanel();
				panel_1.setBounds(324, 0, 483, 453);
				contentPane.add(panel_1);
				panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
						null));
	}

	public DefaultCategoryDataset createDataset(String nomSurface,ArrayList<String> nom,ArrayList<Double> valeur) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		for(int i=0;i<nom.size();i++){
			dataset.setValue(valeur.get(i), nomSurface,
					nom.get(i));
		}
		
		
		return dataset;
	}

	public JFreeChart createChart(String titre,String axeX,String axeY,DefaultCategoryDataset dataset,boolean legende) {
		JFreeChart chart = null ;
		
		if(legende==true){
		        chart = ChartFactory.createAreaChart(titre,
				axeX, axeY, dataset,
				PlotOrientation.VERTICAL, true, true, false);
		}
		else {
			chart = ChartFactory.createAreaChart(titre,
					axeX, axeY, dataset,
					PlotOrientation.VERTICAL, false, true, false);
		}
		
		return chart ;
	}
	
	public JFreeChart createAreaSerieChart(String titre,String axeX,String axeY,CategoryDataset dataset,boolean legende) {
		JFreeChart chart = null ;
		
		if(legende==true){
		        chart = ChartFactory.createStackedAreaChart(
		        		titre, // chart title
		        		axeX, // domain axis label
		        		axeY, // range axis label
		        		dataset, // data
		        		PlotOrientation.VERTICAL, // orientation
		        		true, // include legend
		        		true, // tooltips
		        		false // urls
		        		);
		        
		}
		else {
			chart =ChartFactory.createStackedAreaChart(
					titre, // chart title
	        		axeX, // domain axis label
	        		axeY, // range axis label
					dataset, // data
					PlotOrientation.VERTICAL, // orientation
					false, // include legend
					true, // tooltips
					false // urls
					);
		}
		
		
		return chart ;
	}
	
	public JFreeChart createAreaSerieChart3D(String titre,String axeX,String axeY,CategoryDataset dataset,boolean legende) {
		JFreeChart chart = null ;
		
		if(legende==true){
		        chart = ChartFactory.createStackedAreaChart(
		        		titre, // chart title
		        		axeX, // domain axis label
		        		axeY, // range axis label
		        		dataset, // data
		        		PlotOrientation.VERTICAL, // orientation
		        		true, // include legend
		        		true, // tooltips
		        		false // urls
		        		);
		        
		}
		else {
			chart =ChartFactory.createStackedAreaChart(
					titre, // chart title
	        		axeX, // domain axis label
	        		axeY, // range axis label
					dataset, // data
					PlotOrientation.VERTICAL, // orientation
					false, // include legend
					true, // tooltips
					false // urls
					);
		}
		
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setForegroundAlpha(0.5f);
		return chart ;
	}


}
