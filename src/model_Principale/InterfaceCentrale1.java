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

public class InterfaceCentrale1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 635, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][][][grow][grow]", "[][][]"));
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel, "cell 1 1");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 3 1,growx,aligny bottom");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_1, "cell 5 1,alignx left,aligny top");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 7 1,alignx left");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adresse");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_2, "cell 1 2");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 3 2 5 1,growx");
		textField_2.setColumns(10);
	}

}
