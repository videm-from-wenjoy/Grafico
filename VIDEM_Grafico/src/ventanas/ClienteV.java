package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClienteV extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteV frame = new ClienteV();
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
	public ClienteV() {
		setTitle("\u00A1Bienvenido a VIDEM!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBuscar = new JMenu("Buscar");
		menuBar.add(mnBuscar);
		
		JMenu mnArtculosDeMerchandising = new JMenu("Art\u00EDculos de Merchandising");
		mnBuscar.add(mnArtculosDeMerchandising);
		
		JMenuItem mntmPorCdigoDe_2 = new JMenuItem("Por c\u00F3digo de producto");
		mnArtculosDeMerchandising.add(mntmPorCdigoDe_2);
		
		JMenu mnConsolas = new JMenu("Consolas");
		mnBuscar.add(mnConsolas);
		
		JMenuItem mntmPorCdigoDe_1 = new JMenuItem("Por c\u00F3digo de producto");
		mnConsolas.add(mntmPorCdigoDe_1);
		
		JMenuItem mntmPorFabricante = new JMenuItem("Por fabricante");
		mnConsolas.add(mntmPorFabricante);
		
		JMenuItem mntmPorGeneracin = new JMenuItem("Por generaci\u00F3n");
		mnConsolas.add(mntmPorGeneracin);
		
		JMenu mnVideojuegos = new JMenu("Videojuegos");
		mnBuscar.add(mnVideojuegos);
		
		JMenuItem mntmPorCdigoDe = new JMenuItem("Por c\u00F3digo de producto");
		mnVideojuegos.add(mntmPorCdigoDe);
		
		JMenuItem mntmPorDesarrolladora = new JMenuItem("Por desarrolladora");
		mnVideojuegos.add(mntmPorDesarrolladora);
		
		JMenuItem mntmPorFechaDe = new JMenuItem("Por fecha de lanzamiento");
		mnVideojuegos.add(mntmPorFechaDe);
		
		JMenuItem mntmPorNombre = new JMenuItem("Por nombre");
		mnVideojuegos.add(mntmPorNombre);
		
		JMenuItem mntmPorPlataforma = new JMenuItem("Por plataforma");
		mnVideojuegos.add(mntmPorPlataforma);
		
		JMenu mnComprar = new JMenu("Comprar");
		menuBar.add(mnComprar);
		
		JMenuItem mntmFinalizarCompra = new JMenuItem("Finalizar Compra");
		mnComprar.add(mntmFinalizarCompra);
		
		JMenu mnMisDatos = new JMenu("Mis datos");
		menuBar.add(mnMisDatos);
		
		JMenuItem mntmCambiarMiContrasea = new JMenuItem("Cambiar mi contrase\u00F1a");
		mnMisDatos.add(mntmCambiarMiContrasea);
		
		JMenuItem mntmVerDatosPersonales = new JMenuItem("Ver datos personales");
		mnMisDatos.add(mntmVerDatosPersonales);
		
		JMenuItem mntmRegistroDeCompras = new JMenuItem("Registro de compras");
		mnMisDatos.add(mntmRegistroDeCompras);
		
		JMenuItem mntmBorrarCuentaVidem = new JMenuItem("Borrar cuenta VIDEM");
		mnMisDatos.add(mntmBorrarCuentaVidem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
