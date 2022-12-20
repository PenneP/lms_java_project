import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;

public class Librarian_Frame extends JFrame {
	
	private JPanel contentPane, pnlCard;
	private CardLayout card;
	private String[][] data;
	private String[] column;
	private JTable memTable, bookTable,retBooksTable, issuedBooksTable;
	private JTextField txtSearch;
	private JTextField textField_1;
	private JFrame logInFrame, libFrame, parent, createAcc, addBookFrame;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LibrarianFrame frame = new LibrarianFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Librarian_Frame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 204));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(6, 6, 170, 466);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblLibrarian = new JLabel("Librarian:");
		lblLibrarian.setFont(new Font("Geeza Pro", Font.PLAIN, 15));
		lblLibrarian.setBounds(6, 27, 139, 44);
		panel.add(lblLibrarian);

		JButton btnViewProfile = new JButton("My Profile");
		btnViewProfile.setBounds(28, 109, 117, 44);
		panel.add(btnViewProfile);

		JButton btnLogOut = new JButton("Log-Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logInFrame.setVisible(true);
				libFrame.dispose();
			}
		});
		btnLogOut.setBounds(28, 392, 117, 44);
		panel.add(btnLogOut);

		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBookFrame.setVisible(true);
				libFrame.setVisible(false);
			}
		});
		btnAddBook.setBounds(28, 165, 117, 44);
		panel.add(btnAddBook);

		JButton btnAddAccount = new JButton("Add Account");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createAcc.setVisible(true);
				libFrame.setVisible(false);
			}
		});
		btnAddAccount.setBounds(28, 221, 117, 44);
		panel.add(btnAddAccount);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(189, 183, 107));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(188, 6, 556, 47);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnMemberList = new JButton("Member List");
		btnMemberList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCard, "memList");
			}
		});
		btnMemberList.setBounds(6, 6, 117, 29);
		panel_1.add(btnMemberList);

		JButton btnIssuedBook = new JButton("Issued Books");
		btnIssuedBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCard, "issuedBooks");
			}
		});
		btnIssuedBook.setBounds(427, 6, 126, 29);
		panel_1.add(btnIssuedBook);

		JButton btnReturnedBooks = new JButton("Returned Books");
		btnReturnedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCard, "returnedBooks");
			}
		});
		btnReturnedBooks.setBounds(284, 6, 126, 29);
		panel_1.add(btnReturnedBooks);

		JButton btnBookList = new JButton("Book List");
		btnBookList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCard, "bookList");
			}
		});
		btnBookList.setBounds(155, 6, 117, 29);
		panel_1.add(btnBookList);

		card = new CardLayout();

		pnlCard = new JPanel();
		pnlCard.setBounds(184, 65, 560, 390);
		contentPane.add(pnlCard);
		pnlCard.setLayout(card);

		JPanel pnlMemberList = new JPanel();
		pnlMemberList.setBackground(new Color(204, 255, 0));
		pnlCard.add(pnlMemberList, "memList");
		String data[][]={ 
				{"101","Kunwari","may","Laman","na"}};    
		String column[]={"ID","Name","Contact No.","Email","Address"};
		pnlMemberList.setLayout(null);
		
		memTable = new JTable(data, column);
		JScrollPane scrollPane = new JScrollPane(memTable);
		scrollPane.setBounds(0, 44, 560, 346);
		memTable.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlMemberList.add(scrollPane);
		
		JLabel lblMemberList = new JLabel("MEMBER LIST");
		lblMemberList.setBounds(6, 16, 86, 16);
		pnlMemberList.add(lblMemberList);
		
		JComboBox cboMemSearch = new JComboBox();
		cboMemSearch.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name"}));
		cboMemSearch.setBounds(468, 12, 86, 27);
		pnlMemberList.add(cboMemSearch);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(309, 11, 130, 26);
		pnlMemberList.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblBy = new JLabel("By:");
		lblBy.setBounds(447, 16, 26, 16);
		pnlMemberList.add(lblBy);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(217, 11, 80, 29);
		pnlMemberList.add(btnSearch);
		
		JPanel pnlBookList = new JPanel();
		pnlBookList.setBackground(new Color(0, 204, 255));
		pnlCard.add(pnlBookList, "bookList");
		pnlBookList.setLayout(null);
		
		JLabel lblBookList = new JLabel("BOOK LIST");
		lblBookList.setBounds(6, 16, 86, 16);
		pnlBookList.add(lblBookList);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ID", "Title", "Category"}));
		comboBox_1.setBounds(468, 12, 86, 27);
		pnlBookList.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(309, 11, 130, 26);
		pnlBookList.add(textField_1);
		
		JLabel label_1 = new JLabel("By:");
		label_1.setBounds(447, 16, 26, 16);
		pnlBookList.add(label_1);
		
		JButton button = new JButton("Search");
		button.setBounds(217, 11, 80, 29);
		pnlBookList.add(button);
		String data2[][]={ 
				{"101","Kunwari","may","Laman","na","ok"}}; 
		
		String column2[]={"ID","Title","Author","Publisher","Copies","Category"};
		
		bookTable = new JTable(data2, column2);
		bookTable.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		JScrollPane scrollPane_1 = new JScrollPane(bookTable);
		scrollPane_1.setBounds(0, 44, 560, 346);
		pnlBookList.add(scrollPane_1);

		JPanel pnlReturnedBooks = new JPanel();
		pnlReturnedBooks.setBackground(new Color(204, 204, 255));
		pnlCard.add(pnlReturnedBooks, "returnedBooks");

		JPanel pnlIssuedBooks = new JPanel();
		pnlIssuedBooks.setBackground(new Color(204, 255, 255));
		pnlCard.add(pnlIssuedBooks, "issuedBooks");
		logInFrame = parent;
		libFrame = this;
		createAcc = new CreateAccount_Frame(libFrame);
		addBookFrame = new AddBook_Frame(libFrame);
		
	}
}
