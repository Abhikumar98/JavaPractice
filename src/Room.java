package JavaClasses;

public class Room {

	public static void main(String[] args) {
		WallNew wall1=new WallNew("West");
		WallNew wall2=new WallNew("East");
		WallNew wall3=new WallNew("South");
		WallNew wall4=new WallNew("North");

		Ceiling ceiling = new Ceiling(12,55);
		
		Bed bed=new Bed("Modern",4,3,2,1);
		
		Lamp lamp=new Lamp("Classic",false,75);
		
		BedRoom bedroom= new BedRoom("Shrav",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();
		
	}

}
