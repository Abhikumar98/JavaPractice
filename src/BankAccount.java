package JavaClasses;

public class BankAccount {
   private String accountNumber;
   private double balance;
   private String customerName;
   private String email;
   private long phoneNumber;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	   
	 public void depositFunds(double amount) {
		   this.balance=this.balance+amount;
		   System.out.println("Deposit of "+amount+" made.Balance is "+this.balance);
	   }
	   
	 public void withdrawFunds(double amount) {
		   if(this.balance<amount) {
			   System.out.println("Insufficient balance");
		   }
		   else {
			   this.balance=this.balance-amount;
			   System.out.println("Withdrawal of "+amount+" being processed.Remaining balance "+this.balance);
		   }
		 
	   }
	   
   
  
  
}
