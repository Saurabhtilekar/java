package threadEx;

public class SimpleThread extends Thread {
	SimpleThread(String str)
	{
		super(str);
		
	}

	public void run()
	{
		for(int i=1;i<20;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print("");
			System.out.print(getName());
		}
		System.out.print(".");
	}
	public static void main(String[] args) {
		Thread t1=new SimpleThread("1");
		Thread t2=new SimpleThread("2");
		t1.setPriority(Thread.NORM_PRIORITY+1);
		t2.setPriority(NORM_PRIORITY-1);
		
		t1.start();
		t2.start();
	}

}
