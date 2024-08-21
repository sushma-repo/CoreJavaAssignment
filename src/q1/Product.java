package q1;

public class Product {
	
	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double price() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	
	
	public void display() {
		
		System.out.println("Id:"+id+"  Name:"+ name +"  Price:"+price);
	}
	
	public static void main(String[] args) {
		
		Product p=new Product();
		
		p.setId(1);
		p.setName("Bottle");
		p.setPrice(200.0);
		
		p.display();
		

		
		
	}
	

}
