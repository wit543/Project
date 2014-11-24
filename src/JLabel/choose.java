package JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.CardLayout;

public class choose extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choose frame = new choose();
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
	public choose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		setUndecorated(true);
		JLabel previousLabel = new JLabel("New label");
		previousLabel.setBounds(10, 60, 140, 180);
		previousLabel.setBackground(Color.RED);
		previousLabel.setOpaque(true);
		getContentPane().add(previousLabel);
		
		JLabel mainLabel = new JLabel("New label");
		mainLabel.setBounds(190, 20, 215, 265);
		mainLabel.setBackground(Color.BLUE);
		mainLabel.setOpaque(true);
		getContentPane().add(mainLabel);
		
		JLabel nextLabel = new JLabel("New label");
		nextLabel.setBounds(450, 60, 140, 180);
		nextLabel.setBackground(Color.BLUE);
		nextLabel.setOpaque(true);
		getContentPane().add(nextLabel);
		
		JLabel previousButton = new JLabel("New label");
		previousButton.setBounds(10, 300, 150, 50);
		previousButton.setBackground(Color.CYAN);
		previousButton.setOpaque(true);
		getContentPane().add(previousButton);
		
		JLabel chooseButton = new JLabel("New label");
		chooseButton.setBounds(190, 315, 215, 55);
		chooseButton.setBackground(Color.BLACK);
		chooseButton.setOpaque(true);
		getContentPane().add(chooseButton);
		
		JLabel nextButton = new JLabel("New label");
		nextButton.setBounds(440, 300, 150, 50);
		nextButton.setBackground(Color.YELLOW);
		nextButton.setOpaque(true);
		getContentPane().add(nextButton);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


	}

}
