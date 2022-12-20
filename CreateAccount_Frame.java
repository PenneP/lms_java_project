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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CreateAccount_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccountID;
	private JTextField txtAccountFname;
	private JTextField txtAccountEmail;
	private JTextField txtAccountAddress;
	private JTextField txtAccountPhone;
	private JPasswordField txtAccountPassword;
	private JPasswordField txtAccountConfirmPass;
	private JFrame parentFrame,frame;
	private JTextField txtAccountLname;

	/**
	 * Create the frame.
	 */
	public CreateAccount_Frame(JFrame parent) {
		setResizable(false);
		setTitle("Create Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnBack = new JButton("<- Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAccountID.setText(null);
				txtAccountLname.setText(null);
				txtAccountFname.setText(null);
				txtAccountAddress.setText(null);
				txtAccountEmail.setText(null);
				txtAccountPassword.setText(null);
				txtAccountPhone.setText(null);
				txtAccountConfirmPass.setText(null);
				frame.setVisible(false);
				parentFrame.setVisible(true);

			}
		});
		btnBack.setBounds(6, 6, 83, 35);
		panel.add(btnBack);

		JLabel lblNewLabel = new JLabel("CREATE ACCOUNT");
		lblNewLabel.setFont(new Font("Geeza Pro", Font.PLAIN, 17));
		lblNewLabel.setBounds(242, 11, 154, 24);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(128, 53, 375, 368);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblMemberId = new JLabel("Account ID:");
		lblMemberId.setBounds(6, 74, 93, 16);
		panel_1.add(lblMemberId);

		txtAccountID = new JTextField();
		txtAccountID.setBounds(181, 69, 186, 26);
		panel_1.add(txtAccountID);
		txtAccountID.setColumns(10);

		JLabel lblName = new JLabel("First Name:");
		lblName.setBounds(6, 107, 93, 16);
		panel_1.add(lblName);

		txtAccountFname = new JTextField();
		txtAccountFname.setColumns(10);
		txtAccountFname.setBounds(181, 102, 186, 26);
		panel_1.add(txtAccountFname);

		JLabel lblConfirmPassword = new JLabel("Confirm Password: ");
		lblConfirmPassword.setBounds(6, 204, 132, 16);
		panel_1.add(lblConfirmPassword);

		JLabel lblEmail = new JLabel("Password:");
		lblEmail.setBounds(6, 171, 93, 16);
		panel_1.add(lblEmail);

		JLabel lblEmail_1 = new JLabel("Email: ");
		lblEmail_1.setBounds(6, 270, 93, 16);
		panel_1.add(lblEmail_1);

		txtAccountEmail = new JTextField();
		txtAccountEmail.setColumns(10);
		txtAccountEmail.setBounds(181, 265, 186, 26);
		panel_1.add(txtAccountEmail);

		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(6, 303, 93, 16);
		panel_1.add(lblAddress);

		txtAccountAddress = new JTextField();
		txtAccountAddress.setColumns(10);
		txtAccountAddress.setBounds(181, 298, 186, 26);
		panel_1.add(txtAccountAddress);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(6, 237, 93, 16);
		panel_1.add(lblPhone);

		txtAccountPhone = new JTextField();
		txtAccountPhone.setColumns(10);
		txtAccountPhone.setBounds(181, 232, 186, 26);
		panel_1.add(txtAccountPhone);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new submitListener());
		btnSubmit.setBounds(143, 333, 102, 35);
		panel_1.add(btnSubmit);

		txtAccountPassword = new JPasswordField();
		txtAccountPassword.setToolTipText("Password must be 8-16 character.");
		
		txtAccountPassword.setBounds(181, 166, 186, 26);
		panel_1.add(txtAccountPassword);

		txtAccountConfirmPass = new JPasswordField();
		txtAccountConfirmPass.setBounds(181, 199, 186, 26);
		txtAccountConfirmPass.setToolTipText("Password must be 8-16 character.");
		panel_1.add(txtAccountConfirmPass);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Librarian", "Member"}));
		comboBox.setBounds(181, 36, 186, 27);
		panel_1.add(comboBox);
		
		JLabel lblAccountType = new JLabel("Account Type:");
		lblAccountType.setBounds(6, 40, 102, 16);
		panel_1.add(lblAccountType);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(6, 140, 93, 16);
		panel_1.add(lblLastName);
		
		txtAccountLname = new JTextField();
		txtAccountLname.setColumns(10);
		txtAccountLname.setBounds(181, 135, 186, 26);
		panel_1.add(txtAccountLname);
		parentFrame = parent;
		frame = this;

	}
	private class submitListener implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			if (txtAccountID.getText().isEmpty() || txtAccountFname.getText().isEmpty() || txtAccountAddress.getText().isEmpty() || txtAccountPassword.getPassword().length==0 || txtAccountConfirmPass.getPassword().length==0 || txtAccountEmail.getText().isEmpty() || txtAccountPhone.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please complete the form!");

			}

			else {
				String pass = String.valueOf(txtAccountPassword.getPassword());
				String passCon = String.valueOf(txtAccountConfirmPass.getPassword());
				if ((!pass.equals(passCon)) || (pass.length()>16 || pass.length()<8)){
					JOptionPane.showMessageDialog(null, "Password don't match or weak password");
					
				}
				else {
					
					int res = JOptionPane.showConfirmDialog( null, "Account Successfully Created!\nLog-In Now?", "Message", JOptionPane.YES_NO_OPTION);
					if(res == JOptionPane.YES_OPTION){
						frame.setVisible(false);
						parentFrame.setVisible(true);
					}
					txtAccountID.setText(null);
					txtAccountFname.setText(null);
					txtAccountLname.setText(null);
					txtAccountAddress.setText(null);
					txtAccountEmail.setText(null);
					txtAccountPassword.setText(null);
					txtAccountPhone.setText(null);
					txtAccountConfirmPass.setText(null);
				}
			}
		}
	}
}
