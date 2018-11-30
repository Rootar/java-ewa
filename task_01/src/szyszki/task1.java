package szyszki;
import java.util.*;
import java.lang.*; 

final class ComplexNumber
{
	double real;
	double imag;
}

class PanWyjatek extends Exception
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanWyjatek(String error) 
	{
        super(error);
    }
}
public class Task1 {
	


	public static void main(String[] args) throws PanWyjatek
{
		//
		
		int a, b, c;
		try 
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
		}
		catch (Exception p)
		{
			PanWyjatek mrException = new PanWyjatek("Something went wrong :(");
			throw mrException;
		}
		System.out.println("Our quadratic equation: " + a + "x^2, " + b + "x, " + c);
		
		System.out.println("Calculating the roots:");
		
		double delta;
		delta = b*b - 4*(a*c);
		System.out.println("Delta = " + delta);
		
		if (delta > 0)
		{
			double deltaSqrt = Math.sqrt(delta); 
			double x1, x2;
			x1 = ((-b) - deltaSqrt)/(2*a);
			x2 = ((-b) + deltaSqrt)/(2*a);
			System.out.println("There are two roots: x1=" + x1 + ", x2=" + x2);
		}
		
		else if (delta == 0)
		{
			double x0 = (-b)/(2*a);
			System.out.println("There is only one root: x0=" +x0);
		}
		else 
		{
			System.out.println("Hey you don't hurt me pls :C");
			double newDelta = Math.abs(delta);
			double deltaSqrt = Math.sqrt(newDelta); 
			
			ComplexNumber delt = new ComplexNumber();
			ComplexNumber x1 = new ComplexNumber();
			ComplexNumber x2 = new ComplexNumber();
			delt.imag = deltaSqrt;
			
			x1.real = (-b)/(2*a);
			x1.imag = (-delt.imag)/(2*a);
			
			x2.real = (-b)/(2*a);
			x2.imag = (delt.imag)/(2*a);
			System.out.println("You bastard. x1 = " + x1.real + " + " + x1.imag + "i, x2 =" + x2.real + " + " + x2.imag + "i");
			
		}
}
		
}

