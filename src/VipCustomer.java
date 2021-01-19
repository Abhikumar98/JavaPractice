package JavaClasses;

public class VipCustomer {
  private String name;
  private int creditLimit;
  private String email;
  
  public VipCustomer(String name, int creditLimit, String email) {
	super();
	this.name = name;
	this.creditLimit = creditLimit;
	this.email = email;
  }
  
  public VipCustomer() {
	  this("Shravanthi",25000,"hebbar@gmail.com");
  }
  
  public VipCustomer(int creditLimit,String email) {
	  this("Hema",creditLimit,email);
  }
   
  public String getName() {
		return name;
	}
	
  public int getCreditLimit() {
		return creditLimit;
	}
	
   public String getEmail() {
		return email;
	} 
}
