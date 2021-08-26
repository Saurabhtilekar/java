interface Drawable{
	void draw();
}
 class Rectange implements Drawable {
	public void draw()
	{
		System.out.println("drawing rectange");
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing circle");
	}

}
class InterfaceEx
{
	
	public static void main(String[] args)
	{
		Drawable d=new Circle();
		d.draw();

		
	}
	}

