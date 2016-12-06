package model_Line;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;

import javax.swing.ButtonGroup;
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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

import javax.swing.JRadioButton;

public class LineChartXY extends JFrame {

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
	
	JPanel panel_1 ;
	JPanel panel_2 ;
	JLayeredPane layeredPane ;
	private JRadioButton RadioAria;
	JRadioButton RadioLine ;
	
	ButtonGroup group ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LineChartXY frame = new LineChartXY();
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
	public LineChartXY() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 279, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 22, 52, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(93, 22, 176, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ligne 1");
		lblNewLabel_1.setBounds(16, 82, 67, 25);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 82, 128, 25);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(62, 149, 74, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(142, 149, 74, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(62, 181, 74, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(142, 180, 74, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(64, 207, 72, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(142, 208, 74, 21);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblX.setBounds(93, 121, 17, 20);
		panel.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblY.setBounds(167, 124, 17, 14);
		panel.add(lblY);
		
		JLabel lblNewLabel_2 = new JLabel("Ligne 2");
		lblNewLabel_2.setBounds(21, 269, 67, 38);
		panel.add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setBounds(93, 276, 128, 25);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(62, 343, 74, 21);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(142, 343, 74, 21);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(62, 375, 74, 21);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(142, 375, 74, 21);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(62, 403, 74, 21);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(142, 403, 74, 21);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(93, 318, 17, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblY_1 = new JLabel("Y");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblY_1.setBounds(167, 315, 17, 20);
		panel.add(lblY_1);
		
		JButton btnVa = new JButton("Valider");
		btnVa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(RadioLine.isSelected()){
				panel_1.setVisible(true);
				layeredPane.setLayer(panel_1, 0,0);
				 JFreeChart chart = createFreechartLine(createDatasetLine()) ;
				 ChartPanel pan = new ChartPanel(chart) ;
				 pan.setBounds(10, 11, 717, 450);
				 
				 panel_1.add(pan) ;
				 panel_1.repaint();
				}
				
				
			}
		});
		btnVa.setBounds(93, 517, 89, 23);
		panel.add(btnVa);
		
		RadioLine = new JRadioButton("Line");
		RadioLine.setBounds(22, 455, 74, 25);
		panel.add(RadioLine);
		
		RadioAria = new JRadioButton("Aria");
		RadioAria.setBounds(103, 455, 89, 25);
		panel.add(RadioAria);
		
		group = new ButtonGroup() ;
		group.add(RadioAria);
		group.add(RadioLine);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(299, 11, 737, 551);
		contentPane.add(layeredPane);
		
		
		panel_1 = new JPanel(null);
		panel_1.setBounds(10, 11, 717, 529);
		layeredPane.add(panel_1);
		
		panel_2 = new JPanel(null);
		panel_2.setBounds(10, 11, 717, 529);
		layeredPane.add(panel_2);
		
		panel_1.setVisible(false);
		panel_2.setVisible(false);
		
	}
	
	 private XYDataset createDatasetLine() {
	        XYSeries serie1 = new XYSeries(textField_1.getText());
	        serie1.add(new Integer(textField_2.getText()), new Integer(textField_3.getText()));
	        serie1.add(new Integer(textField_4.getText()), new Integer(textField_5.getText()));
	        serie1.add(new Integer(textField_6.getText()), new Integer(textField_7.getText()));
	        

	        XYSeries serie2 = new XYSeries(textField_8.getText());
	        serie2.add(new Integer(textField_9.getText()), new Integer(textField_10.getText()));
	        serie2.add(new Integer(textField_11.getText()), new Integer(textField_12.getText()));
	        serie2.add(new Integer(textField_13.getText()), new Integer(textField_14.getText()));
	        

	        XYSeriesCollection dataset = new XYSeriesCollection();
	        dataset.addSeries(serie1);
	        dataset.addSeries(serie2);
	        return dataset;
	    }
	 
	 public JFreeChart createFreechartLine(XYDataset dataset) {
	        JFreeChart chart = ChartFactory.createXYLineChart(textField.getText(), "X", "Y", dataset, PlotOrientation.VERTICAL, true, true, false);

	        XYPlot plot = (XYPlot) chart.getXYPlot();
	        plot.setBackgroundPaint(Color.LIGHT_GRAY);
	        plot.setAxisOffset(new RectangleInsets(1, 1, 1, 1));
	        plot.setDomainGridlinePaint(Color.white);
	        plot.setRangeGridlinePaint(Color.white);

	        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
	        renderer.setShapesVisible(true);
	        renderer.setShapesVisible(true);
	        

	       // NumberAxis rangeAxis = (NumberAxis)plot.getRangeAxis();
	       // rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits()) ;
	        return chart;
	    }
	 
	
}
