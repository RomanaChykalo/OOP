
public class Circle extends Shape {
double radius;
Circle(double radius){
	this.radius = radius;
}
public double getArea(){
		return Math.PI*Math.pow(radius, 2);
		}
public double getLength(){
	return 2*Math.PI*radius;
}
}