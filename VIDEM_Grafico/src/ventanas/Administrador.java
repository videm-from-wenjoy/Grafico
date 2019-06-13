package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bbdd.BD_Usuario;
import modelos.Usuario;
import modelos.Empleado;
import modelos.Cliente;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Administrador extends JFrame {

	private JPanel panelListas;
	private JList list_Usuarios;
	private DefaultListModel modelo;
	private BD_Usuario bbdd=new BD_Usuario("videm");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
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
	public Administrador() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Administrador.class.getResource("/img/icon.png")));
		setTitle("VIDEM: Perfil de Administrador");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 360);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAltas = new JMenu("Altas");
		menuBar.add(mnAltas);
		
		JMenuItem mntmAClientes = new JMenuItem("Clientes");
		mnAltas.add(mntmAClientes);
		
		JMenuItem mntmAEmpleados = new JMenuItem("Empleados");
		mnAltas.add(mntmAEmpleados);
		
		JMenu mnBajas = new JMenu("Bajas");
		menuBar.add(mnBajas);
		
		JMenuItem mntmBClientes = new JMenuItem("Clientes");
		mnBajas.add(mntmBClientes);
		
		JMenuItem mntmBEmpleados = new JMenuItem("Empleados");
		mnBajas.add(mntmBEmpleados);
		
		JMenu mnListas = new JMenu("Listas");
		menuBar.add(mnListas);
		
		JMenuItem mntmLClientes = new JMenuItem("Clientes");
		mntmLClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Boolean teVeo=panelListas.isVisible();
				if(!teVeo) {
					panelListas.setVisible(teVeo);
					JList list_Usuarios = new JList();
					Vector<Cliente> v=bbdd.listarClientes();
						for(Usuario a: v)
							modelo.addElement(a);					
				}
				else {
					//btnLalalalala.setText("Ahora no me ves");
					panelListas.setVisible(!teVeo);
				}
			}
		});
		mnListas.add(mntmLClientes);
		
		JMenuItem mntmLEmpleados = new JMenuItem("Empleados");
		mntmLEmpleados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Boolean teVeo=panelListas.isVisible();
				//lblSevillismoEnMadrid.setVisible(!teVeo);
				if(!teVeo) {
					//btnLalalalala.setText("Ahora me ves");
					panelListas.setVisible(teVeo);
					JList list_Usuarios = new JList();
					Vector<Empleado> v=bbdd.listarEmpleados();
						for(Usuario a: v)
							modelo.addElement(a);										
				}
				else {
					//btnLalalalala.setText("Ahora no me ves");
					panelListas.setVisible(!teVeo);
				}
			}
		});
		mnListas.add(mntmLEmpleados);
		
		JMenuItem mntmLUsuarios = new JMenuItem("Usuarios");
		mntmLUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Boolean teVeo=panelListas.isVisible();
				//lblSevillismoEnMadrid.setVisible(!teVeo);
				if(!teVeo) {
					//btnLalalalala.setText("Ahora me ves");
					panelListas.setVisible(teVeo);
					JList list_Usuarios = new JList();
					Vector<Usuario> v=bbdd.listarUsuarios();
						for(Usuario a: v)
							modelo.addElement(a);					
				}
				else {
					//btnLalalalala.setText("Ahora no me ves");
					panelListas.setVisible(!teVeo);
				}
			}
		});
		mnListas.add(mntmLUsuarios);
		panelListas = new JPanel();
		panelListas.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelListas);
		panelListas.setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 57, 483, 232);
		panelListas.add(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 57, 483, 232);
		panelListas.add(panel);
		panel.setLayout(null);
		panel.add(list_Usuarios);
		list_Usuarios.setBounds(0, 0, 335, 167);
		
	}
}
