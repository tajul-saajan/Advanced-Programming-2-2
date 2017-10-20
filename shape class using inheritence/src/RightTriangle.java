
public class RightTriangle extends Triangle implements calculate{

	int x,y;
	public RightTriangle(int a,int b) {
		// TODO Auto-generated constructor stub
		x=a;y=b;
	}
	
	@Override
	public void area() {
		//double a=4*3.1416*radius*radius;
		System.out.println("Triangle height: "+x+" width : "+ y);
		System.out.println("Right Triangle area : "+.5*x*y);
	}
}
