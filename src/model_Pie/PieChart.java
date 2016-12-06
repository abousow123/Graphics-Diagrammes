package model_Pie;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;

public class PieChart extends JFrame {

	private JPanel contentPane;

	ArrayList<String> arrays;
	ArrayList<Double> d;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	JRadioButton rdbtnPiechart ;
	JRadioButton rdbtndpiechart ;
	
	ButtonGroup group ;
	
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNo;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	JLayeredPane layeredPane ;
	private JPanel panel_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PieChart frame = new PieChart();
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
	public PieChart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 324, 338);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(149, 26, 170, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitre.setBounds(45, 26, 94, 20);
		panel.add(lblTitre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 99, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 130, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(45, 161, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(45, 192, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnVa = new JButton("VALIDER");
		btnVa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFreeChart chart = null ;
				if(rdbtnPiechart.isSelected()){
					panel_1.setVisible(true);
					layeredPane.setLayer(panel_1, 0,0);
					panel_2.setVisible(false);
				chart = createChart(createDataset());
				
				ChartPanel pan = new ChartPanel(chart) ;
				pan.setBounds(10, 11, 551, 450);
				
				panel_1.add(pan) ;
				panel_1.repaint();
				}
				if(rdbtndpiechart.isSelected()){
					panel_2.setVisible(true);
					layeredPane.setLayer(panel_2, 0,0);
					panel_1.setVisible(false);
					
					chart = createChartD(createDataset()) ;
					
					ChartPanel pan = new ChartPanel(chart) ;
					pan.setBounds(10, 11, 551, 450);
					
					panel_2.add(pan) ;
					panel_2.repaint();
				}
				
				
			}
		});
		btnVa.setBounds(85, 291, 134, 36);
		panel.add(btnVa);
		
		 rdbtnPiechart = new JRadioButton("PieChart");
		rdbtnPiechart.setBounds(68, 240, 86, 23);
		panel.add(rdbtnPiechart);
		
	    rdbtndpiechart = new JRadioButton("3DPieChart");
		rdbtndpiechart.setBounds(156, 240, 109, 23);
		panel.add(rdbtndpiechart);
		
		group = new ButtonGroup() ;
		group.add(rdbtnPiechart);
		group.add(rdbtndpiechart);
		
		textField_5 = new JTextField();
		textField_5.setBounds(149, 99, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(149, 130, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(149, 161, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(149, 192, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		lblNo = new JLabel("NOM");
		lblNo.setBounds(68, 74, 46, 14);
		panel.add(lblNo);
		
		lblNewLabel = new JLabel("Valeur");
		lblNewLabel.setBounds(173, 74, 46, 14);
		panel.add(lblNewLabel);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.setBounds(344, 11, 581, 526);
		contentPane.add(layeredPane);
		
		panel_1 = new JPanel(null);
		panel_1.setBounds(10, 11, 551, 504);
		layeredPane.add(panel_1);
		
		panel_2 = new JPanel(null);
		panel_2.setBounds(10, 11, 551, 504);
		layeredPane.add(panel_2);

		panel_1.setVisible(false);
		panel_2.setVisible(false);
		arrays = new ArrayList<>();
		d = new ArrayList<>();

	}

	private PieDataset createDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();

		ArrayList<String> c = new ArrayList<>();
		ArrayList<Double> d = new ArrayList<>() ;
        d = createTabDouble() ;
		c = createTable();

		for (int i = 0; i < 4; i++) {

			dataset.setValue(c.get(i), new Double(d.get(i)));

		}

//		for (int i = 0; i < 4; i++) {
//
//			c.remove(i) ;
//
//		}

		// dataset.setValue(textField.getText(), new Double(43.2));
		// dataset.setValue(textField_1.getText(), new Double(10.0));
		// dataset.setValue(textField_2.getText(), new Double(27.5));
		// dataset.setValue(textField_3.getText(), new Double(17.5));

		System.out.println("Donner : " + c.get(0));
		System.out.println(c.size());

		return dataset;
	}

	public ArrayList<String> createTable() {
		ArrayList<String> a = new ArrayList<>();

		String b = textField_1.getText();
		arrays.add(b);
		arrays.add(textField_2.getText());
		arrays.add(textField_3.getText());
		arrays.add(textField_4.getText());
		
		a = arrays;
		return a;
	}
	
	public ArrayList<Double> createTabDouble(){
		ArrayList<Double> b = new ArrayList<>();
		d.add(new Double(textField_5.getText()));
		d.add(new Double(textField_6.getText()));
		d.add(new Double(textField_7.getText()));
		d.add(new Double(textField_8.getText()));
		b=d ;
		return b ;
	}

	private JFreeChart createChart(PieDataset dataset) {
		
         
		JFreeChart chart = ChartFactory.createPieChart(textField.getText(), // chart
																				// title
				dataset, // data
				true, // include legend
				true, false);

		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
		plot.setNoDataMessage("No data available");
		plot.setCircular(false);
		plot.setLabelGap(0.02);
		plot.setIgnoreZeroValues(true);
		
		//plot.setExplodePercent("", 5.5);
		return chart;

	}
	
	
	private JFreeChart createChartD(PieDataset dataset) {
		
        
		JFreeChart chart = ChartFactory.createPieChart3D(textField.getText(), // chart
																				// title
				dataset, // data
				true, // include legend
				true, false);

		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
		plot.setNoDataMessage("No data available");
		plot.setCircular(false);
		plot.setLabelGap(0.02);
		plot.setIgnoreZeroValues(true);
		plot.setStartAngle( 270 );             
	      plot.setForegroundAlpha( 0.60f );             
	      plot.setInteriorGap( 0.02 );
		//plot.setExplodePercent("", 5.5);
		return chart;

	}
	

	public JPanel createDemoPanel() {
		JFreeChart chart = null ;
		if(rdbtnPiechart.isSelected()){
		chart = createChart(createDataset());
		}
		if(rdbtndpiechart.isSelected()){
			chart = createChartD(createDataset()) ;
		}
		return new ChartPanel(chart);
	}
}
