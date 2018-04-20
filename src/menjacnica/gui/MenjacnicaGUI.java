package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import java.io.File;

import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenjacnicaGUI {

	public JFrame frmMenjacnica;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	DefaultTableModel model;
	Object[][] vrednosti = new Object[10][6];
	File file;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmNewMenuItem;
	private JSeparator separator;

	private MenjacnicaGUI glavni;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI window = new MenjacnicaGUI();
					window.frmMenjacnica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenjacnicaGUI() {
		initialize();
		this.glavni = this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenjacnica = new JFrame();
		frmMenjacnica.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				izlaz();
			}
		});
		frmMenjacnica.setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/ikonice/gui/dollar-sign-temporary-tattoo_gen2-9.jpg")));
		frmMenjacnica.setTitle("Menjacnica");
		frmMenjacnica.setBounds(100, 100, 450, 300);
		frmMenjacnica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenjacnica.getContentPane().setLayout(new BorderLayout(0, 0));
		frmMenjacnica.getContentPane().add(getPanel(), BorderLayout.CENTER);
		frmMenjacnica.getContentPane().add(getMenuBar(), BorderLayout.NORTH);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getPanel_1(), BorderLayout.CENTER);
			panel.add(getPanel_2(), BorderLayout.EAST);
			panel.add(getPanel_3(), BorderLayout.SOUTH);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getTable());
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setPreferredSize(new Dimension(130, 60));
			panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_2.add(getBtnNewButton());
			panel_2.add(getBtnNewButton_2());
			panel_2.add(getBtnNewButton_1());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setAutoscrolls(true);
			panel_3.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEFT, TitledBorder.TOP, null, null));
			panel_3.setLayout(new BorderLayout(0, 0));
			panel_3.add(getScrollPane_1(), BorderLayout.NORTH);
			panel_3.add(getTextArea_1(), BorderLayout.SOUTH);
		}
		return panel_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane(table);
			scrollPane.setAutoscrolls(true);
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			String columnNames[] = {"Sifra" , "Skraceni naziv" , "Prodajni" , 
					"Srednji" , "Kupovni" , "Naziv" };
			model = new DefaultTableModel(vrednosti,columnNames);
			model.setColumnIdentifiers(columnNames);
			table = new JTable(model);
			table.setColumnSelectionAllowed(true);
			table.setCellSelectionEnabled(true);
			addPopup(table, getPopupMenu());
		}
		return table;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj kurs");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKurs dk = new DodajKurs(glavni);
					dk.frmDodajKurs.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.setPreferredSize(new Dimension(120, 23));
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Izvrsi zamenu");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton_1.setPreferredSize(new Dimension(120, 23));
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Obrisi kurs");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKurs ok = new ObrisiKurs(glavni);
					ok.frmObrisiKurs.setVisible(true);
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton_2.setPreferredSize(new Dimension(120, 23));
		}
		return btnNewButton_2;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKurs dk = new DodajKurs(glavni);
					dk.frmDodajKurs.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		}
		return mntmIzvrsiZamenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMenuItem_1());
			mnFile.add(getMenuItem_2());
			mnFile.add(getSeparator());
			mnFile.add(getMenuItem_3());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMenuItem_4());
		}
		return mnHelp;
	}
	private JMenuItem getMenuItem_1() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFileChooser fc = new JFileChooser();
					int returnVal = fc.showOpenDialog(frmMenjacnica);
					if (returnVal == JFileChooser.APPROVE_OPTION)
						file = fc.getSelectedFile();
					ispisi("\nUcitan fajl: " + file.getPath());
				}
			});
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMenuItem_2() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFileChooser fc = new JFileChooser();
					int returnVal = fc.showSaveDialog(frmMenjacnica);
					if (returnVal == JFileChooser.APPROVE_OPTION)
					 file = fc.getSelectedFile();
					ispisi("\nSacuvan fajl: " + file.getPath());
				}
			});
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMenuItem_3() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					izlaz();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
			mntmExit.setSelectedIcon(null);
		}
		return mntmExit;
	}
	private JMenuItem getMenuItem_4() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("About");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Autor: Mila Dikic"
							+ "\nFON, april 2018", "O autoru",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private void izlaz() {
		int opt = JOptionPane.showConfirmDialog(null, "Da li zaista zelite da izadjete?",
				"Izlaz", JOptionPane.YES_NO_CANCEL_OPTION);
		if (opt == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	public void ispisi(String tekst) {
		textArea.append(tekst);
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane(textArea);
			scrollPane_1.setAutoscrolls(true);
		}
		return scrollPane_1;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
