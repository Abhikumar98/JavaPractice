package JavaClasses;

public class BedRoom {
   private String name;
   private WallNew wall1;
   private WallNew wall2;
   private WallNew wall3;
   private WallNew wall4;
   private Ceiling ceiling;
   private Bed bed;
   private Lamp lamp;
   
	public BedRoom(String name, WallNew wall1, WallNew wall2, WallNew wall3, WallNew wall4, Ceiling ceiling, Bed bed,
			Lamp lamp) {
		super();
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	   
   public Lamp getLamp() {
	   return lamp;
   }
   
   public void makeBed() {
	   System.out.println("Bed is being made");
	   bed.make();
   }

}
