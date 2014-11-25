import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;


public class MovieInfoPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MovieInfoPanel() {
		setSize(280,480);
		setLayout(null);
		
		JLabel title = new JLabel("New label");
		title.setBackground(Color.BLUE);
		title.setOpaque(true);
		title.setBounds(20, 11, 119, 40);
		
		add(title);
		
		JLabel label = new JLabel("New label");
		label.setOpaque(true);
		label.setBackground(Color.BLUE);
		label.setBounds(20, 94, 46, 45);
		add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setOpaque(true);
		label_1.setBackground(Color.BLUE);
		label_1.setBounds(76, 112, 119, 40);
		add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setOpaque(true);
		label_2.setBackground(Color.BLUE);
		label_2.setBounds(20, 163, 250, 96);
		add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setOpaque(true);
		label_3.setBackground(Color.BLUE);
		label_3.setBounds(10, 358, 260, 111);
		add(label_3);
	}
}
