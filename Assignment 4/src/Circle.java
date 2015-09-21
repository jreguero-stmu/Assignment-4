
public class Circle extends GeometricObject{
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public double getArea(){
		return radius * Math.PI * radius;
	}
	

}
