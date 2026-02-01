package OOPs;


class Shape{
	
	public void calculatArea() {
		System.out.println("Area: ");
	}
	
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double calculatCircleArea() {
		return 3.14*radius*radius;
	}
	
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
		
	}
	
	public double calculatRectangleArea() {
		return length*width;
	}
	
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
		
	}
	
	public double calculatTriangleArea() {
		return 0.5*base*height;
	}
	
}

public class ShapeHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle=new Circle(5);
		circle.calculatArea();
		Circle c=(Circle)circle;
		System.out.println(c.calculatCircleArea());
		System.out.println();
		
		Shape rect=new Rectangle(4,6);
		rect.calculatArea();
		Rectangle r=(Rectangle)rect;
		System.out.println(r.calculatRectangleArea());
		System.out.println();
		
		
		Shape tri=new Triangle(3,7);
		tri.calculatArea();
		Triangle t=(Triangle)tri;
		System.out.println(t.calculatTriangleArea());
	}

}



