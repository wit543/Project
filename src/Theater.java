import java.util.ArrayList;


public class Theater {
private int[] numberOfTypeOfSeat;
private int[]	numbeOfRow;
private int numberOfColumn;
//[]=type of seat 
//[][] = diemtiontion of seat
//		______________________
//		[1][1][1][1][1][1][1][1]
//		[1][1][1][1][1][1][1][1]
//		[1][1][1][1][1][1][1][1]
//		[2][2][2][2][2][2][2][2]
//		[2][2][2][2][2][2][2][2]
//		[2][2][2][2][2][2][2][2]
//		[2][2][2][2][2][2][2][2]
//		[3][3][3][3][3][3][3][3]
//		dimentionOfTheSeatAndNumBerOfSeat = new int[3][2];
//		dimentionOfTheSeatAndNumBerOfSeat[0][0]=8;
//		dimentionOfTheSeatAndNumBerOfSeat[0][1]=3;
//		dimentionOfTheSeatAndNumBerOfSeat[1][0]=8;
//		dimentionOfTheSeatAndNumBerOfSeat[1][1]=4;
//		dimentionOfTheSeatAndNumBerOfSeat[2][0]=8;
//		dimentionOfTheSeatAndNumBerOfSeat[2][1]=1;

	private double[] price;

	Theater(int[] numberOfRow,int numberOfColumnint,int[] numberOfTypeOfSeat, double[] price){
	this.numbeOfRow=numberOfRow;
	this.numberOfColumn = numberOfColumn;
	this.numberOfTypeOfSeat =  numberOfTypeOfSeat;
		this.price = price;
	}

	public int[] numbeOfRow() {
		return numbeOfRow;
	}
	public int getNumberOfColumn(){
		return numberOfColumn;
	}

	public double[] getPrice() {
		return price;
	}

	public void setPrice(double[] price) {
		this.price = price;
	}

}
