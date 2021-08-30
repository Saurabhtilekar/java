package arrayEx;

public class Employee 
	{
		int id,salary;
		String name;
		
		public void putdata(int id1,int salary1,String name1)
		{
			id=id1;
			salary=salary1;
			name=name1;
		}
		public void getdata()
		{
			System.out.println("Id =  "+id+ "\nSalary="+salary+"\nName="+name);
		}
	

	public static void main(String[] args) {
		Employee[] e=new Employee[2];
		e[0]=new Employee();
		e[1]=new Employee();
		e[0].putdata(001,10000,"Rahul");
		e[0].getdata();
		e[1].putdata(001,10000,"Akshay");
		e[1].getdata();
		
	}

}
