package model_Principale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import javax.swing.JButton;

public class InterfaceCentrale1 extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblSdsds;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCentrale1 frame = new InterfaceCentrale1();
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
	public InterfaceCentrale1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][grow][grow][grow][][][][grow][grow]", "[][][grow]"));
		
		panel = new JPanel();
		contentPane.add(panel, "cell 0 2 4 1,alignx center,growy");
		panel.setLayout(new MigLayout("", "[][]", "[][][][][]"));
		
		btnNewButton = new JButton("New button");
		panel.add(btnNewButton, "cell 1 1");
		
		lblSdsds = new JLabel("sdsds");
		panel.add(lblSdsds, "cell 1 3");
		
		btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1, "cell 0 4 2 1,grow");
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, "cell 0 2 8 1,grow");
		panel_1.setLayout(new CardLayout(0, 0));
	}
}
