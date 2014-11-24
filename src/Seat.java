import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Seat {
	private  ArrayList<ImageIcon> imageList =new ArrayList()<ImageIcon>();
	private double price;
	private String type;
	private int numberOfPersonThatCanSit;
	Ticket ticket;
	boolean isBooked;
	ImageIcon Image_notBook ;
	ImageIcon Image_Booked ;
	String ID;
	Seat(String type,double price,String ID){
		this.type=type;
		this.price =price;
		this.isBooked = false;
		this.ID = ID;
		if(type.equals("honeymoon")){
			numberOfPersonThatCanSit=2;
		}
		else{
			numberOfPersonThatCanSit=1;
		}
		try {
			Image_notBook  = new ImageIcon( ImageIO.read(new File("")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		try {
			Image_Booked  = new ImageIcon( ImageIO.read(new File("")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		}
	}
	public String getID(){
		return ID;
	}
	public void booking(){
		isBooked=true;
	}
	public boolean canBook(){
		return !isBooked;
	}
	public String getPriceAndType(){
		return price+type;
	}
	public ImageIcon getImageIcon(){
		if(isBooked)
			return Image_Booked;
		return Image_notBook;
	}
	
}
