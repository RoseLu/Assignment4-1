
public class Driver {
	private String name;
	private Car car;
	public Driver(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public boolean drive() {
		GasTank gt = car.getGasTank();
		if(gt.getGasLevel() <= 0) return false;
		gt.useGas(1);
		return true;
	}
	
	public void addGas(double amount) {
		GasTank gt = car.getGasTank();
		gt.addGas(amount);
	}
	
	public Car getCar() {
		return car;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String args[]) {
		Driver whp = new Driver("whp", new Car("abc", 123));
		whp.addGas(10);
		Car abc = whp.getCar();
		System.out.println(whp.getName() + " has a car with " + abc.getGasTank().getGasLevel() + " gas");
		while(whp.drive()) {
			System.out.println("driving");
		}
		System.out.println("out of gas");
	}
}
