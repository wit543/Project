
public class Day {
	int day;
	int month;
	int year;
	Day(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDayTillTheMoviePermier(Day	currentDay){
		if((this.day-currentDay.day+(this.month-currentDay.month)*30+(this.year-currentDay.year)*365)>0)
			return (this.day-currentDay.day+(this.month-currentDay.month)*30+(this.year-currentDay.year)*365);
		return -1; // already show
	}
	public String toString(){
		return day+"/"+month+"/"+year;
	}
	
}
