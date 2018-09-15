
public class MainMathod {

public static void main(String[] args) {
Circle circ = new Circle(2.00);
   System.out.println("Площа кола дорівнює: "+ circ.getArea());
   System.out.println("Довжина кола дорівнює: "+ circ.getLength());
   
Triangle triangle = new Triangle(5.00,7.00,3.00,5.00);
   System.out.println("Площа трикутника дорівнює: "+ triangle.getArea());
   System.out.println("Периметр трикутника дорівнює: "+ triangle.getPerimeter());
   
Quadrangle quadrangle = new Quadrangle(2.00,1.00,4.00,3.00,30.00,50.00);
   System.out.println("Площа чотирикутника дорівнює: "+ quadrangle.getArea());
   System.out.println("Периметр чотирикутник дорівнює: "+ quadrangle.getPerimeter());
   
Rectangle rectangle = new Rectangle(1.00,6.00);
   System.out.println("Площа прямокутника дорівнює: "+ rectangle.getArea());
   System.out.println("Периметр прямокутника дорівнює: "+ rectangle.getPerimeter());
   
Square square = new Square(5.00);
   System.out.println("Площа квадрата дорівнює: "+ square.getArea());
   System.out.println("Периметр квадрата дорівнює: "+ square.getPerimeter());
   
Romb romb = new Romb(5.00,80.00,10.00);
   System.out.println("Площа ромба дорівнює: "+ romb.getArea());
   System.out.println("Периметр ромба дорівнює: "+ romb.getPerimeter());
   
Paralelogram paralelogram = new Paralelogram(5.00,10.00,80.00,10.00);
   System.out.println("Площа паралелограма дорівнює: "+ paralelogram.getArea());
   System.out.println("Периметр паралелограма дорівнює: "+ paralelogram.getPerimeter());








	}

}
