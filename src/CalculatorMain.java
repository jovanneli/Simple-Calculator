/**
 * 
 * @author Jovanne Li
 * Simple Calculator
 */
public class CalculatorMain 
{

	public static void main(String[] args) 
	{
		//This is how we create an object
		//new --> java keyword which creates an object
		
		Calculator awesome = new Calculator();
		System.out.println(awesome.add(2,6));
		System.out.println(awesome.subt(7,3));
		System.out.println("The difference between 7 and 3 is "
		+awesome.subt(7,3));

	}

}
