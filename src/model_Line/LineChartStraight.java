package model_Line;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;

public class LineChartStraight extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	
	JLayeredPane layeredPane ;
	JPanel panel ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LineChartStraight frame = new LineChartStraight();
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
	public LineChartStraight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1116, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitre = new JLabel("TITRE");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitre.setBounds(10, 10, 50, 32);
		contentPane.add(lblTitre);

		textField = new JTextField();
		textField.setBounds(87, 17, 138, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("NOM");
		lblNewLabel.setBounds(50, 101, 50, 32);
		contentPane.add(lblNewLabel);

		JLabel lblValeur = new JLabel("VALEUR");
		lblValeur.setBounds(123, 101, 50, 32);
		contentPane.add(lblValeur);

		textField_1 = new JTextField();
		textField_1.setBounds(25, 139, 75, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(110, 140, 75, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(25, 178, 75, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(110, 178, 75, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(25, 214, 75, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(110, 215, 75, 23);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Classe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 58, 50, 32);
		contentPane.add(lblNewLabel_1);

		textField_7 = new JTextField();
		textField_7.setBounds(87, 63, 138, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		JButton btnValider = new JButton("VALIDER");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(true);
//				layeredPane.setLayer(panel, 0, 0);
//				JFreeChart chart = createChart(createDataset());
//				
//				 ChartPanel chartPanel = new ChartPanel(chart) ;
//				chartPanel.setBounds(10, 11, 800, 400);
				
			//	panel.add(chartPanel) ;
				panel.repaint();
				
			}
		});
		btnValider.setBounds(62, 269, 89, 23);
		contentPane.add(btnValider);

		layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.setBounds(235, 10, 846, 505);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);

		panel = new JPanel(null);
		panel.setBounds(10, 11, 837, 483);
		layeredPane.add(panel);
		panel.setVisible(false);
	}

	public CategoryDataset createLineDataset(String n,ArrayList<String> nom,ArrayList<Double> valeur) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		for(int i=0; i<nom.size() ; i++){
			dataset.addValue(new Double(valeur.get(i)),
					n, nom.get(i));
		}

		return dataset;
	}

	public JFreeChart createChartLine(String titre,String axeX,String axeY,String source,CategoryDataset Dataset,boolean legende) {
		
		JFreeChart chart = null ;
		if(legende==true){
		 chart = ChartFactory.createLineChart(titre,
				axeX,axeY, Dataset, PlotOrientation.VERTICAL, true,
				true, false);
		}
		
		else{
			 chart = ChartFactory.createLineChart(titre,
					axeX,axeY, Dataset, PlotOrientation.VERTICAL, false,
					true, false);
			}
		
		chart.setBackgroundPaint(Color.WHITE);
		
		TextTitle sourc = new TextTitle(source);
				sourc.setFont(new Font("SansSerif", Font.PLAIN, 10));
				sourc.setPosition(RectangleEdge.BOTTOM);
				sourc.setHorizontalAlignment(HorizontalAlignment.RIGHT);
				chart.addSubtitle(sourc);
		
		CategoryPlot plot = (CategoryPlot)chart.getPlot() ;
		plot.setBackgroundPaint(Color.LIGHT_GRAY);
		plot.setRangeGridlinePaint(Color.white);
		
		LineAndShapeRenderer renderer
		= (LineAndShapeRenderer) plot.getRenderer();
		renderer.setShapesVisible(true);
		renderer.setDrawOutlines(true);
		renderer.setUseFillPaint(true);
		renderer.setFillPaint(Color.white);
		
		return chart ;
	}
	
	public JFreeChart createChartLine3D(String titre,String axeX,String axeY,String source,CategoryDataset Dataset,boolean legende) {
		
		JFreeChart chart = null ;
		if(legende==true){
		 chart = ChartFactory.createLineChart3D(titre,
				axeX,axeY, Dataset, PlotOrientation.VERTICAL, true,
				true, false);
		}
		
		else{
			 chart = ChartFactory.createLineChart3D(titre,
					axeX,axeY, Dataset, PlotOrientation.VERTICAL, false,
					true, false);
			}
		
		chart.setBackgroundPaint(Color.WHITE);
		
		TextTitle sourc = new TextTitle(source);
				sourc.setFont(new Font("SansSerif", Font.PLAIN, 10));
				sourc.setPosition(RectangleEdge.BOTTOM);
				sourc.setHorizontalAlignment(HorizontalAlignment.RIGHT);
				chart.addSubtitle(sourc);
		
		CategoryPlot plot = (CategoryPlot)chart.getPlot() ;
		plot.setBackgroundPaint(Color.LIGHT_GRAY);
		plot.setRangeGridlinePaint(Color.white);
		
		LineAndShapeRenderer renderer
		= (LineAndShapeRenderer) plot.getRenderer();
		renderer.setShapesVisible(true);
		renderer.setDrawOutlines(true);
		renderer.setUseFillPaint(true);
		renderer.setFillPaint(Color.white);
		
		return chart ;
	}

	
	public JFreeChart createFreechartLine(String titre,String axeX,String axeY,XYDataset dataset,boolean legende) {
		JFreeChart chart = null ;
		
		if(legende==true){
		chart = ChartFactory.createXYLineChart(titre,
				axeX, axeY, dataset, PlotOrientation.VERTICAL, true, true, false);
		}else {
			chart = ChartFactory.createXYLineChart(titre,
					axeX, axeY, dataset, PlotOrientation.VERTICAL,false, true, false);
		}

		XYPlot plot = (XYPlot) chart.getXYPlot();
		plot.setBackgroundPaint(Color.LIGHT_GRAY);
		plot.setAxisOffset(new RectangleInsets(1, 1, 1, 1));
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinePaint(Color.white);

		XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot
				.getRenderer();
		renderer.setShapesVisible(true);
		renderer.setShapesVisible(true);

		// NumberAxis rangeAxis = (NumberAxis)plot.getRangeAxis();
		// rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits()) ;
		return chart;
	}
	
	
	
	public JFreeChart createFreechartStep(XYDataset dataset) {
		JFreeChart chart = ChartFactory.createXYLineChart(textField.getText(),
				"X", "Y", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		return chart;
	}
	
}
