import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;


public class clearMember extends JFrame implements Runnable{

	private JPanel contentPane;
	private int confirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		clearMember main = new clearMember();
		main.run();
	}
	
	public void run(){
		super.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public clearMember() {
		setTitle("Clear Member");
		setType(Type.UTILITY);
		setBounds(500, 100, 259, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		RegistMember regist = new RegistMember();
		JButton btnClearAll = new JButton("Clear All Member");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showconfirmDialog();
				if(confirm==0){
					regist.clearMember();
					dispose();
				}
			}
		});
		btnClearAll.setBounds(30, 32, 179, 39);
		contentPane.add(btnClearAll);
		
		JButton btnClearRegularMember = new JButton("Clear Regular Member");
		btnClearRegularMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showconfirmDialog();
				if(confirm==0){
					regist.clearRegularMember();
					dispose();
				}
				
			}
		});
		btnClearRegularMember.setBounds(30, 101, 179, 23);
		contentPane.add(btnClearRegularMember);
		
		JButton btnClearStudentMember = new JButton("Clear Student Member");
		btnClearStudentMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showconfirmDialog();
				if(confirm==0){
					regist.clearStudentMember();
					dispose();
				}
				
			}
		});
		btnClearStudentMember.setBounds(30, 148, 179, 23);
		contentPane.add(btnClearStudentMember);
		
		JButton btnClearElderlyMember = new JButton("Clear Elderly Member");
		btnClearElderlyMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showconfirmDialog();
				if(confirm==0){
					regist.clearElderlyMember();
				}
				
			}
		});
		btnClearElderlyMember.setBounds(30, 191, 179, 23);
		contentPane.add(btnClearElderlyMember);
	}
	
	public void showconfirmDialog(){
		confirm =JOptionPane.showConfirmDialog(this,"Are you sure to clear ?","Confirm",JOptionPane.YES_NO_OPTION);

	}
}
