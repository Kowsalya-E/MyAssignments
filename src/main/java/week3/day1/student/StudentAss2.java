package week3.day1.student;

import week3.day1.department.DepartmentAss2;

public class StudentAss2 extends DepartmentAss2{

	 public void studentName()
	 {
		 System.out.println("Student name is Kowsalya");
	 }
	 public void studentDept()
	 {
		 System.out.println("Student department is ECE");
	 }
	 public void studentId()
	 {
		 System.out.println("Student ID is 12345");
	 }
	 public static void main(String args[]) 
	 {
		 StudentAss2 st=new StudentAss2();
		 st.studentName();
		 st.studentDept();
		 st.studentId();
		 st.deptName();
		 st.collegeName();
		 st.collegeCode();				
		 st.collegeRank();
		
	 }
}

