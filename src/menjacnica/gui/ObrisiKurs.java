package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKurs {

	public JFrame frmObrisiKurs;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnObrisi;
	private MenjacnicaGUI glavni;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKurs window = new ObrisiKurs();
					window.frmObrisiKurs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public ObrisiKurs(MenjacnicaGUI glavni) {
		this.glavni = glavni;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmObrisiKurs = new JFrame();
		frmObrisiKurs.setResizable(false);
		frmObrisiKurs.setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKurs.class.getResource("/ikonice/gui/dollar-sign-temporary-tattoo_gen2-9.jpg")));
		frmObrisiKurs.setTitle("Obrisi kurs");
		frmObrisiKurs.setBounds(100, 100, 450, 337);
		frmObrisiKurs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmObrisiKurs.getContentPane().setLayout(new GridLayout(0, 2, 10, 3));
		
		JLabel label = new JLabel("Sifra");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		frmObrisiKurs.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Naziv");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		frmObrisiKurs.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setColumns(10);
		textField.setAlignmentX(0.0f);
		frmObrisiKurs.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		frmObrisiKurs.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("Prodajni kurs");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		frmObrisiKurs.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Kupovni kurs");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		frmObrisiKurs.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		frmObrisiKurs.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frmObrisiKurs.getContentPane().add(textField_3);
		
		JLabel label_4 = new JLabel("Srednji kurs");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		frmObrisiKurs.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Skraceni naziv");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		frmObrisiKurs.getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frmObrisiKurs.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frmObrisiKurs.getContentPane().add(textField_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected())
					btnObrisi.setEnabled(true);
				else btnObrisi.setEnabled(false);
			}
		});
		frmObrisiKurs.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(SystemColor.control);
		lblNewLabel.setVisible(false);
		frmObrisiKurs.getContentPane().add(lblNewLabel);
		
		btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				glavni.ispisi("OBRISAN KURS: [Sifra valute: " + textField_1.getText() 
								+ " Naziv valute: " + textField.getText()
								+ " Prodajni kurs: " + textField_2.getText()
								+ " Kupovni kurs: " + textField_3.getText()
								+ " Srednji kurs: " + textField_4.getText()
								+ " Skraceni naziv: " + textField_5.getText() + "]" 
								+ System.lineSeparator());
				frmObrisiKurs.dispose();
			}
		});
		btnObrisi.setEnabled(false);
		btnObrisi.setPreferredSize(new Dimension(89, 30));
		frmObrisiKurs.getContentPane().add(btnObrisi);
		
		JButton button_1 = new JButton("Odustani");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmObrisiKurs.dispose();
			}
		});
		frmObrisiKurs.getContentPane().add(button_1);
	}

}
