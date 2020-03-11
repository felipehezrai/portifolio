package entities;

public class Radius {
	public double r;
	public double P = 3.14159;
	
	
	public double Circunference() {
		return 2*P*r;
	}
	
	public double Volume() {
		return  4.0 * P * (r * r * r)/3.0;
	}

}





	
