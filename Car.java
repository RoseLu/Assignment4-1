
public class Car {
	private String vehicleType;
	private int color;
	private GasTank gt;
	public Car(String vehicleType, int color) {
		this.vehicleType = vehicleType;
		this.color = color;
		gt = new GasTank();
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	
	public int getColor() {
		return color;
	}
	
	public GasTank getGasTank() {
		return gt;
	}
	
	public void setVehicleType(String vt) {
		vehicleType = vt;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
}
