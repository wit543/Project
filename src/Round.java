import java.util.ArrayList;


public class Round {
	private Movie movie;
	private Time start,end;
	private Seat[][] seat;
	private ArrayList<Seat[][]> seatInEachtype= new ArrayList<Seat[][]>();
//	[]=row
//	[][]=column
	private int[] price;
	Round(Theater theater){
			initSeat(theater);
			}
private void initSeat(Theater theater){
	for(int i =0;i<theater.getNumberOfTypeOfSeat();i++){
		System.out.println(theater.getNumbeOfRow()[i]);
		seatInEachtype.add(new Seat[theater.getNumbeOfRow()[i]][theater.getNumberOfColumn()]);
	}
	for(int i=0;i<seatInEachtype.size();i++){
		for(int j = 0;j<seatInEachtype.get(i).length;j++){
			for(int k =0;k<seatInEachtype.get(i)[j].length;k++){
				seatInEachtype.get(i)[j][k] = new Seat(theater.getTypeOfSeat()[i], theater.getPrice()[i]);
				System.out.print(	seatInEachtype.get(i)[j][k].getPriceAndType()+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
}
