package model_Principale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.chart.NumberAxis;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Fr extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fr frame = new Fr();
					Panel_Categorie x = new Panel_Categorie() ;
					frame.add(x) ;
					frame.setVisible(true);
					
//					  DefaultCategoryDataset ds = new DefaultCategoryDataset();
//				        ds.addValue(100, "A", "A");
//				        ds.addValue(200, "A", "B");
//				        ds.addValue(400, "A", "C");
//				        ds.addValue(500, "A", "D");
//				        ds.addValue(2000, "A", "E");
//
//
//				        JFreeChart bc = ChartFactory.createBarChart("My Bar Chart", "Things", "Counts",  ds, PlotOrientation.VERTICAL, true, false, false);
//				        JFreeChart bcTop = ChartFactory.createBarChart("My Bar Chart", "Things", "Counts",  ds, PlotOrientation.VERTICAL, true, false, false);
//
//				        CombinedDomainCategoryPlot combinedPlot = new CombinedDomainCategoryPlot();
//				        CategoryPlot topPlot = bcTop.getCategoryPlot();
//				        //NumberAxis topAxis = (NumberAxis) topPlot.getRangeAxis();
//				        //topAxis.setLowerBound(1500);
//				       // topAxis.setUpperBound(2000);
//
//				        combinedPlot.add(topPlot, 1);
//				        CategoryPlot mainPlot = bc.getCategoryPlot();
//				        combinedPlot.add(mainPlot, 5);
//
//				       // NumberAxis mainAxis = (NumberAxis) mainPlot.getRangeAxis();;
//				       // mainAxis.setLowerBound(0);
//				       // mainAxis.setUpperBound(600);
//
//				        JFreeChart combinedChart = new JFreeChart("Test", combinedPlot);
//
//				        ChartFrame cf = new ChartFrame("Test", combinedChart);
//				        cf.setSize(800, 600);
//				        cf.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
