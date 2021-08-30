package Classesandobject;

class AreaofShape
{
	void area(float s)
	{
		System.out.println("Area of Square"+s*s);
	}
	void area(float s,float s2)
	{
		System.out.println("Area of Rectangle"+s*s2);
	}
}
public class Area {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AreaofShape as=new AreaofShape();
as.area(5);
as.area(5,3);

	}

}
