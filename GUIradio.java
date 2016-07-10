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
		setBounds(100, 100, 450, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOn = new JButton("ON/OFF");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.ON_OFF();
			}
		});
		btnOn.setBounds(170, 11, 78, 23);
		contentPane.add(btnOn);
		
		JLabel lblJaja = new JLabel("");
		lblJaja.setForeground(Color.BLACK);
		lblJaja.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJaja.setBackground(Color.WHITE);
		lblJaja.setBounds(157, 95, 92, 23);
		contentPane.add(lblJaja);
		
		JButton button = new JButton("<<<");
		button.setBounds(78, 95, 57, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton(">>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblJaja.setText(String.valueOf(radio.Cambio_de_Estacion()));;
			}
		});
		button_1.setBounds(270, 95, 57, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(1);
				radio.Seleccionar_estacion_guardada(1);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(1)));
			}
		});
		button_2.setBounds(21, 174, 57, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(2);
				radio.Seleccionar_estacion_guardada(2);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(2)));
			}
		});
		button_3.setBounds(88, 174, 57, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(3);
				radio.Seleccionar_estacion_guardada(3);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(3)));
			}
		});
		button_4.setBounds(155, 174, 57, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(4);
				radio.Seleccionar_estacion_guardada(4);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(4)));
			}
		});
		button_5.setBounds(222, 174, 57, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(5);
				radio.Seleccionar_estacion_guardada(5);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(5)));
			}
		});
		button_6.setBounds(289, 174, 57, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(6);
				radio.Seleccionar_estacion_guardada(6);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(6)));
			}
		});
		button_7.setBounds(356, 174, 57, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(7);
				radio.Seleccionar_estacion_guardada(7);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(7)));
			}
		});
		button_8.setBounds(21, 210, 57, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(8);
				radio.Seleccionar_estacion_guardada(8);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(8)));
			}
		});
		button_9.setBounds(88, 210, 57, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(9);
				radio.Seleccionar_estacion_guardada(9);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(9)));
			}
		});
		button_10.setBounds(155, 210, 57, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("10");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(10);
				radio.Seleccionar_estacion_guardada(10);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(10)));
			}
		});
		button_11.setBounds(222, 210, 57, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("11");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(11);
				radio.Seleccionar_estacion_guardada(11);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(11)));
			}
		});
		button_12.setBounds(289, 210, 57, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("12");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Guardar_Estacion(12);
				radio.Seleccionar_estacion_guardada(12);
				lblJaja.setText(String.valueOf(radio.Seleccionar_estacion_guardada(12)));
			}
		});
		button_13.setBounds(356, 210, 57, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("AM/FM");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.AM_FM();
			}
		});
		button_14.setBounds(170, 45, 78, 23);
		contentPane.add(button_14);
		
		JButton btnGuardarseleccionar = new JButton("guardar/seleccionar");
		btnGuardarseleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.Guardar_seleccion();
			}
		});
		btnGuardarseleccionar.setBounds(127, 129, 155, 23);
		contentPane.add(btnGuardarseleccionar);
		
	}
}
