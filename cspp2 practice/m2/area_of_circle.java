import java.util.*;
class area_of_circle {
	static double pi() {
		double pie =3.14;
		return pie;
	}
	static double area( double radius) {
		double pie=pi();
		double area = pie* radius*radius;
		return area;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double area = area(radius);
		System.out.println("Area of circle: "+area);
		
	}
}