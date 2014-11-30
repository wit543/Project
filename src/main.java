import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

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
		//choose c = new choose(movieList,roundList);
	//	c.run();

	}
		
public static void innitAll(){
	theaterList.add(new Theater(new int[] { 5, 10, 1 }, new int[]{10,8,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName,"Normal","src\\images\\imax.png"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName,"IMAX","src\\images\\imax.png"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "normal", "normal", "normal" },cinemaName,"3D","src\\images\\imax.png"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"2D","src\\images\\imax.png"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"1D","src\\images\\imax.png"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"vintage","src\\images\\imax.png"));
	theaterList.add(new Theater(new int[] { 3, 3, 2 },  new int[]{10,10,5}, 3, new double[] {
			1, 2, 3 }, new String[] { "a", "b", "c" },cinemaName,"111111111111111","src\\images\\imax.png"));



	


	readFromTextMovieList();
	initMoive();
//
//	roundList.add(new Round(theaterList.get(0), new Time(10, 10, 10),
//			new Time(11, 11, 11), movieList.get(0)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(1)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(2)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(3)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(4)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(5)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(6)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(7)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(8)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(9)));
//	roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
//			new Time(11, 11, 11), movieList.get(0)));

//	writeToTextTheaterList();
	//writeToTextRoundList();
}
public static void initMoive(){

	if(new File("src\\files\\movie.txt").exists()){
		readFromTextMovieList();
	}
	else{
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
		}
	}
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
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	for(int i =0;i<roundList.size();i++)	{
		System.out.println(roundList.get(i));
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
}
static ArrayList<String[]> ArrayOfMovieList = new ArrayList<String[]>();
public static void readFromTextMovieList(){
	File movie = new File("src\\files\\movie.txt");
	try{
		if(movie.exists()){
			Scanner readMovie = new Scanner(movie);
			while (readMovie.hasNext()){
				ArrayOfMovieList.add(readMovie.nextLine().split("#"));
				ImageIcon[] imageIconList =new ImageIcon[5];
				for(int j=0;j<5;j++){
					try {
					String location ="src\\images\\movie"+(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[5])+"_"+j+".png";
					imageIconList[j] = new ImageIcon(ImageIO.read(new File(location)));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Fail");
					}
				}
				Day d = new Day(Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[6].split("/")[0]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[6].split("/")[1]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[6].split("/")[2]));
				Time t = new Time(Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[10].split(":")[0]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[10].split(":")[1]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[10].split(":")[2]));
				movieList.add(new Movie(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[0], Double.parseDouble(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[1]),ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[2], Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[3]), imageIconList, ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[5], ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[6], d, ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[7], ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[8], ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[9], t));
			}
			readMovie.close();
		}
	}
	catch(IOException e){
		
	}
	for(int i =0;i<ArrayOfMovieList.size();i++){
		System.out.println("000000000000000000000000000");
		System.out.println(Arrays.toString(ArrayOfMovieList.get(i)));
	}
}
public static void writeToTextMovieList(){
	File movie = new File("src\\files\\movie.txt");
	String out="";
	for(int i =0;i<movieList.size();i++)	{
		String[] array =movieList.get(i).toString().split("#");
		for(int j=0;j<array.length;j++){
			if(array[j].charAt(0)=='['){

				array[j]=array[j].substring(1, array[j].length()-1);
				String[] arrayInner = array[j].split(", ");
				for(int k=0;k<arrayInner.length;k++){
					out+=arrayInner[k]+"@";
				}
			}
			else{
			out+=array[j]+"#";
			}
		}
		out+="\r\n";
	}
	try{
		FileWriter fw =new FileWriter(movie);
		PrintWriter pw = new PrintWriter(fw);
		pw.print(out);
		pw.close();
		fw.close();
	}catch(IOException e){
		
	}
	System.out.println(out);
	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	for(int i =0;i<movieList.size();i++)	{
		System.out.println(movieList.get(i));
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
}
public static void writeToTextTheaterList(){
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
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	for(int i =0;i<theaterList.size();i++)	{
		System.out.println(theaterList.get(i));
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
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
