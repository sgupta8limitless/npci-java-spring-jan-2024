
public class User {

		private String name;
		private int birthyear;
		private String city;
		
		
//		public User(String name,int birthyear,String city)
//		{
//			this.name = name;
//			this.birthyear = birthyear;
//			this.city = city;
//		}
//		
		
		public void setDetails(String name,int birthyear,String city)
		{
			this.name = name;
			this.birthyear = birthyear;
			this.city = city;
		}
		
//		public void setName(String name)
//		{	
//			this.name = name;
//		}
//		
		
//		public String getName()
//		{
//			return name;
//		}
		
	
		public void printDetails()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+(2024 - birthyear));
			System.out.println("City: "+city);
			
		}
		
//		public void calculateAge(int year)
//		{
//			int age = year-birthyear;
//			
//			System.out.println("The age is "+age);
//			
//			
//			
//		}
//		
//		public void calculateAge(int year,String message)
//		{
//			int age = year-birthyear;
//			System.out.println(message+" "+age);
//		}
		
		
		public void printHobby()
		{
			System.out.println("Sports,Singing");
		}
	
}
