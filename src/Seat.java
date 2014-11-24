import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Seat {
	private  ArrayList<ImageIcon[]> imageList =new ArrayList<ImageIcon[]>();
	private double price;
	private String type;
	private int numberOfPersonThatCanSit;
	Ticket ticket;
	boolean isBooked;

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

		int numberOfType =5;
		for(int i =0;i<numberOfType;i++){
			ImageIcon[] array = new ImageIcon[2];
			try {
				array[0] = new ImageIcon(ImageIO.read(new File("")));// String examp;e "seatType1_1"
			} catch (Exception e) {
				// TODO: handle exception
			}
			try{
				array[1] = new ImageIcon(ImageIO.read(new File("")));
			}
			catch (Exception e){
				
			}
			imageList.add(array);
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
	public int convertTypeToInt(String type){
		if(type.equals("normal")){
			return 0;
		}
		if(type.equals("honeymoon"))
			return 2;
		return -1;
	}
	public ImageIcon getImageIcon(){
		if(isBooked)
			return imageList.get(convertTypeToInt(type))[0];
		return imageList.get(convertTypeToInt(type))[1];
	}
	
}
