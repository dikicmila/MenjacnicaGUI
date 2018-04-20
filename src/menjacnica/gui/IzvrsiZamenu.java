package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenu {

	public JFrame frmIzvrsiZamenu;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton rdbtnProdaja;
	
	private MenjacnicaGUI glavna;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenu window = new IzvrsiZamenu();
					window.frmIzvrsiZamenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public IzvrsiZamenu(MenjacnicaGUI glavna) {
		this.glavna = glavna;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIzvrsiZamenu = new JFrame();
		frmIzvrsiZamenu.setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenu.class.getResource("/ikonice/gui/dollar-sign-temporary-tattoo_gen2-9.jpg")));
		frmIzvrsiZamenu.setTitle("Izvrsi zamenu");
		frmIzvrsiZamenu.setBounds(100, 100, 450, 330);
		frmIzvrsiZamenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmIzvrsiZamenu.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kupovni kurs");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 24, 115, 14);
		frmIzvrsiZamenu.getContentPane().add(lblNewLabel);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValuta.setBounds(184, 24, 46, 14);
		frmIzvrsiZamenu.getContentPane().add(lblValuta);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProdajniKurs.setBounds(269, 25, 92, 14);
		frmIzvrsiZamenu.getContentPane().add(lblProdajniKurs);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 49, 141, 20);
		frmIzvrsiZamenu.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 49, 87, 20);
		frmIzvrsiZamenu.getContentPane().add(comboBox);
		comboBox.addItem("EUR");
		comboBox.addItem("USD");
		comboBox.addItem("CHF");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(269, 50, 141, 20);
		frmIzvrsiZamenu.getContentPane().add(textField_1);
		
		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIznos.setBounds(10, 105, 46, 14);
		frmIzvrsiZamenu.getContentPane().add(lblIznos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 130, 185, 20);
		frmIzvrsiZamenu.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVrstaTransakcije.setBounds(269, 106, 122, 14);
		frmIzvrsiZamenu.getContentPane().add(lblVrstaTransakcije);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kupovina");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnProdaja.isSelected()) {
					rdbtnProdaja.setSelected(false);
					rdbtnNewRadioButton.setSelected(true);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(269, 129, 109, 23);
		frmIzvrsiZamenu.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnProdaja = new JRadioButton("Prodaja");
		rdbtnProdaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					rdbtnProdaja.setSelected(true);
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		rdbtnProdaja.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnProdaja.setBounds(269, 155, 109, 23);
		frmIzvrsiZamenu.getContentPane().add(rdbtnProdaja);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textField_2.setText("" + slider.getValue());
			}
		});
		
		slider.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setBounds(10, 187, 400, 44);
		frmIzvrsiZamenu.getContentPane().add(slider);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnProdaja.isSelected()) 
					glavna.ispisi("ZAMENA:  Naziv valute: " + comboBox.getSelectedItem() 
									+ " Iznos: " + textField_2.getText() 
									+ " Vrsta transakcije : PRODAJA" + System.lineSeparator());
				if(rdbtnNewRadioButton.isSelected()) 
					glavna.ispisi("ZAMENA:  Naziv valute: " + comboBox.getSelectedItem() 
									+ " Iznos: " + textField_2.getText() 
									+ " Vrsta transakcije : KUPOVINA" + System.lineSeparator());
				frmIzvrsiZamenu.dispose();
			}
		});
		btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIzvrsiZamenu.setBounds(55, 242, 130, 38);
		frmIzvrsiZamenu.getContentPane().add(btnIzvrsiZamenu);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIzvrsiZamenu.dispose();
			}
		});
		btnOdustani.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOdustani.setBounds(248, 242, 130, 38);
		frmIzvrsiZamenu.getContentPane().add(btnOdustani);
	}
}
