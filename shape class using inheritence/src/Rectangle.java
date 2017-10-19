
public class Rectangle extends Quadrilateral implements calculate{
	int a,b;
	public Rectangle(int a,int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void area() {
		double k=a*b;
		System.out.println("Rectangle length : "+a+" width : "+b);
		System.out.println("Rectangle area : "+k);
	}
}
