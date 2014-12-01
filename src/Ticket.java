public class Ticket {
	//private Round round;
	private String movieTitle, date, seatNumber, ID, theater, cinemaName;

	private static int numberOfTicket = 1;
	private double price, discount;
	private Round round;
	private Movie movie;
	private Seat seat;
	Ticket(Movie movie, Round round, Seat seat) {
		this.round=round;
		this.movie=movie;
		this.seat=seat;
		//this.round=round;
		this.movieTitle = movie.getTitle();
		this.date = round.getCurrentDay().toString() + " "
				+ round.getStart().toString();
		this.seatNumber = seat.getID();
		this.theater = round.getTheaterID();
		this.ID = String.valueOf(numberOfTicket);
		numberOfTicket++;
		this.price = price;
		this.cinemaName = round.getTheater().getCinemaName();
	}

	@Override
	public String toString() {
		return movie.getID()+"#"+round.getID()+"#"+seat.getPosition()[0]+"#"+seat.getPosition()[1]+"#"+seat.getPosition()[2];
	}

	
}
