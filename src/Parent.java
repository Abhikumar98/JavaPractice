package JavaClasses;

public class Parent {

	public static void main(String[] args) {
//		SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("add= "+calculator.getAdditionResult());
//        System.out.println("subtract= "+calculator.getSubtractionResult());
//        System.out.println("multiply= "+calculator.getMultiplicationResult());
//        System.out.println("divide= "+calculator.getDivisionResult());
//        
//        Person person=new Person();
//        person.setFirstName("John");
//        System.out.println(person.getFullName());
//        
//        BankAccount bank=new BankAccount();
//        bank.setBalance(10000);
//        bank.withdrawFunds(11000);
//        bank.depositFunds(12000);
//        
//        VipCustomer customer=new VipCustomer();
//        System.out.println(customer.getName());
//        
//        VipCustomer customer1=new VipCustomer(10000,"one@gmail.com");
//        System.out.println(customer1.getName());
//        
//        VipCustomer customer2=new VipCustomer("Ravi",12000,"Two@gmail.com");
//        System.out.println(customer2.getName());
//        
//        Wall wall=new Wall(5,4);
//        System.out.println("area: "+wall.getArea());
//        
//        wall.setHeight(-1.5);
//        System.out.println("width: "+wall.getWidth());
//        System.out.println("height: "+wall.getHeight());
//        System.out.println("area: "+wall.getArea());
//        
//        Wall wall2=new Wall(-1.25,-1.25);
//        System.out.println(wall.getHeight());
//        System.out.println(wall.getWidth());
//  
        Carpet carpet=new Carpet(3.5);
        Floor floor=new Floor(2.75,4.0);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());
        
        
        Printer printer=new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("Initail page count = "+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("Pages printer was "+pagesPrinted+ " new total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printer was"+pagesPrinted+ " new total print count for printer = "+printer.getPagesPrinted());
	}

}
