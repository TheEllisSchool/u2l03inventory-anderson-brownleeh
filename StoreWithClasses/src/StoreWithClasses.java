
public class StoreWithClasses {

	public static void main(String[] args) {
		backgroundInfoForStore order  = new backgroundInfoForStore();
		
		int total;
		order.setColor("blue");
		order.setLength(10);
		order.setnumber(3);
		order.priceCal();
		total =+ order.getprice();
		
		System.out.println(order);
		
		
		System.out.println("Your total price is: " + total);
		

	}

}
