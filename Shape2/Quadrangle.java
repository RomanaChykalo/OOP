
public class Quadrangle extends Shape {
	
	public double side1;
	public double side2;
	public double side3;
	public double side4;
	public double alpha;
	public double beta;
	
	Quadrangle(double side1, double side2, double side3, double side4, double beta, double alpha){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.alpha = alpha;
		this.beta = beta;
	}
	double getPerimeter(){
		double perimeter = side1+side2+side3+side4;
		return perimeter;
	}
	public double getArea() {
		double halfPerimeter = this.getPerimeter() / 2;
		double halfAngle = (beta + alpha)/2;
		double area = Math.sqrt((halfPerimeter-this.side1)*(halfPerimeter-this.side2)*(halfPerimeter-this.side3)*(halfPerimeter-this.side4)-side1*side2*side3*side4*Math.pow(Math.cos(halfAngle), 2));
		return area;
	}
}
