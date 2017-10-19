
public class Square extends Quadrilateral{
	int a;
	public Square(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}
	
	@Override
	public void area() {
		//double a=4*3.1416*radius*radius;
		System.out.println("Square length : "+a);
		System.out.println("Square area : "+a*a);
	}
}
