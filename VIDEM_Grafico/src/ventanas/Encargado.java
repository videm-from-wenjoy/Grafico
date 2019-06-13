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
		
		JMenuItem mntmAccesorio = new JMenuItem("Accesorio");
		mnAgregar.add(mntmAccesorio);
		
		JMenuItem mntmArtculoDeMerchandising = new JMenuItem("Art\u00EDculo de Merchandising");
		mnAgregar.add(mntmArtculoDeMerchandising);
		
		JMenuItem mntmConsola = new JMenuItem("Consola");
		mnAgregar.add(mntmConsola);
		
		JMenuItem mntmVideojuego = new JMenuItem("Videojuego");
		mnAgregar.add(mntmVideojuego);
		
		JMenu mnBorrar = new JMenu("Borrar");
		menuBar.add(mnBorrar);
		
		JMenuItem mntmAccesorio_1 = new JMenuItem("Accesorio");
		mnBorrar.add(mntmAccesorio_1);
		
		JMenuItem mntmArtculoDeMerchandising_1 = new JMenuItem("Art\u00EDculo de Merchandising");
		mnBorrar.add(mntmArtculoDeMerchandising_1);
		
		JMenuItem mntmConsola_1 = new JMenuItem("Consola");
		mnBorrar.add(mntmConsola_1);
		
		JMenuItem mntmVideojuego_1 = new JMenuItem("Videojuego");
		mnBorrar.add(mntmVideojuego_1);
		
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
		
		JMenu mnAccesorios = new JMenu("Accesorios");
		mnListar.add(mnAccesorios);
		
		JMenuItem mntmPorFabricante_1 = new JMenuItem("Por fabricante");
		mnAccesorios.add(mntmPorFabricante_1);
		
		JMenu mnArtculosDeMerchandising = new JMenu("Art\u00EDculos de Merchandising");
		mnListar.add(mnArtculosDeMerchandising);
		
		JMenuItem mntmPorFabricante_2 = new JMenuItem("Por fabricante");
		mnArtculosDeMerchandising.add(mntmPorFabricante_2);
		
		JMenu mnConsolas = new JMenu("Consolas");
		mnListar.add(mnConsolas);
		
		JMenuItem mntmPorFabricante = new JMenuItem("Por fabricante");
		mnConsolas.add(mntmPorFabricante);
		
		JMenuItem mntmPorGeneracin = new JMenuItem("Por generaci\u00F3n");
		mnConsolas.add(mntmPorGeneracin);
		
		JMenu mnVideojuegos = new JMenu("Videojuegos");
		mnListar.add(mnVideojuegos);
		
		JMenuItem mntmPorAoDe = new JMenuItem("Por a\u00F1o de lanzamiento");
		mnVideojuegos.add(mntmPorAoDe);
		
		JMenuItem mntmPorDesarrollador = new JMenuItem("Por desarrollador");
		mnVideojuegos.add(mntmPorDesarrollador);
		
		JMenuItem mntmPorGnero = new JMenuItem("Por g\u00E9nero");
		mnVideojuegos.add(mntmPorGnero);
		
		JMenuItem mntmPorPlataforma = new JMenuItem("Por plataforma");
		mnVideojuegos.add(mntmPorPlataforma);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
