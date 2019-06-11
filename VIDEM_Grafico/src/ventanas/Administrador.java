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
import modelos.Cliente;
import modelos.Empleado;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;

public class Administrador extends JFrame {

	private JPanel contentPane;
	private JList list_Usuarios;
	private DefaultListModel modelo;
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
		
		JMenu mnNewMenu = new JMenu("Bajas");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmBClientes = new JMenuItem("Clientes");
		mnNewMenu.add(mntmBClientes);
		
		JMenuItem mntmBEmpleados = new JMenuItem("Empleados");
		mnNewMenu.add(mntmBEmpleados);
		
		JMenu mnListas = new JMenu("Listas");
		menuBar.add(mnListas);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Clientes");
		mnListas.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Empleados");
		mnListas.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Usuarios");
		mnListas.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(183, 140, 1, 1);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(74, 40, 335, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list_Usuarios = new JList();
		Vector<Cliente> v=new Cliente();
			for(Usuario a: v)
				modelo.addElement(a);
		list_Usuarios.setBounds(0, 0, 335, 167);
		panel.add(list_Usuarios);
	}
}
