package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Encargado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encargado frame = new Encargado();
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
	public Encargado() {
		setTitle("VIDEM: Perfil de Encargado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAgregar = new JMenu("A\u00F1adir");
		menuBar.add(mnAgregar);
		
		JMenuItem mntmConsola = new JMenuItem("Consola");
		mnAgregar.add(mntmConsola);
		
		JMenuItem mntmVideojuego = new JMenuItem("Videojuego");
		mnAgregar.add(mntmVideojuego);
		
		JMenu mnBorrar = new JMenu("Borrar");
		menuBar.add(mnBorrar);
		
		JMenuItem mntmPorCodigo = new JMenuItem("Por c\u00F3digo de producto");
		mnBorrar.add(mntmPorCodigo);
		
		JMenuItem mntmPorNombreY = new JMenuItem("Por nombre y plataforma");
		mnBorrar.add(mntmPorNombreY);
		
		JMenu mnVentas = new JMenu("Recuento de Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmltimoAo = new JMenuItem("\u00DAltimo a\u00F1o");
		mnVentas.add(mntmltimoAo);
		
		JMenuItem mntmltimoMes = new JMenuItem("\u00DAltimo mes");
		mnVentas.add(mntmltimoMes);
		
		JMenuItem mntmltimaSemana = new JMenuItem("\u00DAltima semana");
		mnVentas.add(mntmltimaSemana);
		
		JMenuItem mntmltimoDa = new JMenuItem("\u00DAltimo d\u00EDa");
		mnVentas.add(mntmltimoDa);
		
		JMenu mnListar = new JMenu("Listar");
		menuBar.add(mnListar);
		
		JMenuItem mntmPorAoDe = new JMenuItem("Por a\u00F1o de lanzamiento");
		mnListar.add(mntmPorAoDe);
		
		JMenuItem mntmPorDesarrollador = new JMenuItem("Por desarrollador");
		mnListar.add(mntmPorDesarrollador);
		
		JMenuItem mntmPorGnero = new JMenuItem("Por g\u00E9nero");
		mnListar.add(mntmPorGnero);
		
		JMenuItem mntmPorPlataforma = new JMenuItem("Por plataforma");
		mnListar.add(mntmPorPlataforma);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
