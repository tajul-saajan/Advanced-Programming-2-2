
public class Sphere extends Shape3D implements calculate{
	double radius;
	
	public Sphere(double x) {
		// TODO Auto-generated constructor stub
		radius=x;
	}
	
	@Override
	public void area() {
		double a=4*3.1416*radius*radius;
		System.out.println("Sphere radius : "+radius);
		System.out.println("Sphere area : "+a);
	}
	
	
}
