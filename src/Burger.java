package JavaClasses;

class Hamburger{
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat, int price, String breadRollType) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
		System.out.println("Basic hamburger on a "+this.name+" with "+this.breadRollType+", price is "+this.price);
	}
	
	public void addHamburgerAddition1(String name,double price) {
		System.out.println("added "+name+" for an extra "+price);
		this.addition1Name=name;
		this.addition1Price=price;
	}
	
	public void addHamburgerAddition2(String name,double price) {
		System.out.println("added "+name+" for an extra "+price);
		this.addition2Name=name;
		this.addition2Price=price;
	}
	
	public void addHamburgerAddition3(String name,double price) {
		System.out.println("added "+name+" for an extra "+price);
		this.addition3Name=name;
		this.addition3Price=price;
	}
	
	public void addHamburgerAddition4(String name,double price) {
		System.out.println("added "+name+" for an extra "+price);
		this.addition4Name=name;
		this.addition4Price=price;
	}
	
	public double itemizehamburger() {
		if(this.addition1Price!=0) {
			this.price+=this.addition1Price;
			return this.price;
		}
		else if(this.addition2Price!=0) {
			this.price+=this.addition2Price;
			return this.price;
		}
		else if(this.addition3Price!=0) {
			this.price+=this.addition3Price;
			return this.price;
		}
		else if(this.addition4Price!=0) {
			this.price+=this.addition4Price;
			return this.price;
		}
		else {
			return this.price;
		}
		
	}
}

class DeluxeBurger extends Hamburger{

	public DeluxeBurger(String name, String meat, int price, String breadRollType) {
		super(name, meat, price, breadRollType);
	}
	
}
public class Burger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
