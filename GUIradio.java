import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

public class GUIradio extends JFrame {

	private JPanel contentPane;
	private Radio radio= new MiRadio();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIradio frame = new GUIradio();
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
	public GUIradio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOn = new JButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.encender();
			}
		});
		btnOn.setBounds(137, 11, 53, 23);
		contentPane.add(btnOn);
		
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.apagar();
			}
		});
		btnOff.setBounds(218, 11, 53, 23);
		contentPane.add(btnOff);
		
		JLabel lblJaja = new JLabel("");
		lblJaja.setForeground(Color.WHITE);
		lblJaja.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJaja.setBackground(Color.WHITE);
		lblJaja.setBounds(157, 71, 92, 23);
		contentPane.add(lblJaja);
		
		JRadioButton rdbtnAm = new JRadioButton("AM");
		buttonGroup.add(rdbtnAm);
		rdbtnAm.setBounds(147, 41, 41, 23);
		contentPane.add(rdbtnAm);
		
		JRadioButton rdbtnFm = new JRadioButton("FM");
		buttonGroup.add(rdbtnFm);
		rdbtnFm.setBounds(218, 41, 53, 23);
		contentPane.add(rdbtnFm);
		
		JButton button = new JButton("<<<");
		button.setBounds(78, 71, 57, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton(">>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAm.isSelected())
				{
					radio.cambiar("AM");
				}
				if(rdbtnFm.isSelected())
				{
					radio.cambiar("FM");
				}
				radio.avanzar();
				lblJaja.setText(radio.getEstacion());
			}
		});
		button_1.setBounds(270, 71, 57, 23);
		contentPane.add(button_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 105, 28, 20);
		contentPane.add(comboBox);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(0, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_2.setBounds(37, 150, 46, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(1, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_3.setBounds(95, 150, 46, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(2, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_4.setBounds(154, 150, 46, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(3, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_5.setBounds(216, 150, 46, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(4, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_6.setBounds(274, 150, 46, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(5, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_7.setBounds(333, 150, 46, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(6, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_8.setBounds(37, 186, 46, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(7, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_9.setBounds(95, 186, 46, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(8, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_10.setBounds(154, 186, 46, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("10");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(9, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_11.setBounds(216, 186, 46, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("11");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(10, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_12.setBounds(274, 186, 46, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("12");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.guardar(11, Float.parseFloat(lblJaja.getText()));
			}
		});
		button_13.setBounds(333, 186, 46, 23);
		contentPane.add(button_13);
	}
}
