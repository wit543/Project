import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class ViewMember extends JFrame implements Runnable {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ViewMember main = new ViewMember();
		main.run();
	}
	
	public void run(){
		super.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ViewMember() {
		setBounds(100, 100, 405, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String s = MemberInformation.member.toString();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 373, 191);
		contentPane.add(scrollPane);
		JTextArea textArea = new JTextArea(s);
		scrollPane.setViewportView(textArea);
	}
}
