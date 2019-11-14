
public class backgroundInfoForStore {

	
	private String color;
	private int length;
	private int quantity;
	private int pricePerUnit;
	private double totalPrice;

	
	public backgroundInfoForStore() { // gets called automaticaly	
		color = "not yet defined";
		//length = 0;
	}
	public void setColor (String userinputcolor) {//sets the color of the lights
		//System.out.println("hi");
		color = userinputcolor;
	}
	
	public void setLength (int numOfFeet) {
		length = numOfFeet;
	}
	public void setnumber (int numoflights) {
		quantity = numoflights;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public int getlength() {
		return length;
	}
	
	
	public void priceCal () {//calculates the price of any given string of lights
		pricePerUnit = length  + quantity *2;
		//System.out.println(pricePerUnit);
		
	}
	
	public int getprice() {
		return pricePerUnit;
	}
	//to string meathod - allows you to view in the information  - "print the object"
	public String toString() {
		return "You are ordering " + quantity + " "+ length +" foot strings of "+ color +
				" lights. This will cost $" + pricePerUnit;
	}
}
