import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class MenuMember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMember frame = new MenuMember();
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
	public MenuMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistMember regist = new RegistMember();
				regist.run();
			}
		});
		btnRegister.setBounds(146, 31, 149, 61);
		contentPane.add(btnRegister);
		
		JButton btnMemberInformation = new JButton("Member Information");
		btnMemberInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistMember regist = new RegistMember();
				RegistMember.memberList = new ArrayList<Member>();
				regist.readText();
				if(RegistMember.memberList.size()==0){
					showDialog();
				}
				else{
					MemberInformation inform = new MemberInformation();
					inform.run();
				}
				
			}
		});
		btnMemberInformation.setBounds(130, 115, 182, 47);
		contentPane.add(btnMemberInformation);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearMember clear = new clearMember();
				clear.run();
			}
		});
		btnClear.setBounds(175, 227, 89, 23);
		contentPane.add(btnClear);
	}
	
	public void showDialog(){
		JOptionPane.showMessageDialog(this, "Not have member in list. Please register", "Warning", JOptionPane.PLAIN_MESSAGE);
	}

}
