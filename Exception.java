package Task1;
import java.util.*;
class Employee1 
{
	private String firstname;
	private String lastname;
	public Employee1(String firstname, String lastname) 
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
		void validation() 
		{
			if (firstname == null || lastname == null)
			{
				throw new NullPointerException("Entry Missing");
			}
			else if (firstname.length() < 3 || lastname.length() < 3)
			{
				throw new ArithmeticException("Name should contain minimum 3 character ");
			}
		}
}
public class Exception 
{
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1("Jayalaxmi", "Jangamani");
		e1.validation();
	}

}

