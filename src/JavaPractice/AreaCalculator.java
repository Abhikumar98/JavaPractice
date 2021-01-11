package JavaPractice;

public class AreaCalculator {

	public static void main(String[] args) {
		double res=area(5);
		double resOne=area(2,3);
		System.out.println(res);
		System.out.println(resOne);

	}
	
	public static double area(double radius) {
		if(radius<0) {
			return -1.0;
		}
		return radius*radius*Math.PI;
	}
	
	public static double area(double x,double y) {
		if((x<0 && y<0)|| x<0 || y<0) {
			return -1.0;
		}
		return x*y;
	}
	

}
