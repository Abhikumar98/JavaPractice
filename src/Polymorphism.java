package JavaClasses;

class Car{
	private boolean engine=true;
	private int cylinders;
	private String name;
	private int wheels=1;
	
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
	}
	
	public String startEngine() {
		return "Car is starting";
	}
	
	public String accelerate() {
		return "Car is accelerating";
	}
	
	public String brake() {
		return "Car is braking";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}

class Mitsubishi extends Car{
	
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Mitsubishi is starting";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Mitsubishi is accelerating";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Mitsubishi is braking";
	}
	
}

class Ford extends Car{
	
	public Ford(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Ford is starting";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford is accelerating";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Ford is braking";
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		
		Car car=new Car(8,"Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		
		Mitsubishi mitsubishi=new Mitsubishi(6,"Outlander 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
	}

}
