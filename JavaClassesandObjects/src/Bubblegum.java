import java.util.Scanner;

public class Bubblegum {
	private String flavor;
	private int numberOfPieces;
	private String color;
	private String company;
	
	public Bubblegum() {
		
	}
	
	/*A constructor that uses only 2 of your 3 variables
	 A constructor that uses all 3 of your instance variables 
	 Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
	 A method that returns a Boolean 
	 A method that returns a String*/
	
	public Bubblegum(String flavor, int numberOfPieces) {
		this.flavor = flavor;
		this.numberOfPieces = numberOfPieces;
	}
	
	public Bubblegum(String flavor, String color, int numberOfPieces) {
		this.flavor = flavor;
		this.color = color;
		this.numberOfPieces = numberOfPieces;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public int getNumberOfPieces() {
		return numberOfPieces;
	}
	
	public void setNumberOfPieces(int numberOfPieces) {
		this.numberOfPieces = numberOfPieces;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String companyOfBubblegumType(String company) {
		return company;
	}
	
	public boolean hasUSCompanyOfBubblegumType(String company) {
		return true;
	}
}
