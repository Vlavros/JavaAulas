package br.com.elaborata.atendimentotecnico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.elaborata.atendimentotecnico.controller.AtendimentoTecnicoController;
import br.com.elaborata.atendimentotecnico.model.AtendimentoTecnicoModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarAtendimento extends JFrame {

	private JPanel contentPane;
	private JTextField txtCliente, txtDataAtendimento, txtMarca;
	private JLabel lblProcessador, lblCliente, lblDataAtendimento, lblMemriaRam, lblMarcaEquipamento, lblDisco, lblQtdade, lblCarto;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnI3, rdbtnI5, rdbtnI7, rdbtnOutros;
	private JComboBox cmbCombo, cmbDisco;
	private JSpinner spUSB;
	private JCheckBox chckbxXd, chckbxSd, chckbxMicrosd;
	private JButton btnConfirmar, btnCancelar;
	
	

	/**
	 * Launch the application.
	 */
/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarAtendimento frame = new RegistrarAtendimento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public RegistrarAtendimento() {
		setTitle("Registrar Atendimento Técnico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCliente = new JLabel("Nome do Cliente:");
		lblCliente.setBounds(28, 22, 139, 15);
		contentPane.add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(176, 20, 234, 19);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		lblDataAtendimento = new JLabel("Data atendimento:");
		lblDataAtendimento.setBounds(28, 59, 139, 15);
		contentPane.add(lblDataAtendimento);
		
		txtDataAtendimento = new JTextField();
		txtDataAtendimento.setBounds(176, 57, 234, 19);
		contentPane.add(txtDataAtendimento);
		txtDataAtendimento.setColumns(10);
		
		lblMarcaEquipamento = new JLabel("Marca equipamento:");
		lblMarcaEquipamento.setBounds(28, 97, 158, 15);
		contentPane.add(lblMarcaEquipamento);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(176, 95, 234, 19);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 83, 424, 2);
		contentPane.add(separator);
		
		lblProcessador = new JLabel("Processador:");
		lblProcessador.setBounds(28, 125, 158, 15);
		contentPane.add(lblProcessador);
		
		rdbtnI3 = new JRadioButton("i3");
		buttonGroup.add(rdbtnI3);
		rdbtnI3.setBounds(176, 120, 42, 23);
		contentPane.add(rdbtnI3);
		
		rdbtnI5 = new JRadioButton("i5");
		buttonGroup.add(rdbtnI5);
		rdbtnI5.setBounds(222, 121, 42, 23);
		contentPane.add(rdbtnI5);
		
		rdbtnI7 = new JRadioButton("i7");
		buttonGroup.add(rdbtnI7);
		rdbtnI7.setBounds(268, 121, 42, 23);
		contentPane.add(rdbtnI7);
		
		rdbtnOutros = new JRadioButton("Outros");
		buttonGroup.add(rdbtnOutros);
		rdbtnOutros.setBounds(314, 121, 82, 23);
		contentPane.add(rdbtnOutros);
		
		lblMemriaRam = new JLabel("Memória RAM:");
		lblMemriaRam.setBounds(28, 152, 158, 15);
		contentPane.add(lblMemriaRam);
		
		cmbCombo = new JComboBox();
		cmbCombo.setModel(new DefaultComboBoxModel(new String[] {"--selecione--", "1Gb", "2Gb", "4Gb", "8Gb", "16Gb", "32Gb", "64Gb"}));
		cmbCombo.setBounds(176, 147, 234, 24);
		contentPane.add(cmbCombo);
		
		lblDisco = new JLabel("Disco Rígido:");
		lblDisco.setBounds(28, 184, 158, 15);
		contentPane.add(lblDisco);
		
		cmbDisco = new JComboBox();
		cmbDisco.setModel(new DefaultComboBoxModel(new String[] {"--selecione--", "SSD 80Gb", "SSD 120Gb", "HDD 500Gb", "HDD 1Tb", "HDD 4Tb"}));
		cmbDisco.setBounds(176, 179, 234, 24);
		contentPane.add(cmbDisco);
		
		lblQtdade = new JLabel("Qtde USB:");
		lblQtdade.setBounds(28, 211, 158, 15);
		contentPane.add(lblQtdade);
		
		spUSB = new JSpinner();
		spUSB.setModel(new SpinnerNumberModel(0, 0, 8, 1));
		spUSB.setBounds(176, 209, 92, 20);
		contentPane.add(spUSB);
		
		lblCarto = new JLabel("Cartões Memória: ");
		lblCarto.setBounds(28, 238, 158, 15);
		contentPane.add(lblCarto);
		
		chckbxXd = new JCheckBox("xD");
		chckbxXd.setBounds(181, 234, 51, 23);
		contentPane.add(chckbxXd);
		
		chckbxSd = new JCheckBox("SD");
		chckbxSd.setBounds(235, 234, 51, 23);
		contentPane.add(chckbxSd);
		
		chckbxMicrosd = new JCheckBox("MicroSD");
		chckbxMicrosd.setBounds(290, 234, 92, 23);
		contentPane.add(chckbxMicrosd);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 265, 424, 2);
		contentPane.add(separator_1);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gravarDados();
				
			}
		});
		btnConfirmar.setBounds(69, 276, 117, 25);
		contentPane.add(btnConfirmar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCancelar.setBounds(268, 276, 117, 25);
		contentPane.add(btnCancelar);
	}
	
	private void gravarDados() {
		String cliente = txtCliente.getText().trim();
		String marca = txtMarca.getText().trim();
		String processador = null;//buttonGroup.getSelection().
		String memoriaRam = (String)cmbCombo.getSelectedItem();
		String discoRigido = (String) cmbDisco.getSelectedItem();
		int qtdeUsb = (int)spUSB.getValue();
		boolean cartaoXD = chckbxXd.isSelected();
		boolean cartaoSD = chckbxSd.isSelected();
		boolean cartaoMicroSD = chckbxMicrosd.isSelected();
		
		if(rdbtnI3.isSelected()) {
			processador = "i3";
		} else if(rdbtnI5.isSelected()) {
			processador = "i5";
		} else if(rdbtnI7.isSelected()) {
			processador = "i7";
		} else if(rdbtnOutros.isSelected()) {
			processador = "Outros";
		}
		
		if(cliente.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Campos obrigatórios não preenchidos", "Campos incálidos",JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		AtendimentoTecnicoModel atm = new AtendimentoTecnicoModel();
		atm.setCliente(cliente);
		atm.setMarcaEquipamento(marca);
		atm.setProcessador(processador);
		atm.setMemoriaRam(memoriaRam);
		atm.setDiscoRigido(discoRigido);
		atm.setQtdeUsb(qtdeUsb);
		atm.setCartaoXD(cartaoXD);
		atm.setCartaoSD(cartaoSD);
		atm.setCartaoMicroSD(cartaoMicroSD);
		
		AtendimentoTecnicoController atc = new AtendimentoTecnicoController();
		
		try {
			atc.inserir(atm);
			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso", "Atendimento Técnico",JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro: " + e.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
}

