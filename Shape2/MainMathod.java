
public class MainMathod {

public static void main(String[] args) {
Circle circ = new Circle(2.00);
   System.out.println("����� ���� �������: "+ circ.getArea());
   System.out.println("������� ���� �������: "+ circ.getLength());
   
Triangle triangle = new Triangle(5.00,7.00,3.00,5.00);
   System.out.println("����� ���������� �������: "+ triangle.getArea());
   System.out.println("�������� ���������� �������: "+ triangle.getPerimeter());
   
Quadrangle quadrangle = new Quadrangle(2.00,1.00,4.00,3.00,30.00,50.00);
   System.out.println("����� ������������� �������: "+ quadrangle.getArea());
   System.out.println("�������� ������������ �������: "+ quadrangle.getPerimeter());
   
Rectangle rectangle = new Rectangle(1.00,6.00);
   System.out.println("����� ������������ �������: "+ rectangle.getArea());
   System.out.println("�������� ������������ �������: "+ rectangle.getPerimeter());
   
Square square = new Square(5.00);
   System.out.println("����� �������� �������: "+ square.getArea());
   System.out.println("�������� �������� �������: "+ square.getPerimeter());
   
Romb romb = new Romb(5.00,80.00,10.00);
   System.out.println("����� ����� �������: "+ romb.getArea());
   System.out.println("�������� ����� �������: "+ romb.getPerimeter());
   
Paralelogram paralelogram = new Paralelogram(5.00,10.00,80.00,10.00);
   System.out.println("����� ������������� �������: "+ paralelogram.getArea());
   System.out.println("�������� ������������� �������: "+ paralelogram.getPerimeter());








	}

}
