// Universidad del Valle de Guatemala
// Algoritmos y Estructura de datos
// Hoja de trabajo # 1
// Seccion 10
// 12/07/16

//Integrantes
// Andrea Maybell Echeverria 15127
// Jose Gerardo Molina 14492
// Diego Lopez 141222





//Se importa todos los componentes para poder crear la interfaz gráfica
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
	//Atributos 
	private JPanel contentPane;
	private Radio radio= new MiRadio();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private boolean on= false;
	private boolean am= true;
	private boolean gs=false;
	
	//Sets y gets
	public boolean getOn()
	{
		return on;
	}
	public void setOn(boolean o)
	{
		on= o;
	}
	public boolean getAm()
	{
		return am;
	}
	public void setAm(boolean o)
	{
		am= o;
	}

	public boolean getGs()
	{
		return gs;
	}
	public void setGs(boolean o)
	{
		gs= o;
	}

	public void botoncitos(int x, JLabel l)
	{
		radio.Guardar_Emisora(x);
		radio.Seleccionar_emisora_guardada(x);
		l.setText(String.valueOf(radio.getEmisora()));
	}

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
	 //Se crean todos los botones y elementos necesarios para crear una interfaz facil de usar para el usuario
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
				boolean t= getOn();
				if (t==true)
				{
					btnOn.setText("OFF");
					setOn(false);
				}
				else
				{
					btnOn.setText("ON");
					setOn(true);
				}
			}
		});
		btnOn.setBounds(170, 11, 78, 23);
		contentPane.add(btnOn);
		
		JLabel lblJaja = new JLabel("");
		lblJaja.setForeground(Color.BLACK);
		lblJaja.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJaja.setBackground(Color.WHITE);
		lblJaja.setBounds(182, 95, 55, 23);
		contentPane.add(lblJaja);
		
		JButton button = new JButton("<<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.Cambio_de_Emisora(false);
				lblJaja.setText(String.valueOf(radio.getEmisora()));;
			}
		});
		button.setBounds(78, 95, 57, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton(">>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.Cambio_de_Emisora(true);
				lblJaja.setText(String.valueOf(radio.getEmisora()));;
			}
		});
		button_1.setBounds(270, 95, 57, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(1,lblJaja);
			}
		});
		button_2.setBounds(21, 174, 57, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(2,lblJaja);
			}
		});
		button_3.setBounds(88, 174, 57, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(3,lblJaja);
			}
		});
		button_4.setBounds(155, 174, 57, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(4,lblJaja);
			}
		});
		button_5.setBounds(222, 174, 57, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(5,lblJaja);
			}
		});
		button_6.setBounds(289, 174, 57, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(6,lblJaja);
			}
		});
		button_7.setBounds(356, 174, 57, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(7,lblJaja);
			}
		});
		button_8.setBounds(21, 210, 57, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(8,lblJaja);
			}
		});
		button_9.setBounds(88, 210, 57, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(9,lblJaja);
			}
		});
		button_10.setBounds(155, 210, 57, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("10");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(10,lblJaja);
			}
		});
		button_11.setBounds(222, 210, 57, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("11");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(11,lblJaja);
			}
		});
		button_12.setBounds(289, 210, 57, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("12");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botoncitos(12,lblJaja);
			}
		});
		button_13.setBounds(356, 210, 57, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("AM/FM");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.AM_FM();
				boolean t= getAm();
				if (t==true)
				{
					button_14.setText("FM");
					setAm(false);
				}
				else
				{
					button_14.setText("AM");
					setAm(true);
				}
			}
		});
		button_14.setBounds(170, 45, 78, 23);
		contentPane.add(button_14);
		
		JButton btnGuardarseleccionar = new JButton("guardar/seleccionar");
		btnGuardarseleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.Guardar_seleccion();
				boolean t= getGs();
				if (t==true)
				{
					btnGuardarseleccionar.setText("guardar");
					setGs(false);
				}
				else
				{
					btnGuardarseleccionar.setText("seleccionar");
					setGs(true);
				}
			}
		});
		btnGuardarseleccionar.setBounds(127, 129, 155, 23);
		contentPane.add(btnGuardarseleccionar);
		
	}
}
