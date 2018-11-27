package br.com.elaborata.exemplos.formulario.selecaodados;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class SelecaoDados extends JFrame {

	/**
	 * teste
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox<String> cmbComboBox;
	private JList<String> lstOpcao;
	private JCheckBox chkOpcao1,chkOpcao2,chkOpcao3;
	private JRadioButton rdbtnSim;
	private JRadioButton rdbtnNo;
	private JScrollPane scrollPane;
	private JButton btnBotao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecaoDados frame = new SelecaoDados();
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
	public SelecaoDados() {
		setTitle("Opções");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbComboBox = new JComboBox<String>();
		cmbComboBox.setModel(new DefaultComboBoxModel(new String[] {"Item 1", "Item 2", "Item 3", "AAAAA", "BBBBB", "CCCCC", "DDDDD"}));
		cmbComboBox.setBounds(27, 23, 211, 24);
		contentPane.add(cmbComboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 57, 211, 89);
		contentPane.add(scrollPane);
		
		lstOpcao = new JList();
		lstOpcao.setModel(new AbstractListModel() {
			String[] values = new String[] {"Opção 1", "Opção 2", "Opção 3", "Opção 4", "Opção 5", "Opção 6", "Opção 7", "Opção 8", "Opção 9", "Opção 10", "Opção 11"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(lstOpcao);
		
		chkOpcao1 = new JCheckBox("Check 1");
		chkOpcao1.setBounds(27, 172, 129, 23);
		contentPane.add(chkOpcao1);
		
		chkOpcao2 = new JCheckBox("Check 2");
		chkOpcao2.setBounds(27, 200, 129, 23);
		contentPane.add(chkOpcao2);
		
		chkOpcao3 = new JCheckBox("Check 3");
		chkOpcao3.setBounds(27, 227, 129, 23);
		contentPane.add(chkOpcao3);
		
		btnBotao = new JButton("Botão");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDados();
			}
		});
		btnBotao.setBounds(257, 54, 117, 25);
		contentPane.add(btnBotao);
		
		rdbtnSim = new JRadioButton("Sim");
		buttonGroup.add(rdbtnSim);
		rdbtnSim.setBounds(185, 172, 200, 30);
		contentPane.add(rdbtnSim);
		
		rdbtnNo = new JRadioButton("Nâo");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(185, 207, 200, 30);
		contentPane.add(rdbtnNo);
	}
	
	private void mostrarDados() {
		
		//MessageUtils.info(cmbComboBox.getSelectedItem().toString(), "Combobox");
		//String c1 = cmbComboBox.getSelectedItem().toString(); //pode dar nullpoint
		String c2 = (String)cmbComboBox.getSelectedItem();
		
		//System.out.println(c1);
		System.out.println(c2);
		
		//String lst = new String(lstOpcao.getSelectedValue());
		
		/*
        for(int i = 0; i< lstOpcao.getModel().getSize();i++){
            System.out.println(lstOpcao.getSe;
        }*/
		
		//List<String> list = (List) lstOpcao.getSelectedValuesList();
		List<String> itensSelecionados = lstOpcao.getSelectedValuesList();
		
		//System.out.println(itensSelecionados);
		
		for (Object item : itensSelecionados) {
			System.out.println((String)item);
		}
		
		/*
		for (int i = 0; i < itensSelecionados.size(); i++) {
			System.out.println(itensSelecionados.get(i));
		}
		*/
		
		if(chkOpcao1.isSelected()) {
			System.out.println("Check 1 - selecionado");
		}

		if(chkOpcao2.isSelected()) {
			System.out.println("Check 2 - selecionado");
		}
		
		if(chkOpcao3.isSelected()) {
			System.out.println("Check 3 - selecionado");
		}
		
		if(rdbtnSim.isSelected()) {
			System.out.println("Sim");
		} else if(rdbtnNo.isSelected()) {
			System.out.println("Não");
		}
		
		
		//System.out.println(lstOpcao.getSelectedValue().toString());
		
		
	}
}
