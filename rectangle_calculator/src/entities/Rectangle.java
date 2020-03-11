package entities;

public class Rectangle {
		public double whigth;
		public double height;
		
		
		public double Area() {
			
			double area = whigth*height;
			return area;
		}
		
		public double Perimeter() {
			
			double perimeter = 2*(whigth+height);
			return perimeter;
		}
		
		public double Diagonal() {
			double diagonal = Math.sqrt((whigth*whigth + height*height));
			return diagonal;
		}
	
}
