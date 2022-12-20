import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;

public class AddBook_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookID;
	private JTextField txtBookTitle;
	private JTextField txtBookPublisher;
	private JTextField txtBookAuthor;
	private JTextField txtBookCopies;
	private JTextField txtBookGenre;
	private JFrame libFrame, child;
	Connection con;
	Statement stmt;
	PreparedStatement prepStmt;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddBook_Frame frame = new AddBook_Frame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
	public AddBook_Frame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 505, 395);
		contentPane.add(panel);
		
		JButton btnBack = new JButton("<- Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				child.setVisible(false);
				txtBookID.setText(null);
				txtBookAuthor.setText(null);
				txtBookTitle.setText(null);
				txtBookPublisher.setText(null);
				txtBookCopies.setText(null);
				txtBookGenre.setText(null);
				libFrame.setVisible(true);
				
			}
		});
		btnBack.setBounds(6, 6, 83, 35);
		panel.add(btnBack);
		
		JLabel label = new JLabel("ADD BOOK");
		label.setFont(new Font("Dialog", Font.PLAIN, 17));
		label.setBounds(242, 11, 91, 24);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(100, 74, 305, 275);
		panel.add(panel_1);
		
		JLabel label_1 = new JLabel("Book ID:");
		label_1.setBounds(6, 6, 93, 26);
		panel_1.add(label_1);
		
		txtBookID = new JTextField();
		txtBookID.setColumns(10);
		txtBookID.setBounds(107, 11, 186, 26);
		panel_1.add(txtBookID);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new addListener());
		btnAdd.setBounds(106, 233, 102, 35);
		panel_1.add(btnAdd);
		
		txtBookTitle = new JTextField();
		txtBookTitle.setColumns(10);
		txtBookTitle.setBounds(107, 48, 186, 26);
		panel_1.add(txtBookTitle);
		
		JLabel label_2 = new JLabel("Book Title:");
		label_2.setBounds(6, 43, 93, 26);
		panel_1.add(label_2);
		
		txtBookPublisher = new JTextField();
		txtBookPublisher.setColumns(10);
		txtBookPublisher.setBounds(107, 122, 186, 26);
		panel_1.add(txtBookPublisher);
		
		JLabel label_3 = new JLabel("Publisher:");
		label_3.setBounds(6, 117, 93, 26);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Author:");
		label_4.setBounds(6, 80, 93, 26);
		panel_1.add(label_4);
		
		txtBookAuthor = new JTextField();
		txtBookAuthor.setColumns(10);
		txtBookAuthor.setBounds(107, 85, 186, 26);
		panel_1.add(txtBookAuthor);
		
		txtBookCopies = new JTextField();
		txtBookCopies.setColumns(10);
		txtBookCopies.setBounds(107, 196, 186, 26);
		panel_1.add(txtBookCopies);
		
		JLabel label_5 = new JLabel("Copies:");
		label_5.setBounds(6, 191, 93, 26);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Genre:");
		label_6.setBounds(6, 154, 93, 26);
		panel_1.add(label_6);
		
		txtBookGenre = new JTextField();
		txtBookGenre.setColumns(10);
		txtBookGenre.setBounds(107, 159, 186, 26);
		panel_1.add(txtBookGenre);
		libFrame = parent;
		child = this;
	}
	private class addListener implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			if (txtBookID.getText().isEmpty() || txtBookGenre.getText().isEmpty() || txtBookAuthor.getText().isEmpty() || txtBookTitle.getText().isEmpty()|| txtBookCopies.getText().isEmpty()|| txtBookPublisher.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Please complete the form!");

			}
			else {
				int id = 0, copy;
				/*try {
					 copy = Integer.parseInt(txtBookCopies.getText());
					 id = Integer.parseInt(txtBookID.getText());
				}catch(NumberFormatException e) {JOptionPane.showMessageDialog(null, "Input Correctly!");}
				
				 try{
			            stmt.executeUpdate(String.format("INSERT INTO students VALUES(%d, '%s')",
			                    Integer.parseInt(txtBookID.getText()), txtBookTitle.getText() ));
			        }catch(SQLException ex){
			            ex.printStackTrace();
			        }*/
			}
		}
	}
}
