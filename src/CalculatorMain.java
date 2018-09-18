/**
 * 
 * @author Jovanne Li
 * Simple Calculator
 */
public class CalculatorMain 
{

	public static void main(String[] args) 
	{
		//new: java keyword which creates an object
		//Calculator is the data type
		//awesome is the variable name
		//Calculator is the object
		
		Calculator awesome = new Calculator();
		System.out.println(awesome.add(2,6));
		System.out.println(awesome.subt(7,3));
		System.out.println("The difference between 7 and 3 is "
		+awesome.subt(7,3));

	}

}
