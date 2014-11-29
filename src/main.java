import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.jws.soap.SOAPBinding;
import javax.swing.ImageIcon;

public class main {
	static String cinemaName = "SKE";
	static ArrayList<Round> roundList = new ArrayList<Round>();
	static ArrayList<Movie> movieList = new ArrayList<Movie>();
	static ArrayList<Theater> theaterList = new ArrayList<Theater>();
	public static void main(String[] args) {

		innitAll();
		ArrayList<Round> newRound = sortForMovie(roundList);
		choose c = new choose(movieList,roundList);
		c.run();

	}
		
public static void innitAll(){
	theaterList.add(new Theater(new int[] { 5, 10, 1 }, new int[]{10,8,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName,"Normal"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName,"IMAX"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName,"3D"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"2D"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"1D"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"vintage"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"111111111111111"));
	ArrayList<ImageIcon[]> imageIconList =new ArrayList<ImageIcon[]>();


		for(int i=0;i<10;i++){
			imageIconList.add(new ImageIcon[5]);
			for(int j=0;j<5;j++){
				try {
				String location ="src\\images\\movie"+(i+1)+"_"+j+".png";
				imageIconList.get(i)[j] = new ImageIcon(ImageIO.read(new File(location)));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Fail");
				}
			}
		}

	movieList.add(new Movie("a in a", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18, imageIconList.get(0),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in b", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(1),"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in c", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(2),"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(3),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(4),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(5),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(6),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(7),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(8),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	movieList.add(new Movie("a in d", 9.8,
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			18,  imageIconList.get(9),  "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "action", new Day(
					10, 10, 10), "Steave Job",
			"ccccccccccccccccccccccccccccccccccccccc", "english", new Time(
					1000000)));
	roundList.add(new Round(theaterList.get(0), new Time(10, 10, 10),
			new Time(11, 11, 11), movieList.get(0)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(1)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(2)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(3)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(4)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(5)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(6)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(7)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(8)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(9)));
	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
			new Time(11, 11, 11), movieList.get(0)));
	writeToTextRoundList();
}
public static void writeToTextRoundList(){
	for(int i =0;i<roundList.size();i++)	{
		String[] array =roundList.get(i).toString().split("#");
		for(int j=0;j<array.length;j++){
			if(array[j].charAt(0)=='['){

				array[j]=array[j].substring(1, array[j].length()-1);
				String[] arrayInner = array[j].split(", ");
				for(int k=0;k<arrayInner.length;k++){
					System.out.print(arrayInner[k]+"@");
				}
			}
			else{
			System.out.print(array[j]+"#");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println();  
	for(int i =0;i<roundList.size();i++)	{
		System.out.println(roundList.get(i));
	}
}
public static void writeToTextMovieList(){
	for(int i =0;i<movieList.size();i++)	{
		String[] array =movieList.get(i).toString().split("#");
		for(int j=0;j<array.length;j++){
			if(array[j].charAt(0)=='['){

				array[j]=array[j].substring(1, array[j].length()-1);
				String[] arrayInner = array[j].split(", ");
				for(int k=0;k<arrayInner.length;k++){
					System.out.print(arrayInner[k]+"@");
				}
			}
			else{
			System.out.print(array[j]+"#");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println();  
	for(int i =0;i<movieList.size();i++)	{
		System.out.println(movieList.get(i));
	}
}
public static void wirteToTextTheaterList(){
	File file = new File("src\\save\\roundList");
	for(int i =0;i<theaterList.size();i++)	{
		String[] array =theaterList.get(i).toString().split("#");
		for(int j=0;j<array.length;j++){
			if(array[j].charAt(0)=='['){

				array[j]=array[j].substring(1, array[j].length()-1);
				String[] arrayInner = array[j].split(", ");
				for(int k=0;k<arrayInner.length;k++){
					System.out.print(arrayInner[k]+"@");
				}
			}
			else{
			System.out.print(array[j]+"#");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println();  
	for(int i =0;i<theaterList.size();i++)	{
		System.out.println(theaterList.get(i));
	}
}
	public static ArrayList<Round> sortForMovie(ArrayList<Round> round) {
		ArrayList<Round> newRound = new ArrayList<Round>();
		Collections.sort(round);
		for(int i =0;i<round.size();i++){
			//System.out.println(round.get(i).toString());
		}
	
		return newRound;
	}
}
