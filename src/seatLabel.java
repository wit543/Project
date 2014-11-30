import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class seatLabel extends JLabel {
	Seat seat;
	BookSeat booking;
	seatLabel seatlabel;
	seatLabel(Seat seat,BookSeat booking){
		this.seatlabel = this;
		this.seat = seat;
		this.booking = booking;
		setPreferredSize(new Dimension(50,50));
		setMaximumSize(new Dimension(50,50));
		setMinimumSize(new Dimension(50,50));
		addMouseListener(new seatMouseListen());
		setIcon(seat.getImageIcon());

	}
	public String getSeatNumber(){
		return seat.getID();
	}
	public Seat getSeat(){
		return seat;
	}
	private class seatMouseListen implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if(seat.canBook()){
				booking.getRound().booking(seat.getPosition()[0], seat.getPosition()[1],seat.getPosition()[2]);
				setIcon(seat.getImageIcon());
				booking.getBookedList().add(seat);
			}
			else if(seat.getStatus().equals("booked")){
				seat.cancel();
				booking.getRound().cancelSeat(seat.getPosition()[0], seat.getPosition()[1],seat.getPosition()[2]);
				setIcon(seat.getImageIcon());
				System.out.println(booking.searchIndexOFSeat(seat));
				booking.getBookedList().remove(booking.searchIndexOFSeat(seat));
			}
			setIcon(seat.getImageIcon());
			booking.updateInfo();
			System.out.println(seat.getPosition()[0]+" "+seat.getPosition()[1]+" "+seat.getPosition()[2]);
			System.out.println(booking.getRound().getSeatInEachType().get(seat.getPosition()[0])[seat.getPosition()[1]][seat.getPosition()[2]].getStatus()+" ");
//			for (int i = 0; i < booking.getRound().getSeatInEachType().size(); i++) {
//				for (int j = 0; j < booking.getRound().getSeatInEachType().get(i).length; j++) {
//					for (int k = 0; k < booking.getRound().getSeatInEachType().get(i)[j].length; k++) {
//						System.out.print(booking.getRound().getSeatInEachType().get(i)[j][k].getStatus()+" ");
//					}
//					System.out.println();
//				}
//				System.out.println();
//			}
//				System.out.println(booking.getRound().getTicketList().toString());
			
		}

	}
	public void cancel(){
		seat.cancel();
		booking.getRound().cancelSeat(seat.getPosition()[0], seat.getPosition()[1],seat.getPosition()[2]);
		setIcon(seat.getImageIconList().get(0)[1]);

	}
	public void payed(){
		seat.setPayed();
		booking.getRound().payed(seat.getPosition()[0], seat.getPosition()[1],seat.getPosition()[2]);
		setIcon(seat.getImageIconList().get(0)[2]);
		setIcon(seat.getImageIconList().get(0)[2]);
	}
	public void updateIcon(){
		seat.cancel();
		booking.getRound().cancelSeat(seat.getPosition()[0], seat.getPosition()[1],seat.getPosition()[2]);
	
			setIcon(seat.getImageIcon());
		//	setIcon(new ImageIcon(ImageIO.read(new File("src\\images\\normalSeatUnBooked.png"))));
		
			 
		

	}
}
