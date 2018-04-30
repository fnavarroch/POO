package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import zakaz.Empresa;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class agregarPlanilla extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCodigo;
	private JTextField textFieldFinicio;
	private JTextField textFieldFFIN;
	private JTextField textFieldPatente;
	private JTextField textFieldMarca;
	private JTextField textFieldTipo;
	private JTextField textFieldRut;
	private JTextField textFieldNombre;
	private JTextField textFieldFNacimiento;
	private JTextField textFieldID;
	private JTextField textFieldLocal;
	private JTextField textFieldCiudad;
	private JTextField textFieldDireccion;
	private JTextField textFieldEncargado;
	private JTextField textFieldModelo;


	/**
	 * Create the frame.
	 * @param empresa 
	 */
	public agregarPlanilla(Empresa empresa) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNuevaPlanilla = new JLabel("Nueva Planilla");
		lblNuevaPlanilla.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(textFieldCiudad.getText()!=null && textFieldCodigo.getText()!=null && textFieldDireccion.getText()!=null && textFieldEncargado.getText()!=null && textFieldFFIN.getText()!=null && textFieldFinicio.getText()!=null && textFieldFNacimiento.getText()!=null && textFieldID.getText()!=null && textFieldLocal.getText()!=null && textFieldMarca.getText()!=null && textFieldNombre.getText()!=null && textFieldPatente.getText()!=null && textFieldRut.getText()!=null && textFieldTipo.getText()!=null && textFieldLocal.getText()!=null)
				{
					empresa.getPlanillas().agregarPlanillaInterfaz(Integer.parseInt(textFieldCodigo.getText()),java.sql.Date.valueOf(textFieldFinicio.getText()), java.sql.Date.valueOf(textFieldFFIN.getText()),textFieldMarca.getText(), textFieldTipo.getText(), textFieldModelo.getText(), textFieldPatente.getText(), textFieldNombre.getText(),java.sql.Date.valueOf(textFieldFNacimiento.getText()),textFieldRut.getText(), Integer.parseInt(textFieldID.getText()), textFieldLocal.getText(), textFieldCiudad.getText(),textFieldDireccion.getText());
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
				agregarPlanilla.this.dispose();
			}
		});
		
		JLabel lblCodigo = new JLabel("Codigo:");
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		
		textFieldFinicio = new JTextField();
		textFieldFinicio.setColumns(10);
		
		textFieldFFIN = new JTextField();
		textFieldFFIN.setColumns(10);
		
		JLabel lblFechaFin = new JLabel("Fecha Fin:");
		
		JSeparator separator = new JSeparator();
		
		JLabel lblVehiculo = new JLabel("Vehiculo");
		lblVehiculo.setForeground(Color.BLUE);
		lblVehiculo.setBackground(Color.BLUE);
		lblVehiculo.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		
		JLabel lblPatente = new JLabel("Patente:");
		
		textFieldPatente = new JTextField();
		textFieldPatente.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		
		textFieldMarca = new JTextField();
		textFieldMarca.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		
		textFieldTipo = new JTextField();
		textFieldTipo.setText("");
		textFieldTipo.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblConductor = new JLabel("Conductor");
		lblConductor.setForeground(Color.BLUE);
		lblConductor.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		
		JLabel lblRut = new JLabel("RUT:");
		
		textFieldRut = new JTextField();
		textFieldRut.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		textFieldNombre = new JTextField();
		textFieldNombre.setText("");
		textFieldNombre.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		
		textFieldFNacimiento = new JTextField();
		textFieldFNacimiento.setColumns(10);
		
		JLabel lblDespacho = new JLabel("Despacho");
		lblDespacho.setForeground(Color.BLUE);
		lblDespacho.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		
		JLabel lblId = new JLabel("ID:");
		
		textFieldID = new JTextField();
		textFieldID.setColumns(10);
		
		JLabel lblNombreLocal = new JLabel("Nombre:");
		
		textFieldLocal = new JTextField();
		textFieldLocal.setText("");
		textFieldLocal.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		
		textFieldCiudad = new JTextField();
		textFieldCiudad.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		
		JLabel lblEncargado = new JLabel("Encargado:");
		
		textFieldEncargado = new JTextField();
		textFieldEncargado.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		
		textFieldModelo = new JTextField();
		textFieldModelo.setText("");
		textFieldModelo.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCancelar)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblTipo)
										.addComponent(lblMarca)
										.addComponent(lblCodigo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFechaFin)
										.addComponent(lblFechaInicio)
										.addComponent(lblPatente)
										.addComponent(lblModelo))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldFFIN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldFinicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(lblNuevaPlanilla)
								.addComponent(lblVehiculo))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(36)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNombre)
										.addComponent(lblFechaNacimiento)
										.addComponent(lblConductor)
										.addComponent(lblRut))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldFNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldRut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(59)
									.addComponent(lblDespacho))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(69)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNombreLocal)
										.addComponent(lblId)
										.addComponent(lblCiudad)
										.addComponent(lblDireccin)
										.addComponent(lblEncargado))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldLocal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnAgregar)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textFieldDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textFieldCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textFieldEncargado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
							.addGap(169)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNuevaPlanilla)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCodigo)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblConductor)
								.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRut)
								.addComponent(textFieldRut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaInicio)
						.addComponent(textFieldFinicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldFFIN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFechaFin)
						.addComponent(lblFechaNacimiento)
						.addComponent(textFieldFNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDespacho)
						.addComponent(lblVehiculo))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPatente)
						.addComponent(lblId)
						.addComponent(textFieldID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMarca)
						.addComponent(lblNombreLocal)
						.addComponent(textFieldLocal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipo)
						.addComponent(lblCiudad)
						.addComponent(textFieldCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDireccin)
						.addComponent(lblModelo)
						.addComponent(textFieldModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEncargado)
						.addComponent(textFieldEncargado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAgregar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
