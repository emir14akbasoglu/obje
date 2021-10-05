package obje;

public class Product {
	private String name;
	private double price;
    private double discoundRate;
    
    public  double getLastPrice() {
    return   this.price*(100-this.discoundRate)/100;
    }
    
    public void setdiscoundRate(double discoundRate) {
   this.discoundRate=discoundRate;
    }
    public double getDiscounRate()  {
       return this.discoundRate;
    }
	// discundRate
	public void setName(String name) {
		this.name = name;
	}
    
	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
}
