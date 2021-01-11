
public class ConditionalAndLoops {

	public static void main(String[] args) {
		boolean isFalse=false;
		if(isFalse==false) {
			System.out.println("You are right!");
		}
		
		double num=20.0;
        double num1=80.00;
        double num2=(num+num1)*100.00; 
        double num3=num2 % 40.00;
        boolean bool=(num3==0)? true:false;
        System.out.println(bool);
        if(bool==false) {
        	System.out.println("Got some remainder");
        }
	}

}
