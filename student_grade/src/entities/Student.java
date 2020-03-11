package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;

	
	public double Media() {
		double media = n1+n2+n3;
		return media;	
	}

	public void Missing(double media) {
		media = 60 - Media();
	}
	
	public String toString() {
		return "FINAL GRADE = " +
				Media();
	}
	
}
