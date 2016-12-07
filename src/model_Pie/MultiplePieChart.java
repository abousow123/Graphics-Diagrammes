package model_Pie;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.util.TableOrder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiplePieChart extends JFrame {

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
	
	JLayeredPane layeredPane ;
	JPanel panel_1 ;
	JPanel panel_2 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiplePieChart frame = new MultiplePieChart();
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
	public MultiplePieChart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setBounds(10, 11, 307, 449);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 56, 40);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(77, 21, 200, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCategorie = new JLabel("Categorie");
		lblCategorie.setBounds(10, 62, 67, 14);
		panel.add(lblCategorie);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 59, 115, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 106, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 103, 116, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPie = new JLabel("Pie 1");
		lblPie.setBounds(112, 146, 46, 14);
		panel.add(lblPie);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 171, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(84, 197, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(84, 223, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPie_1 = new JLabel("Pie 2");
		lblPie_1.setBounds(112, 270, 46, 14);
		panel.add(lblPie_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(84, 295, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(84, 322, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(84, 348, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOk.setBounds(81, 415, 89, 23);
		panel.add(btnOk);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.setBounds(327, 11, 542, 449);
		contentPane.add(layeredPane);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 0, 0);
		layeredPane.add(panel_1);
		panel.setBounds(10, 11, 307, 449);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 0, 0);
		layeredPane.add(panel_2);
		panel.setBounds(10, 11, 307, 449);
	}
	
	private CategoryDataset createDataset() {
        final double[][] data = new double[][] {
            {new Double(textField_3.getText()), new Double(textField_4.getText()), new Double(textField_5.getText())},
            {new Double(textField_6.getText()), new Double(textField_7.getText()), new Double(textField_8.getText())}
            
        };
        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
            textField_1.getText(),
            textField_2.getText(),
            data
        );
        return dataset;
    }
	
	
	 private JFreeChart createChart(final CategoryDataset dataset) {
	        final JFreeChart chart = ChartFactory.createMultiplePieChart(
	            "Multiple Pie Chart",  // chart title
	            dataset,               // dataset
	            TableOrder.BY_ROW,
	            true,                  // include legend
	            true,
	            false
	        );
	        final MultiplePiePlot plot = (MultiplePiePlot) chart.getPlot();
	        final JFreeChart subchart = plot.getPieChart();
	        final PiePlot p = (PiePlot) subchart.getPlot();
	       // p.setLabelGenerator(new StandardPieItemLabelGenerator("{0}"));
	        p.setLabelFont(new Font("SansSerif", Font.PLAIN, 8));
	        p.setInteriorGap(0.30);
	        
	        return chart;
	    }
	
	
	
	
	
	
	
	
	
}
