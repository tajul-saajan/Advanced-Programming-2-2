
public class Main {

	public static void variadicFun(int... n) {
		int sum = 0;
		for (int x : n) {
			sum += x;
		}
		System.out.println("Sum is " + sum);

	}

	public static final double PI = 3.1416;

	public static void main(String[] agrs) {
		//System.out.println("Hello");
		
		Cube cube=new Cube(5);
		calculateArea(cube);
		
		RightTriangle rr=new RightTriangle(5, 10);
		calculateArea(rr);
		
		Sphere ss = new Sphere(3.66);
		calculateArea(ss);
		
		Rectangle r = new Rectangle(4,5);
		calculateArea(r);
		
		Shape nn=new Shape();
		calculateArea(nn);
		
		variadicFun(1,2,33);
		variadicFun(1,2);
		
	}

	public static <T extends Shape> void calculateArea(T x) {
		if (x instanceof Sphere) {
			((Sphere) x).area();
		} else if (x instanceof Cube) {
			((Cube) x).area();
		} else if (x instanceof Rectangle) {
			((Rectangle) x).area();
		} else if (x instanceof Square) {
			((Square) x).area();
		} else if (x instanceof RightTriangle) {
			((RightTriangle) x).area();
		} else {

			System.out.println("Incompatible Type");
		}
	}

}
