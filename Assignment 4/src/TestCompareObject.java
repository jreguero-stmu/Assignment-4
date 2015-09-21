
public class TestCompareObject {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,10);
		
		Circle circle = new Circle(5);
		
		
		if(rectangle.equals(rectangle.getArea(), circle.getArea())){
			System.out.println("Area of rectangle is equal to area of circle");
		}
		else if(rectangle.isGreatest(rectangle.getArea(), circle.getArea())){
			System.out.println("Area of rectangle is greter than area of circle");
		}
		
		else if(rectangle.isLess(rectangle.getArea(), circle.getArea())){
			System.out.println("Area of rectangle is less than area of circle");
		}
	}

}
