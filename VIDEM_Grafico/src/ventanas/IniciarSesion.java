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

public class IniciarSesion extends JFrame {

	private JPanel contentPane;
	private JTextField textCorreo;
	private JTextField textClave;
	private BD_Usuario bbdd=new BD_Usuario("videm");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
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
	public IniciarSesion() {
		setTitle("VIDEM: Iniciar Sesi\u00F3n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Iniciar Sesi\u00F3n", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico:");
		lblCorreoElectrnico.setBounds(36, 54, 116, 16);
		panel.add(lblCorreoElectrnico);
		
		JLabel lblClaveVidem = new JLabel("Contrase\u00F1a VIDEM:");
		lblClaveVidem.setBounds(36, 101, 116, 16);
		panel.add(lblClaveVidem);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(164, 51, 215, 22);
		panel.add(textCorreo);
		textCorreo.setColumns(10);
		
		textClave = new JTextField();
		textClave.setColumns(10);
		textClave.setBounds(164, 98, 215, 22);
		panel.add(textClave);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Usuario user = new Usuario(textCorreo.getText(),textClave.getText());				
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
					ClienteV v=new ClienteV();
					v.setVisible(true);
				}
				if(!opc.equalsIgnoreCase("CLIENTE") && !opc.equalsIgnoreCase("EMPLEADO")){
					JOptionPane.showMessageDialog(null, "Login Incorrecto: El usuario no se encuentra en nuestra base de datos.", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(123, 169, 176, 47);
		panel.add(btnLogin);
	}
}
