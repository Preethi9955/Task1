package Task1;

class AnimalD
{
	void shout() 
	{
	}
}
class Dog extends AnimalD
{
@Override
	void shout() 
	{
	System.out.println("Dog - Bark");
	}
}
class Horse extends AnimalD
{
@Override
	void shout() 
	{
	System.out.println("Horse - Neigh");
	}
}
class Cat extends AnimalD
{
@Override
	void shout() 
	{
	System.out.println("Cat - Meow");
	}
}

public class Animals 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Horse horse=new Horse();
		Cat cat=new Cat();
		dog.shout();
		horse.shout();
		cat.shout();
	}

}
