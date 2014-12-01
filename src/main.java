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
	static ArrayList<String[]> ArrayOfMovieList = new ArrayList<String[]>();
	static ArrayList<String[]> ArrayOfTheaterList = new ArrayList<String[]>();
	static ArrayList<String[]> ArrayOfRoundList = new ArrayList<String[]>();
	public static void main(String[] args) {

		innitAll();
		ArrayList<Round> newRound = sortForMovie(roundList);
	choose c = new choose(movieList,roundList);
	c.run();
	for(int i=0;i<roundList.size();i++){
		System.out.println(roundList.get(i).getID()+" |"+roundList.get(i).toString());
		System.out.println(Arrays.toString(ArrayOfRoundList.get(i)));
	}
	}
		
public static void innitAll(){
	



	//writeToTextTheaterList();

initTheater();
initMoive();
initRound();


//	writeToTextTheaterList();
	//writeToTextRoundList();
}
public static void initRound(){
	if(new File("src\\data\\round.txt").exists()){
	readFromTextRoundList();
	}
	else{
		roundList.add(new Round(theaterList.get(0), new Time(10, 10, 10),
				new Time(11, 11, 11), movieList.get(0)));
		roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(1)));
		roundList.add(new Round(theaterList.get(2), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(2)));
		roundList.add(new Round(theaterList.get(3), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(3)));
		roundList.add(new Round(theaterList.get(4), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(4)));
		roundList.add(new Round(theaterList.get(5), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(5)));
		roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(6)));
		roundList.add(new Round(theaterList.get(2), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(7)));
		roundList.add(new Round(theaterList.get(3), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(8)));
		roundList.add(new Round(theaterList.get(5), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(9)));
		roundList.add(new Round(theaterList.get(1), new Time(5, 5, 5),
				new Time(11, 11, 11), movieList.get(0)));
		writeToTextRoundList();
	}
}
public static void initTheater(){
	if(new File("src\\data\\theater.txt").exists()){
	readFromTextTheaterList();	
	}
	else{
		theaterList.add(new Theater(new int[] { 5, 1, 1 }, new int[]{5,5,5}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"Normal","src\\images\\imax.png"));
		theaterList.add(new Theater(new int[] { 1, 1, 5 },  new int[]{5,5,5}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"enigma","src\\images\\imax.png"));
		theaterList.add(new Theater(new int[] { 1, 1, 3 },  new int[]{1,1,10}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"3D","src\\images\\imax.png"));
		theaterList.add(new Theater(new int[] { 1, 1, 2 },  new int[]{2,1,5}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"2D","src\\images\\imax.png"));
		theaterList.add(new Theater(new int[] { 1, 5, 3 },  new int[]{2,1,5}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"1D","src\\images\\imax.png"));
		theaterList.add(new Theater(new int[] { 2, 3, 5 },  new int[]{1,1,1}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"vintage","src\\images\\imax.png"));
		theaterList.add(new Theater(new int[] { 3, 2, 5 },  new int[]{4,1,5}, 3, new double[] {
				1, 2, 3 }, new String[] { "normal", "special", "honeymoon"  },cinemaName,"IMAX","src\\images\\imax.png"));
		writeToTextTheaterList();
	}
}
public static void initMoive(){

	if(new File("src\\data\\movie.txt").exists()){
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
		}
		movieList.add(new Movie("The Hunger Games", 7.2,
				"When Katniss destroys the games, she goes to District 13 after District 12 is destroyed. She meets President Coin who convinces her to be the symbol of rebellion, while trying to save Peeta from the Capitol.",
				13, imageIconList.get(0),  "With the Games now destroyed and in pieces, Katniss Everdeen, along with Gale, Finnick and Beetee, now end up in the so thought \"destroyed\" District 13. Under the leadership of President Coin and the advice of her friends, Katniss becomes the \"Mockingjay\" and the symbol of rebellion for the people. ", "  Adventure | Sci-Fi", 
				new Day(21, 11, 14), "Francis Lawrence",
				"When Katniss destroys the games, she goes to District 13 after District 12 is destroyed. She meets President Coin who convinces her to be the symbol of rebellion, while trying to save Peeta from the Capitol.", "english", new Time(
						7380)));
		movieList.add(new Movie("The Maze Runner", 7.2,
				"Thomas is deposited in a community of boys after his memory is erased, soon learning they're all trapped in a maze that will require him to join forces with fellow \"runners\" for a shot at escape.",
				13,  imageIconList.get(1),"Thomas wakes up in an elevator, remembering nothing but his own name. He emerges into a world of about 60 teen boys who have learned to survive in a completely enclosed environment, subsisting on their own agriculture and supplies. A new boy arrives every 30 days. The original group has been in \"The Glade\" for two years, trying to find a way to escape through the Maze that surrounds their living space. They have begun to give up hope. Then a comatose girl arrives with a strange note, and their world begins to change. There are some great, fast-paced action scenes, particularly those involving the nightmarish Grievers who plague the boys.", " Action | Mystery | Sci-Fi",
				new Day(19, 9, 14), "Wes Ball",
				"Thomas is deposited in a community of boys after his memory is erased, soon learning they're all trapped in a maze that will require him to join forces with fellow \"runners\" for a shot at escape.", "english", new Time(
						12960)));
		movieList.add(new Movie("The Hobbit: The Battle of the Five Armies", 9.8,
				"Bilbo and Company are forced to be engaged in a war against an array of combatants and keeping the terrifying Smaug from acquiring a kingdom of treasure. and obliterating all of Middle-Earth.",
				13,  imageIconList.get(2),"Bilbo and Company are forced to be engaged in a war against an array of combatants and keeping the terrifying Smaug from acquiring a kingdom of treasure. and obliterating all of Middle-Earth.", " Adventure | Fantasy ", 
				new Day(17, 12, 14), "Peter Jackson",
				"Bilbo and Company are forced to be engaged in a war against an array of combatants and keeping the terrifying Smaug from acquiring a kingdom of treasure. and obliterating all of Middle-Earth.", "english", new Time(
						10140)));
		movieList.add(new Movie("Interstellar", 9.8,
				"A team of explorers travel through a wormhole in an attempt to find a potentially habitable planet that will sustain humanity.",
				13,  imageIconList.get(3),  "In the near future, Earth has been devastated by drought and famine, causing a scarcity in food and extreme changes in climate. When humanity is facing extinction, a mysterious rip in the space-time continuum is discovered, giving mankind the opportunity to widen its lifespan. A group of explorers must travel beyond our solar system in search of a planet that can sustain life. The crew of the Endurance are required to think bigger and go further than any human in history as they embark on an interstellar voyage into the unknown. Coop, the pilot of the Endurance, must decide between seeing his children again and the future of the human race. ", " Adventure | Sci-Fi",
				new Day(7,11,14), "Christopher Nolan",
				"A team of explorers travel through a wormhole in an attempt to find a potentially habitable planet that will sustain humanity.", "english", new Time(
						10140)));
		movieList.add(new Movie("Star Wars: Episode I - The Phantom Menace ", 6.6,
				"Two Jedi Knights escape a hostile blockade to find allies and come across a young boy who may bring balance to the Force, but the long dormant Sith resurface to reclaim their old glory.",
				0,  imageIconList.get(4),  "The evil Trade Federation, led by Nute Gunray is planning to take over the peaceful world of Naboo. Jedi Knights Qui-Gon Jinn and Obi-Wan Kenobi are sent to confront the leaders. But not everything goes to plan. The two Jedi escape, and along with their new Gungan friend, Jar Jar Binks head to Naboo to warn Queen Amidala, but droids have already started to capture Naboo and the Queen is not safe there. Eventually, they land on Tatooine, where they become friends with a young boy known as Anakin Skywalker. Qui-Gon is curious about the boy, and sees a bright future for him. The group must now find a way of getting to Coruscant and to finally solve this trade dispute, but there is someone else hiding in the shadows. Are the Sith really extinct? Is the Queen really who she says she is? And what's so special about this young boy?", " Action | Adventure", 
				new Day(19, 5, 99), "George Lucas",
				"Two Jedi Knights escape a hostile blockade to find allies and come across a young boy who may bring balance to the Force, but the long dormant Sith resurface to reclaim their old glory.", "english", 
				new Time(8160)));
		movieList.add(new Movie("Star Wars: Episode II - Attack of the Clones", 6.8,
				"Ten years after initially meeting, Anakin Skywalker shares a forbidden romance with Padmé, while Obi-Wan investigates an assassination attempt on the Senator and discovers a secret clone army crafted for the Jedi.",
				0,  imageIconList.get(5),  "Ten years after the 'Phantom Menace' threatened the planet Naboo, Padmé Amidala is now a Senator representing her homeworld. A faction of political separatists, led by Count Dooku, attempts to assassinate her. There are not enough Jedi to defend the Republic against the threat, so Chancellor Palpatine enlists the aid of Jango Fett, who promises that his army of clones will handle the situation. Meanwhile, Obi-Wan Kenobi continues to train the young Jedi Anakin Skywalker, who fears that the Jedi code will forbid his growing romance with Amidala.", "  Action | Adventure", new Day(
						16, 5, 02), "George Lucas",
				"Ten years after initially meeting, Anakin Skywalker shares a forbidden romance with Padmé, while Obi-Wan investigates an assassination attempt on the Senator and discovers a secret clone army crafted for the Jedi.", "english", new Time(
						8520)));
		movieList.add(new Movie("Star Wars: Episode III - Revenge of the Sith ", 7.7,
				"As the Clone Wars near an end, the Sith Lord Darth Sidious steps out of the shadows, at which time Anakin succumbs to his emotions, becoming Darth Vader and putting his relationships with Obi-Wan and Padme at risk.",
				13,  imageIconList.get(6),  "It is three years after the start of the Clone Wars. The leader of the droid army, General Grievous, has captured Chancellor Palpatine on board his ship, the Invisible Hand. Jedi Master Obi-Wan Kenobi and Jedi Knight Anakin Skywalker must fly through Coruscant safely, and enter the Invisible Hand so that they can rescue the captive Chancellor. Just when Palpatine is about to be released, Count Dooku shows up. Obi-Wan and Anakin both battle it out with him, but Obi-Wan ends up unconscious. Anakin slices off his head and kills him. Anakin carries Obi-Wan, and Palpatine follows him. They meet General Grievous face to face, and Anakin tries to fly the last half of the ship so that they can safely land on Coruscant. Later, Palpatine starts acting strange, constantly manipulating Anakin into believing that the Jedi Council is against him. Eventually, it is found out that he is the Dark Lord of the Sith. Jedi Master Mace Windu fights him, along with three other Jedi that accompany Windu. ...", "  Action | Adventure | Fantasy", new Day(
						19, 5, 05), "George Lucas",
				"As the Clone Wars near an end, the Sith Lord Darth Sidious steps out of the shadows, at which time Anakin succumbs to his emotions, becoming Darth Vader and putting his relationships with Obi-Wan and Padme at risk.", "english", new Time(
						8400)));
		movieList.add(new Movie("Star Wars: Episode IV - A New Hope", 8.7,
				"Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a wookiee and two droids to save the universe from the Empire's world-destroying battle-station, while also attempting to rescue Princess Leia from the evil Darth Vader.",
				0,  imageIconList.get(7),  "A young boy from Tatooine sets out on an adventure with an old Jedi named Obi-Wan Kenobi as his mentor to save Princess Leia from the ruthless Darth Vader and Destroy the Death Star built by the Empire which has the power to destroy the entire galaxy.", "  Action | Adventure | Fantasy ", new Day(
						25, 5, 77), "George Lucas",
				"Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a wookiee and two droids to save the universe from the Empire's world-destroying battle-station, while also attempting to rescue Princess Leia from the evil Darth Vader.", "english", new Time(
						7260)));
		movieList.add(new Movie("Star Wars: Episode V - The Empire Strikes Back", 8.8,
				"After the rebels have been brutally overpowered by the Empire on their newly established base, Luke Skywalker takes advanced Jedi training with Master Yoda, while his friends are pursued by Darth Vader as part of his plan to capture Luke.",
				0,  imageIconList.get(8),  "Fleeing the evil Galactic Empire, the Rebels abandon their new base in an assault with the Imperial AT-AT walkers on the ice world of Hoth. Princess Leia, Han Solo, Chewbacca and the droid C-3PO escape in the Millennium Falcon, but are later captured by Darth Vader on Bespin. Meanwhile, Luke Skywalker and the droid R2-D2 follows Obi-Wan Kenobi's posthumous command, and receives Jedi training from Master Yoda on the swamp world of Dagobah. Will Skywalker manage to rescue his friends from the Dark Lord?", "  Action | Adventure | Fantasy", new Day(
						24, 6, 80), " Irvin Kershner",
				"After the rebels have been brutally overpowered by the Empire on their newly established base, Luke Skywalker takes advanced Jedi training with Master Yoda, while his friends are pursued by Darth Vader as part of his plan to capture Luke.", "english", new Time(
						7440)));
		movieList.add(new Movie("Star Wars: Episode VI - Return of the Jedi", 8.4,
				"After rescuing Han Solo from the palace of Jabba the Hutt, the rebels attempt to destroy the second Death Star, while Luke struggles to make Vader shake off of the dark side of the Force.",
				0,  imageIconList.get(9),  "Darth Vader and the Empire are building a new, indestructible Death Star. Meanwhile, Han Solo has been imprisoned, and Luke Skywalker has sent R2-D2 and C-3PO to try and free him. Princess Leia - disguised as a bounty hunter - and Chewbacca go along as well. The final battle takes place on the moon of Endor, with its natural inhabitants, the Ewoks, lending a hand to the Rebels. Will Darth Vader and the Dark Side overcome the Rebels and take over the universe?", "Action | Adventure | Fantasy ", new Day(
						25, 5, 83), "Steave Job",
				"After rescuing Han Solo from the palace of Jabba the Hutt, the rebels attempt to destroy the second Death Star, while Luke struggles to make Vader shake off of the dark side of the Force.", "english", new Time(
						8040)));
		writeToTextMovieList();
		
	}
}
public static void readFromTextTicketList(){
	File file = new File("src\\data\\round.txt");
	
}
public static void writeToTextTicketList(){
	File file = new File("src\\data\\round.txt");
	for(int i=0;i<roundList.size();i++){
		for(int j=0;j<roundList.get(i).getTicketList().size();j++	){
			System.out.println(roundList.get(i).getTicketList().get(j).toString());
		}
	}
}
public static void readFromTextRoundList(){

	File file = new File("src\\data\\round.txt");
	try{
		if(file.exists()){
			Scanner readRound = new Scanner(file);
			while (readRound.hasNext()){
				String[] input = readRound.nextLine().split("#");
				System.out.println(Arrays.toString(input)+"   "+ArrayOfRoundList.size());
				ArrayOfRoundList.add(input);
				Collections.sort(roundList);
				roundList.add(new Round(theaterList.get(Integer.parseInt(ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[0])), new Time(Integer.parseInt(ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[1].split(":")[0]),Integer.parseInt( ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[1].split(":")[1]),Integer.parseInt( ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[1].split(":")[2])), new Time(Integer.parseInt(ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[2].split(":")[0]),Integer.parseInt( ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[2].split(":")[1]),Integer.parseInt( ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[2].split(":")[2])), movieList.get(Integer.parseInt(ArrayOfRoundList.get(ArrayOfRoundList.size()-1)[3])-1)));
			}
			readRound.close();
		}
	}

	catch(IOException e){
		
	}
	for(int i=0;i<roundList.size();i++){
		System.out.println(roundList.get(i));
	}
//	for (int k = 0; k < roundList.size()-1; k++) {
//		for (int i = 0; i < roundList.size() - 1-k; i++) {
//
//			if (Integer.parseInt(roundList.get(i).getID()) >Integer.parseInt( roundList.get(i+1).getID())) {
//				Round  temp = roundList.get(i);
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//
//			}
//		}

	for(int i =0;i<ArrayOfRoundList.size();i++){
		System.out.println("000000000000000000000000000");
		System.out.println(Arrays.toString(ArrayOfRoundList.get(i)));
	}
}
public static void writeToTextRoundList(){
	File file = new File("src\\data\\round.txt");
	String out = "";
	for(int i =0;i<roundList.size();i++)	{
		String[] array =roundList.get(i).toString().split("#");
		for(int j=0;j<array.length;j++){

			out+=array[j]+"#";
			
		}
		out+="\r\n";
	}
	try{
		FileWriter fw =new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.print(out);
		pw.close();
		fw.close();
	}catch(IOException e){
		
	}

	System.out.println(out);
	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	for(int i =0;i<roundList.size();i++)	{
		System.out.println(roundList.get(i));
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
}

public static void readFromTextMovieList(){
	File movie = new File("src\\data\\movie.txt");
	try{
		if(movie.exists()){
			Scanner readMovie = new Scanner(movie);
			while (readMovie.hasNext()){
				String input = readMovie.nextLine();
				ArrayOfMovieList.add(input.split("#"));
				ImageIcon[] imageIconList =new ImageIcon[5];
				for(int j=0;j<5;j++){
					try {
					String location ="src\\images\\movie"+(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[4])+"_"+j+".png";
				imageIconList[j] = new ImageIcon(ImageIO.read(new File(location)));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Fail");
					}
				}
				Day d = new Day(Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[7].split("/")[0]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[7].split("/")[1]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[7].split("/")[2]));
				Time t = new Time(Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[11].split(":")[0]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[11].split(":")[1]),Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[11].split(":")[2]));
				movieList.add(new Movie(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[0], Double.parseDouble(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[1]),ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[2], Integer.parseInt(ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[3]), imageIconList, ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[5], ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[6], d, ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[8], ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[9], ArrayOfMovieList.get(ArrayOfMovieList.size()-1)[10], t));
			}
			readMovie.close();
		}
		
	}
	catch(IOException e){
		
	}
	
//	for(int i =0;i<ArrayOfMovieList.size();i++){
//		System.out.println("000000000000000000000000000");
//		System.out.println(Arrays.toString(ArrayOfMovieList.get(i)));
//	}
}
public static void writeToTextMovieList(){
	File movie = new File("src\\data\\movie.txt");
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

}
public static void readFromTextTheaterList(){

	File file = new File("src\\data\\theater.txt");
	try{
		if(file.exists()){
			Scanner readTheater = new Scanner(file);
			while (readTheater.hasNext()){
				String input = readTheater.nextLine();
				ArrayOfTheaterList.add(input.split("#"));
				String[] numbeOfRowString = ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[0].split("@");
				int[] numberOfRow=new int[Integer.parseInt(ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[2])];
				String[] numberOfColumnString = ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[1].split("@");
				int[] numberOfColumn=new int[Integer.parseInt(ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[2])];
				String[] typeOfSeat=ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[4].split("@");
				String[] priceString = ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[3].split("@");
				double[] price=new double[Integer.parseInt(ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[2])];
				for(int i=0;i<Integer.parseInt(ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[2]);i++){
					numberOfRow[i]=Integer.parseInt(numbeOfRowString[i]);
					numberOfColumn[i]=Integer.parseInt(numberOfColumnString[i]);
					price[i]=Double.parseDouble(priceString[i]);
				}
				theaterList.add(new Theater(numberOfRow, numberOfColumn, Integer.parseInt(ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[2]), price, typeOfSeat, ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[5],ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[6], ArrayOfTheaterList.get(ArrayOfTheaterList.size()-1)[7]));

		//		theaterList.add(new Theater(numberOfRow, numberOfColumn, numberOfTypeOfSeat, price, typeOfSeat, input, type, url))
			}
			readTheater.close();
		}
//		System.out.println("0000000000000000000000000000000000000000");
//		for(int i=0;i<theaterList.size();i++){
//			System.out.println(theaterList.get(i).toString());
//		}
//		System.out.println("0000000000000000000000000000000000000000");
	}
	catch(IOException e){
		
	}
	for(int i =0;i<ArrayOfMovieList.size();i++){
		System.out.println("000000000000000000000000000");
		System.out.println(Arrays.toString(ArrayOfMovieList.get(i)));
	}

}
public static void writeToTextTheaterList(){
	File file = new File("src\\data\\theater.txt");
	String out = "";
	for(int i =0;i<theaterList.size();i++)	{
		System.out.println(theaterList.get(i).toString());
		String[] array =theaterList.get(i).toString().split("#");
		for(int j=0;j<array.length;j++){
			if(array[j].charAt(0)=='['){

				array[j]=array[j].substring(1, array[j].length()-1);
				String[] arrayInner = array[j].split(", ");
				for(int k=0;k<arrayInner.length;k++){
					if(k<arrayInner.length-1){
					out+=(arrayInner[k]+"@");
					}
					else{
						out+=(arrayInner[k]+"#");
					}
						
				}
			
			}
			else{
			out+=(array[j]+"#");
			}
			
		}
		out+="\r\n";
	}
	try{
		FileWriter fw =new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.print(out);
		pw.close();
		fw.close();
	}catch(IOException e){
		
	}

		System.out.println(out);

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
