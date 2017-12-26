package modelAreaChart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



import javax.swing.ButtonGroup;
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
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JRadioButton;

public class Area1 extends JFrame {

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

	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;
	JLayeredPane layeredPane;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	ButtonGroup group;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area1 frame = new Area1();
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
	public Area1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 285, 525);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(10, 11, 54, 22);
		panel.add(lblTitre);

		textField = new JTextField();
		textField.setBounds(74, 12, 201, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblArea = new JLabel("Area 1");
		lblArea.setBounds(18, 70, 46, 14);
		panel.add(lblArea);

		textField_1 = new JTextField();
		textField_1.setBounds(74, 67, 107, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblX.setBounds(73, 91, 24, 28);
		panel.add(lblX);

		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblY.setBounds(154, 98, 46, 14);
		panel.add(lblY);

		textField_2 = new JTextField();
		textField_2.setBounds(33, 130, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(129, 130, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(33, 161, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(129, 161, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(33, 192, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(129, 192, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblArea_1 = new JLabel("Area 2");
		lblArea_1.setBounds(18, 250, 46, 14);
		panel.add(lblArea_1);

		textField_8 = new JTextField();
		textField_8.setBounds(74, 247, 107, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblX_1 = new JLabel("X");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblX_1.setBounds(74, 278, 46, 14);
		panel.add(lblX_1);

		JLabel lblY_1 = new JLabel("Y");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblY_1.setBounds(154, 278, 46, 14);
		panel.add(lblY_1);

		textField_9 = new JTextField();
		textField_9.setBounds(33, 303, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(129, 303, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(33, 334, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(129, 334, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setBounds(33, 365, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setBounds(129, 365, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton.isSelected()) {
					panel_1.setVisible(true);
					layeredPane.setLayer(panel_1, 0, 0);
					panel_2.setVisible(false);
					panel_3.setVisible(false);

					JFreeChart chart = createAriaChart(textField.getText(),
							"X", "Y", createDatasetLine(), true);
					ChartPanel chartPanel = new ChartPanel(chart);
					chartPanel.setBounds(10, 11, 500, 440);

					panel_1.add(chartPanel);
					panel_1.repaint();
				}

				if (rdbtnNewRadioButton_1.isSelected()) {
					panel_2.setVisible(true);
					layeredPane.setLayer(panel_2, 0, 0);
					panel_1.setVisible(false);
					panel_3.setVisible(false);

					JFreeChart chart = createStackedAreaChart(textField.getText(),
							"X", "Y",createDataset(),true);
					ChartPanel chartPanel = new ChartPanel(chart);
					chartPanel.setBounds(10, 11, 500, 440);

					panel_2.add(chartPanel);
					panel_2.repaint();
				}

				if (rdbtnNewRadioButton_2.isSelected()) {
					panel_3.setVisible(true);
					layeredPane.setLayer(panel_3, 0, 0);
					panel_1.setVisible(false);
					panel_2.setVisible(false);

					JFreeChart chart = createStepAreaChart(createDataset());
					ChartPanel chartPanel = new ChartPanel(chart);
					chartPanel.setBounds(10, 11, 500, 440);

					panel_3.add(chartPanel);
					panel_3.repaint();
				}
			}
		});
		btnNewButton.setBounds(74, 481, 95, 33);
		panel.add(btnNewButton);

		rdbtnNewRadioButton = new JRadioButton("XYArea");
		rdbtnNewRadioButton.setBounds(74, 392, 77, 23);
		panel.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("StackedXYArea");
		rdbtnNewRadioButton_1.setBounds(70, 444, 99, 23);
		panel.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("StepArea");
		rdbtnNewRadioButton_2.setBounds(74, 418, 109, 23);
		panel.add(rdbtnNewRadioButton_2);

		group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null,
				null, null));
		layeredPane.setBounds(305, 11, 572, 514);
		contentPane.add(layeredPane);

		panel_1 = new JPanel(null);
		panel_1.setBounds(10, 11, 552, 492);
		layeredPane.add(panel_1);

		panel_2 = new JPanel(null);
		panel_2.setBounds(10, 11, 552, 492);
		layeredPane.add(panel_2);

		panel_3 = new JPanel(null);
		panel_3.setBounds(10, 11, 552, 492);
		layeredPane.add(panel_3);

		panel_1.setVisible(false);
		panel_2.setVisible(false);
		panel_3.setVisible(false);
	}

	private XYDataset createDatasetLine() {
		XYSeries serie1 = new XYSeries(textField_1.getText());
		serie1.add(new Integer(textField_2.getText()),
				new Integer(textField_3.getText()));
		serie1.add(new Integer(textField_4.getText()),
				new Integer(textField_5.getText()));
		serie1.add(new Integer(textField_6.getText()),
				new Integer(textField_7.getText()));

		XYSeries serie2 = new XYSeries(textField_8.getText());
		serie2.add(new Integer(textField_9.getText()),
				new Integer(textField_10.getText()));
		serie2.add(new Integer(textField_11.getText()), new Integer(
				textField_12.getText()));
		serie2.add(new Integer(textField_13.getText()), new Integer(
				textField_14.getText()));

		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(serie1);
		dataset.addSeries(serie2);
		return dataset;
	}

	private TableXYDataset createDataset() {

		DefaultTableXYDataset dataset = new DefaultTableXYDataset();

		XYSeries s1 = new XYSeries(textField_1.getText(), true, false);
		s1.add(new Integer(textField_2.getText()),
				new Integer(textField_3.getText()));
		s1.add(new Integer(textField_4.getText()),
				new Integer(textField_5.getText()));
		s1.add(new Integer(textField_6.getText()),
				new Integer(textField_7.getText()));

		dataset.addSeries(s1);

		XYSeries s2 = new XYSeries(textField_8.getText(), true, false);
		s2.add(new Integer(textField_9.getText()),
				new Integer(textField_10.getText()));
		s2.add(new Integer(textField_11.getText()),
				new Integer(textField_12.getText()));
		s2.add(new Integer(textField_13.getText()),
				new Integer(textField_14.getText()));

		dataset.addSeries(s2);

		return dataset;

	}

	public JFreeChart createAriaChart(String titre, String axeX, String axeY,XYDataset dataset, boolean legende) {
		JFreeChart chart = null;
		if (legende == true) {
			chart = ChartFactory.createXYAreaChart(titre, axeX, axeY, dataset,
					PlotOrientation.VERTICAL, true, true, false);
		} else {
			chart = ChartFactory.createXYAreaChart(titre, axeX, axeY, dataset,
					PlotOrientation.VERTICAL, false, true, false);
		}

		return chart;
	}

	public JFreeChart createStepAreaChart(XYDataset dataset) {
		JFreeChart chart = ChartFactory.createXYAreaChart(textField.getText(),
				"X", "Y", dataset, PlotOrientation.VERTICAL, true, true, false);

		return chart;
	}

	public JFreeChart createStackedAreaChart(String titre, String axeX,String axeY, TableXYDataset dataset, boolean legende) {

		JFreeChart chart = null;

		if (legende == true) {
			chart = ChartFactory.createStackedXYAreaChart(

			titre, axeX, axeY, dataset, // data
					PlotOrientation.VERTICAL, // the plot orientation
					true, // legend
					true, // tooltips
					false // urls
					);
		}else {
			chart = ChartFactory.createStackedXYAreaChart(

					titre, axeX, axeY, dataset, // data
							PlotOrientation.VERTICAL, // the plot orientation
							false, // legend
							true, // tooltips
							false // urls
							);
		}

		
		XYPlot plot = (XYPlot) chart.getPlot();
		// StackedXYAreaRenderer r = (StackedXYAreaRenderer) plot.getRenderer();
		plot.setSeriesRenderingOrder(SeriesRenderingOrder.REVERSE);
		// StackedXYAreaRenderer2 renderer = new StackedXYAreaRenderer2();
		// renderer.setToolTipGenerator(new StandardXYToolTipGenerator());
		// plot.setRenderer(0, renderer);
		return chart;

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
