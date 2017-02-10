
public class Customer {
	private String name;
	private double deposit;
	
	public Customer(String name, double deposit) {
		this.name = name;
		this.deposit = deposit;
	}
	
	public boolean buyABook(Book book) {
		double price = book.getPrice();
		if(!hasEnoughMoney(price)) return false;
		deposit -= price;
		return true;
	}
	
	public boolean hasEnoughMoney(double price) {
		return (deposit - price >= 0);
	}
	
	public String getName() {
		return name;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public static void main(String[] args) {
		Customer whp = new Customer("whp", 10.5);
		Book taocp = new Book(10, "taocp");

		if(whp.buyABook(taocp)) {
			System.out.println(whp.getName() + " spent " + taocp.getPrice() + " for " + taocp.getTitle());
		} else {
			System.out.println("not enough money");
		}
		
		Book csapp = new Book(9, "csapp");
		if(whp.buyABook(csapp)) {
			System.out.println(whp.getName() + " spent " + csapp.getPrice() + " for " + csapp.getTitle());
		} else {
			System.out.println("not enough money for " + csapp.getTitle());
		}
		
		
		whp.setDeposit(20);
		System.out.println("Add 20.0 to " + whp.getName() + "'s account");
		double depositBefore = whp.getDeposit();
		
		for(int i = 0; i < 10; i++) {
			Book gd = new Book(2, "gd");
			if(!whp.buyABook(gd)) break;
		}
		System.out.println(whp.getName() + " spent " + (depositBefore - whp.getDeposit()) + " for some books" );
	}
}
