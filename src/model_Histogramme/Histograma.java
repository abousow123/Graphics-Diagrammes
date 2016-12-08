package model_Histogramme;

import java.io.IOException;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Histograma extends ApplicationFrame {

	public Histograma(String title) {
		super(title);
		JPanel chartPanel = crearPanel();
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
		setContentPane(chartPanel);
	}

	private static IntervalXYDataset crearDataset() {
		HistogramDataset dataset = new HistogramDataset();
		double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
		dataset.addSeries("H1", values, 10, 0.0, 10.0);

		
		return dataset;
	}

	private static JFreeChart crearChart(IntervalXYDataset dataset) {
		JFreeChart chart = ChartFactory.createHistogram("Histograma", null,
				null, dataset, PlotOrientation.VERTICAL, true, true, false);
		XYPlot plot = (XYPlot) chart.getPlot();
		XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
		renderer.setDrawBarOutline(false);

		return chart;
	}

	public static JPanel crearPanel() {
		JFreeChart chart = crearChart(crearDataset());
		return new ChartPanel(chart);
	}

	public static void main(String[] args) throws IOException {
		Histograma histo = new Histograma("Histograma");
		histo.pack();
		RefineryUtilities.centerFrameOnScreen(histo);
		histo.setVisible(true);
	}

}
