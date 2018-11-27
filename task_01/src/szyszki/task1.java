package szyszki;
import java.util.*;
import java.lang.*; 

public class task1 {

	public static void main (String[] args)
{
		//
		int a, b, c;
		try 
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
		}
		catch (Exception a)
		{
			System.out.println("Exception - something went wrong");
		}
		System.out.println("Our quadratic equation: " + a + "x^2, " + b + "x, " + c);
		
		System.out.println("Calculating the roots:");
		
		double delta;
		delta = b*b - 4*(a*c);
		System.out.println("Delta = " + delta);
		
		if (delta > 0)
		{
			double deltasqrt = Math.sqrt(delta); 
			double x1, x2;
			x1 = ((-b) - deltasqrt)/(2*a);
			x2 = ((-b) + deltasqrt)/(2*a);
			System.out.println("There are two roots: x1=" + x1 + ", x2=" + x2);
		}
		
		else if (delta == 0)
		{
			double x0 = (-b)/(2*a);
			System.out.println("There is only one root: x0=" +x0);
		}
		else System.out.println("There are no roots");
}
		
}
