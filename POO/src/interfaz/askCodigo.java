package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import zakaz.Empresa;
import zakaz.ListaPlanillas;
public class askCodigo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCodigo;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param empresa 
	 */
	public askCodigo(Empresa empresa) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBuscadorDePlanilla = new JLabel("Buscador de Planilla");
		lblBuscadorDePlanilla.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		
		JLabel lblIngreseCodigo = new JLabel("Ingrese Codigo:");
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				if(empresa.getPlanillas().buscarPlanilla(Integer.parseInt(textFieldCodigo.getText()))!=null)
				{
					mostrarPlanilla nuevaVentana=new mostrarPlanilla(empresa,Integer.parseInt(textFieldCodigo.getText()));
					nuevaVentana.setVisible(true);
					askCodigo.this.dispose();
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Interfaz nuevaVentana=new Interfaz(empresa);
				nuevaVentana.setVisible(true);
				askCodigo.this.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblIngreseCodigo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
							.addComponent(btnBuscar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(111)
							.addComponent(lblBuscadorDePlanilla)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblBuscadorDePlanilla)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIngreseCodigo)
						.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
