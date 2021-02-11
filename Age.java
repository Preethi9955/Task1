package Task1;

public class Age {

	public static void main(String[] args)
	{
		int[] age = {34,78,56,7,12,67,20,50};
		int sc=0,a=0,c=0;
		System.out.println("ages in array");
		for(int i = 0; i < age.length; i++) 
		{
			System.out.println(age[i]);
		}
			for(int i = 0; i < age.length; i++) {
			if (age[i]>=55)
			{
				//System.out.println("Senior Citizen");
				sc++;
			}
					else if(age[i]>=18 & age[i]<55)
					{
						//System.out.println("Adult");
						a++;
					}
					else 
					{
						///System.out.println("child");
						c++;
					}
			}
				System.out.println("Children "+ c);
				System.out.println("Adult "+ a);
				System.out.println("Senior Citizen" + sc);
		}
		//TODO Auto-generated method stub
	}


