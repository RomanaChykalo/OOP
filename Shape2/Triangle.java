
public class Triangle extends Shape {
	private double side1, side2, side3, height;
Triangle(double side1, double side2, double side3, double height){
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
	this.height = height;
	}
	public double getArea() {
		return 0.5*side1*height;
	}
	public double getPerimeter(){
		return side1+side2+side3;
		}
}
