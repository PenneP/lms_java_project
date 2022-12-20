import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import java.awt.GridLayout;

public class Member_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private CardLayout card;
	private JPanel pnlCard;
	private JTable table_1;
	private JFrame logInFrame, memFrame;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member_Frame frame = new Member_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Member_Frame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Member Frame");
		setBounds(100, 100, 618, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(153, 153, 102));
		panel_1.setBounds(10, 11, 572, 48);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBookList = new JButton("Book List");
		btnBookList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBookList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCard, "bList");
			}
		});
		btnBookList.setBounds(238, 14, 89, 23);
		panel_1.add(btnBookList);
		
		JButton btnBorrowedBooks = new JButton("Borrowed  Books");
		btnBorrowedBooks.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBorrowedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCard, "Borrowed");
			}
		});
		btnBorrowedBooks.setBounds(337, 14, 126, 23);
		panel_1.add(btnBorrowedBooks);
		
		JLabel lblMember = new JLabel("Member:");
		lblMember.setBounds(10, 18, 96, 14);
		panel_1.add(lblMember);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProfile.setBounds(139, 14, 89, 23);
		panel_1.add(btnProfile);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memFrame.dispose();
				logInFrame.setVisible(true);
			}
		});
		btnLogOut.setBounds(473, 14, 89, 23);
		panel_1.add(btnLogOut);
		card = new CardLayout();
		
		pnlCard = new JPanel();
		pnlCard.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlCard.setBounds(10, 70, 572, 270);
		panel.add(pnlCard);
		pnlCard.setLayout(card);
		
		JPanel pnlBookList = new JPanel();
		pnlBookList.setBackground(new Color(255, 204, 102));
		pnlCard.add(pnlBookList, "bList");
		pnlBookList.setLayout(null);
		
		JLabel lblBookList = new JLabel("Book List");
		lblBookList.setBounds(10, 11, 73, 14);
		pnlBookList.add(lblBookList);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(155, 8, 89, 23);
		pnlBookList.add(btnSearch);
		
		textField = new JTextField();
		textField.setBounds(254, 9, 136, 20);
		pnlBookList.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Genre.values()));
		comboBox.setBounds(444, 8, 89, 20);
		pnlBookList.add(comboBox);
		
		String data[][]={ 
				{"101","Kunwari","may","Laman","na","ok"}}; 
		
		String column[]={"ID","Title","Author","Publisher","Copies","Category"};
		
		table = new JTable(data, column);
		table.setBounds(10, 38, 546, 215);
		pnlBookList.add(table);		
		JScrollPane scroller = new JScrollPane(table);
		scroller.setBounds(10, 38, 546, 215);
		pnlBookList.add(scroller);
		
		JLabel lblBy = new JLabel("By:");
		lblBy.setBounds(419, 11, 26, 14);
		pnlBookList.add(lblBy);
		
		JPanel pnlBorrowedBook = new JPanel();
		pnlBorrowedBook.setBackground(new Color(255, 204, 153));
		pnlCard.add(pnlBorrowedBook, "Borrowed");
		pnlBorrowedBook.setLayout(null);
		
		JLabel lblBorrowedBooks = new JLabel("Borrowed Books");
		lblBorrowedBooks.setBounds(10, 11, 100, 14);
		pnlBorrowedBook.add(lblBorrowedBooks);
		

		String data2[][]={ 
				{"101","Kunwari","may","Laman","na","ok"}}; 
		
		String column2[]={"ID","Title","Author","Publisher","Issued date","Due Date"};

		
		
		table_1 = new JTable(data2, column2);
		table_1.setBounds(10, 36, 546, 217);
		pnlBorrowedBook.add(table_1);
		
		JScrollPane scroller2 = new JScrollPane(table_1);
		scroller2.setBounds(10, 36, 546, 215);
		pnlBorrowedBook.add(scroller2);
		
		JPanel pnlProfile = new JPanel();
		pnlProfile.setBackground(new Color(255, 153, 102));
		
		pnlCard.add(pnlProfile, "profile");
		pnlProfile.setLayout(null);
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setBounds(10, 11, 46, 14);
		pnlProfile.add(lblProfile);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(97, 39, 379, 196);
		pnlProfile.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 6, 2));
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		memFrame =this;
		logInFrame = parent;
	}
}
