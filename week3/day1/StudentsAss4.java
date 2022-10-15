package week3.day1;

public class StudentsAss4 {
	public void getStudentInfo(int id)
	{
		System.out.println("Student id is " +id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student is and name is " +id+" " +name);
	}
	public void getStudentInfo(String email,String phno)
	{
		System.out.println("Student email and phone number is " +email+" " +phno);
	}
	public static void main(String args[])
	{
		StudentsAss4 stu=new StudentsAss4();
		stu.getStudentInfo(23);
		stu.getStudentInfo(23, "Kowsalya");
		stu.getStudentInfo("kowsalya@gmail.com","7200648758");
		
	}
	
}
