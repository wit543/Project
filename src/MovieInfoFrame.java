import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;


public class MovieInfoFrame extends JFrame {

	/**
	 * Create the panel.
	 */
	public MovieInfoFrame(Movie movie) {
		setBounds(400, 100, 400, 600);
		setUndecorated(true);
		getContentPane().setLayout(null);
		addMouseListener(new  MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel title = new JLabel(movie.getTitle());
		title.setFont(new Font("Tahoma", Font.BOLD, 15));
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setBackground(Color.BLUE);
		title.setOpaque(true);
		title.setBounds(20, 30, 134, 56);
		
		getContentPane().add(title);
		
		JLabel rating = new JLabel(String.valueOf(movie.getRating()));
		rating.setFocusCycleRoot(true);
		rating.setFocusTraversalPolicyProvider(true);
		rating.setFont(new Font("Harrington", Font.PLAIN, 23));
		rating.setHorizontalTextPosition(SwingConstants.CENTER);
		rating.setHorizontalAlignment(SwingConstants.CENTER);
		rating.setOpaque(true);
		rating.setBackground(Color.BLUE);
		rating.setBounds(326, 34, 46, 45);
		getContentPane().add(rating);
		
		JLabel duration = new JLabel(String.valueOf(movie.getDulation()/60));
		duration.setHorizontalAlignment(SwingConstants.CENTER);
		duration.setOpaque(true);
		duration.setBackground(Color.BLUE);
		duration.setBounds(276, 97, 92, 45);
		getContentPane().add(duration);
		
		JTextArea summery = new JTextArea(movie.getSummery());
		summery.setOpaque(true);
		summery.setBackground(Color.BLUE);
		summery.setBounds(20, 153, 367, 198);
		getContentPane().add(summery);
		
		JLabel trailer = new JLabel();
		trailer.setOpaque(true);
		trailer.setBackground(Color.BLUE);
		String url = "images/"+movie.getTitle()+"Trailer.gif";
		try{
				trailer.setIcon(new ImageIcon(getClass().getClassLoader().getResource(url)));
		}
		catch(Exception e){
			
		}
	//	trailer.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/The Maze RunnerTrailer.gif")));
		trailer.setBounds(45, 387, 288, 162);
		getContentPane().add(trailer);
		
		JLabel label = new JLabel(String.valueOf(movie.getRate())+"+");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(263, 43, 53, 35);
		getContentPane().add(label);
		
		JLabel director = new JLabel(movie.getDirector());
		director.setBounds(30, 97, 134, 45);
		getContentPane().add(director);
		
		JLabel language = new JLabel(movie.getLanguage());
		language.setBounds(185, 97, 89, 45);
		getContentPane().add(language);
		
		JLabel releaseDate = new JLabel(movie.getReleaseDay().toString());
		releaseDate.setBounds(164, 38, 79, 45);
		getContentPane().add(releaseDate);
	}
}
