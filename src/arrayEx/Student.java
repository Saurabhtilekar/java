package arrayEx;

public class Student {
	private int id;
	private String name,hobbies;
	
	Student()
	{
		
	}
	 void setdata(int a,String b,String c)
	 {
		 id=a;
		 name=b;
		 hobbies=c;
	 }
	 void getdata()
	 {
		 System.out.println("Student id"+id+"\nStudent name"+name+"\nStudent hobbies"+hobbies);
	 }

	public static void main(String[] args) {
		Student s=new Student();
		Student s2=new Student();
		s.setdata(001,"Rahul","Playing");
		s.getdata();
		s2.setdata(002,"Akshay","Reading books");
		s2.getdata();
	}

}
