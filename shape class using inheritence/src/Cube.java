
public class Cube extends Shape3D implements calculate{
	int a;
	public Cube(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}
	
	@Override
	public void area() {
		double k=a*a*a;
		System.out.println("Cube length : "+a);
		System.out.println("Cube area : "+k);
	}
}
