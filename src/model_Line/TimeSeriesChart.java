package model_Line;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RectangleInsets;

public class TimeSeriesChart extends JFrame {

	private JPanel contentPane;
	private  static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;
	
	JPanel panel ;
	JLayeredPane layeredPane ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeSeriesChart frame = new TimeSeriesChart();
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
	public TimeSeriesChart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitre.setBounds(10, 23, 59, 31);
		contentPane.add(lblTitre);
		
		textField = new JTextField();
		textField.setBounds(79, 31, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Y-axe label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 80, 86, 22);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 82, 111, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAnne = new JLabel("Ann\u00E9e");
		lblAnne.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnne.setBounds(10, 136, 69, 20);
		contentPane.add(lblAnne);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 136, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMois = new JLabel("Mois");
		lblMois.setBounds(65, 180, 46, 14);
		contentPane.add(lblMois);
		
		JLabel lblValeur = new JLabel("Valeur");
		lblValeur.setBounds(154, 180, 46, 14);
		contentPane.add(lblValeur);
		
		JLabel lblFvrier = new JLabel("f\u00E9vrier");
		lblFvrier.setBounds(65, 205, 46, 14);
		contentPane.add(lblFvrier);
		
		JLabel lblMars = new JLabel("Mars");
		lblMars.setBounds(65, 230, 46, 14);
		contentPane.add(lblMars);
		
		JLabel lblAvril = new JLabel("avril");
		lblAvril.setBounds(65, 255, 46, 14);
		contentPane.add(lblAvril);
		
		JLabel lblMai = new JLabel("mai");
		lblMai.setBounds(65, 280, 46, 14);
		contentPane.add(lblMai);
		
		JLabel lblJuin = new JLabel("juin");
		lblJuin.setBounds(65, 305, 46, 14);
		contentPane.add(lblJuin);
		
		JLabel lblJuillet = new JLabel("juillet");
		lblJuillet.setBounds(65, 330, 46, 14);
		contentPane.add(lblJuillet);
		
		JLabel lblAout = new JLabel("aout");
		lblAout.setBounds(65, 355, 46, 14);
		contentPane.add(lblAout);
		
		JLabel lblSeptembre = new JLabel("septembre");
		lblSeptembre.setBounds(65, 380, 59, 14);
		contentPane.add(lblSeptembre);
		
		JLabel lblOctobre = new JLabel("octobre");
		lblOctobre.setBounds(65, 405, 46, 14);
		contentPane.add(lblOctobre);
		
		JLabel lblNovembre = new JLabel("novembre");
		lblNovembre.setBounds(65, 430, 48, 14);
		contentPane.add(lblNovembre);
		
		JLabel lblDecembre = new JLabel("decembre");
		lblDecembre.setBounds(65, 455, 59, 14);
		contentPane.add(lblDecembre);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 205, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(138, 227, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(138, 252, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(138, 277, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(138, 302, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(138, 327, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(138, 352, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(142, 377, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(138, 400, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(138, 427, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(142, 452, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnValider = new JButton("VALIDER");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(true);
				//layeredPane.setLayer(panel, 0,0);
				
				JFreeChart chart = createChart(createDataset()) ;
				
				ChartPanel chartPanel = new ChartPanel(chart) ;
				chartPanel.setBounds(0, 0, 600, 410);
				
//				 chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
//			        chartPanel.setMouseZoomable(true, false);
				
				panel.add(chartPanel) ;
				panel.repaint();
				
			}
		});
		btnValider.setBounds(98, 510, 89, 23);
		contentPane.add(btnValider);
		
//		Pane = new JLayeredPane();
//		layeredPane.setBounds(248, 23, 789, 540);
//		contentPane.add(layeredPane);
//		layeredPane.setLayout(null);
		
		panel = new JPanel(null);
		panel.setBounds(243, 23, 769, 518);
		contentPane.add(panel);
		panel.setVisible(false);
	}
	
	 private static XYDataset createDataset() {

	        TimeSeries s1 = new TimeSeries("L&G European Index Trust en "+ textField_2.getText());
	        s1.add(new org.jfree.data.time.Month(2, new Integer(textField_2.getText())),new Double(textField_3.getText()));
	        s1.add(new org.jfree.data.time.Month(3, new Integer(textField_2.getText())), new Double(textField_4.getText()) );
	        s1.add(new org.jfree.data.time.Month(4, new Integer(textField_2.getText())), new Double(textField_5.getText()));
	        s1.add(new org.jfree.data.time.Month(5, new Integer(textField_2.getText())), new Double(textField_6.getText()));
	        s1.add(new org.jfree.data.time.Month(6, new Integer(textField_2.getText())), new Double(textField_7.getText()));
	        s1.add(new org.jfree.data.time.Month(7, new Integer(textField_2.getText())), new Double(textField_8.getText()));
	        s1.add(new org.jfree.data.time.Month(8, new Integer(textField_2.getText())), new Double(textField_9.getText()));
	        s1.add(new org.jfree.data.time.Month(9, new Integer(textField_2.getText())), new Double(textField_10.getText()));
	        s1.add(new org.jfree.data.time.Month(10, new Integer(textField_2.getText())), new Double(textField_11.getText()));
	        s1.add(new org.jfree.data.time.Month(11, new Integer(textField_2.getText())), new Double(textField_12.getText()));
	        s1.add(new org.jfree.data.time.Month(12, new Integer(textField_2.getText())), new Double(textField_13.getText()));
	       

	        

	        TimeSeriesCollection dataset = new TimeSeriesCollection();
	        dataset.addSeries(s1);
	        dataset.setDomainIsPointsInTime(true);
	        return dataset;

	    }
	 
	 private static JFreeChart createChart(XYDataset dataset) {

	        JFreeChart chart = ChartFactory.createTimeSeriesChart(
	            textField.getText(),  // title
	            "Date",             // x-axis label
	            textField_1.getText(),   // y-axis label
	            dataset,            // data
	            true,               // create legend?
	            true,               // generate tooltips?
	            false               // generate URLs?
	        );

	        chart.setBackgroundPaint(Color.white);
	        XYPlot plot = (XYPlot) chart.getPlot();
	        plot.setBackgroundPaint(Color.lightGray);
	        plot.setDomainGridlinePaint(Color.white);
	        plot.setRangeGridlinePaint(Color.white);
	        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
	        plot.setDomainCrosshairVisible(true);
	        plot.setRangeCrosshairVisible(true);
	        
	        XYItemRenderer r = plot.getRenderer();
	        if (r instanceof XYLineAndShapeRenderer) {
	            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r;
	        }
	        
	        DateAxis axis = (DateAxis) plot.getDomainAxis();
	        axis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));
	        return chart;

	    }
}
