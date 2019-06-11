package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import bbdd.BD_Usuario;
import modelos.Usuario;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField textCorreo;
	private JTextField textNombre;
	private JTextField textDireccion;
	private JTextField textClave;
	private JTextField textDni;
	private BD_Usuario bbdd=new BD_Usuario("videm");
	private JTextField textTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setEnabled(false);
		setTitle("VIDEM: Registrarse en la aplicaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Registrarse en VIDEM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 742, 347);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCorreo = new JLabel("Correo Electr\u00F3nico:");
		lblCorreo.setBounds(43, 59, 110, 16);
		panel.add(lblCorreo);
		
		JLabel lblClave = new JLabel("Contrase\u00F1a VIDEM:");
		lblClave.setBounds(42, 109, 111, 16);
		panel.add(lblClave);
		
		JLabel lblNombre = new JLabel("Nombre y Apellidos:");
		lblNombre.setBounds(382, 59, 126, 16);
		panel.add(lblNombre);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(380, 109, 56, 16);
		panel.add(lblDomicilio);
		
		JLabel lblDni = new JLabel("Documento Nacional Identidad:");
		lblDni.setBounds(43, 163, 187, 16);
		panel.add(lblDni);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(171, 56, 187, 22);
		panel.add(textCorreo);
		textCorreo.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(513, 56, 187, 22);
		panel.add(textNombre);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(451, 106, 249, 22);
		panel.add(textDireccion);
		
		textClave = new JTextField();
		textClave.setColumns(10);
		textClave.setBounds(171, 106, 187, 22);
		panel.add(textClave);
		
		textDni = new JTextField();
		textDni.setBounds(242, 160, 116, 22);
		panel.add(textDni);
		textDni.setColumns(10);
		
		JLabel lblInfo = new JLabel("*Todos los campos a rellenar son obligatorios.");
		lblInfo.setBounds(12, 318, 276, 16);
		panel.add(lblInfo);
		
		JButton btnFinalizar = new JButton("Finalizar Registro");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Usuario user = new Usuario(textCorreo.getText(),textClave.getText(),textNombre.getText(),textDireccion.getText(),textDni.getText(),"CLIENTE",textTelefono.getText());				
				String opc=bbdd.login(user);
				if (opc.equalsIgnoreCase("EMPLEADO")) {
					String opc2=bbdd.loginEncargado(user);
					if(opc2.equalsIgnoreCase("ADMINISTRADOR")) {
						Administrador v=new Administrador();
						v.setVisible(true);
					}
					if(opc2.equalsIgnoreCase("ENCARGADO")) {
						Encargado v=new Encargado();
						v.setVisible(true);
					}
					if(opc2.equalsIgnoreCase("EMPLEADO")) {
						Empleado v=new Empleado();
						v.setVisible(true);
					}
				}
				if(opc.equalsIgnoreCase("CLIENTE")) {
					Cliente v=new Cliente();
					v.setVisible(true);
				}
				if(!opc.equalsIgnoreCase("CLIENTE") && !opc.equalsIgnoreCase("EMPLEADO")){
					JOptionPane.showMessageDialog(null, "Login Incorrecto: El usuario no se encuentra en nuestra base de datos.", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnFinalizar.setBounds(303, 214, 148, 66);
		panel.add(btnFinalizar);
		
		JLabel lblTelefono = new JLabel("Telefono M\u00F3vil:");
		lblTelefono.setBounds(382, 163, 95, 16);
		panel.add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(489, 160, 211, 22);
		panel.add(textTelefono);
	}
}
