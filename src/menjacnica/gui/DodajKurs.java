package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKurs {

	public JFrame frmDodajKurs;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	private MenjacnicaGUI glavni;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKurs window = new DodajKurs();
					window.frmDodajKurs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public DodajKurs(MenjacnicaGUI glavni) {
		this.glavni = glavni;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDodajKurs = new JFrame();
		frmDodajKurs.setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKurs.class.getResource("/ikonice/gui/dollar-sign-temporary-tattoo_gen2-9.jpg")));
		frmDodajKurs.setResizable(false);
		frmDodajKurs.setTitle("Dodaj kurs");
		frmDodajKurs.setLocationRelativeTo(null);
		frmDodajKurs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDodajKurs.setBounds(100, 100, 395, 271);
		frmDodajKurs.getContentPane().setLayout(new GridLayout(0, 2, 10, 5));
		frmDodajKurs.getContentPane().add(getLblNewLabel());
		frmDodajKurs.getContentPane().add(getLblNewLabel_1());
		frmDodajKurs.getContentPane().add(getTextField_1());
		frmDodajKurs.getContentPane().add(getTextField());
		frmDodajKurs.getContentPane().add(getLblNewLabel_2());
		frmDodajKurs.getContentPane().add(getLblNewLabel_3());
		frmDodajKurs.getContentPane().add(getTextField_2());
		frmDodajKurs.getContentPane().add(getTextField_3());
		frmDodajKurs.getContentPane().add(getLblNewLabel_4());
		frmDodajKurs.getContentPane().add(getLblNewLabel_5());
		frmDodajKurs.getContentPane().add(getTextField_4());
		frmDodajKurs.getContentPane().add(getTextField_5());
		frmDodajKurs.getContentPane().add(getBtnNewButton());
		frmDodajKurs.getContentPane().add(getBtnNewButton_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.TRAILING);
			textField_1.setAlignmentX(Component.LEFT_ALIGNMENT);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni kurs");
			lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni kurs");
			lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji kurs");
			lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skraceni naziv");
			lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNewLabel_5;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					glavni.ispisi("Sifra valute: " + textField_1.getText() 
											+ " Naziv valute: " + textField.getText()
											+ " Prodajni kurs: " + textField_2.getText()
											+ " Kupovni kurs: " + textField_3.getText()
											+ " Srednji kurs: " + textField_4.getText()
											+ " Skraceni naziv: \n" + textField_5.getText());
					frmDodajKurs.dispose();
				}
			});
			btnNewButton.setPreferredSize(new Dimension(89, 30));
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmDodajKurs.dispose();
				}
			});
		}
		return btnNewButton_1;
	}
}
