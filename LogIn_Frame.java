import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccountID;
	private JPasswordField txtPassword;
	private JComboBox comboType;
	private JFrame createAccFrame, logInFrame, librarianFrame, memberFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn_Frame frame = new LogIn_Frame();
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
	public LogIn_Frame() {
		setTitle("Library Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(60, 50, 373, 259);
		panel.add(panel_1);
		
		JLabel lblAccountId = new JLabel("Account ID:");
		lblAccountId.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblAccountId.setBounds(6, 74, 82, 16);
		panel_1.add(lblAccountId);
		
		txtAccountID = new JTextField();
		txtAccountID.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtAccountID.setColumns(10);
		txtAccountID.setBounds(94, 69, 273, 26);
		panel_1.add(txtAccountID);
		
		JLabel label_1 = new JLabel("Password: ");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_1.setBounds(6, 122, 82, 16);
		panel_1.add(label_1);
		
		JLabel lblLogin = new JLabel("LOG-IN");
		lblLogin.setFont(new Font("Geeza Pro", Font.PLAIN, 16));
		lblLogin.setBounds(158, 24, 64, 23);
		panel_1.add(lblLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtPassword.setBounds(94, 117, 273, 26);
		panel_1.add(txtPassword);
		
		JButton btnLogIn = new JButton("LOG-IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboType.getSelectedItem().equals("Librarian")) {
					librarianFrame.setVisible(true);
					logInFrame.setVisible(false);
				}
				else if(comboType.getSelectedItem().equals("Member")) {
					memberFrame.setVisible(true);
					logInFrame.setVisible(false);
				}
			}
		});
		btnLogIn.setBounds(66, 224, 117, 29);
		panel_1.add(btnLogIn);
		
		JButton btnSignUp = new JButton("SIGN-UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createAccFrame.setVisible(true);
				logInFrame.setVisible(false);
			}
		});
		btnSignUp.setBounds(195, 224, 117, 29);
		panel_1.add(btnSignUp);
		
		comboType = new JComboBox();
		comboType.setModel(new DefaultComboBoxModel(new String[] {"Librarian", "Member"}));
		comboType.setBounds(94, 169, 273, 27);
		panel_1.add(comboType);	
		
		JLabel lblType = new JLabel("Type:");
		lblType.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblType.setBounds(6, 173, 82, 16);
		panel_1.add(lblType);
		logInFrame = this;
		memberFrame = new Member_Frame(logInFrame);
		createAccFrame = new CreateAccount_Frame(logInFrame);
		librarianFrame = new Librarian_Frame(logInFrame);
	}
}
