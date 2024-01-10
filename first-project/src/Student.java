
public class Student extends User {
	
	
	private String course;
	private String college;
	
	

	public void setStudentDetails(
			String name,int birthyear,String city,String course,String college)
	{
		this.setDetails(name, birthyear, city);
		this.course = course;
		this.college = college;
	}
	
	
	public void printStudentDetails()
	{
		
		System.out.println("College: "+college);
		System.out.println("Course: "+course);
	}
	
	public void printHobby()
	{
		System.out.println("Sports,learning,singing");
	}
	
	
	
	
	
	
	
	
	
	

}
