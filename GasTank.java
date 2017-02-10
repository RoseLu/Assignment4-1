
public class GasTank {
	private double amount;
	
	public GasTank() {
		amount = 0;
	}
	
	public void addGas(double amount) {
		this.amount += amount;
	}
	
	public boolean useGas(double amount) {
		if(this.amount < amount) return false;
		this.amount -= amount;
		return true;
	}
	
	public double getGasLevel() {
		return amount;
	}
}
