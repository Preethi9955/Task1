package Task1;

public class Employee 
{
		String firstname;  
		String lastname;  
	
		Employee(String firstname, String lastname)
		{  
			this.firstname=firstname;  
			this.lastname=lastname;  
		}  
		 	public String toString()
		{//overriding the toString() method  
			return firstname+" "+lastname;  
		}
		 	public static void main(String args[])
		 	{  
		 		Employee s1=new Employee("Darshan","Raval");  
		 		Employee s2=new Employee("Sudheep","chandra"); 
		 		Employee s3=new Employee("Sudheep","chandra");  
		 		System.out.println(s1);//compiler writes here s1.toString()  
		 		System.out.println(s2);//compiler writes here s2.toString() 
		 		System.out.println(s3);
		 	}
}
