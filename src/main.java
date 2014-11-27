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
		//c.run();
	}
	
public static void innitAll(){
	theaterList.add(new Theater(new int[] { 5, 10, 1 }, new int[]{10,8,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName));
	ArrayList<ImageIcon[]> imageIconList =new ArrayList<ImageIcon[]>();
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	imageIconList.add(new ImageIcon[5]);
	

		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				try {
				String location ="D:\\java\\y1s1\\Project\\src\\images\\movie"+(i+1)+"_"+j+".png";
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
	roundList.add(new Round(theaterList.get(2), new Time(10, 10, 10),
			new Time(11, 11, 11), movieList.get(0)));
	Booking b = new Booking(roundList.get(0));
	b.run();
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
