package JavaClasses;

public class ComplexNumber {
	  private double real;
	  private double imaginary;
  
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
    public void add(double real,double imaginary) {
    	this.real=this.real+real;
    	this.imaginary=this.imaginary+imaginary;
    }
    
    public void add(ComplexNumber a) {
    	this.real=this.real+a.getReal();
    	this.imaginary=this.real+a.getImaginary();

    }
    
    public void subtract(double real,double imaginary) {
    	this.real=this.real-real;
    	this.imaginary=this.imaginary-imaginary;
    }
    
    public void subtract(ComplexNumber other) {
    	this.real=this.real-other.getReal();
    	this.imaginary=this.imaginary-other.getImaginary();
    }
  
}
