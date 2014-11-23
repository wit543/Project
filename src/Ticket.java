
public class Ticket {
private Movie movie;
private Round round;
private String movieTitle,date,seat,ID,theater;
private int numberOfTicket=1;
double price, discount;
 
Ticket(String movieTitle,String date ,String seat,String theater){
	this.movieTitle = movieTitle;
	this.date = date;
	this.seat = seat;
	this.theater = theater;
}
}
