import java.util.Scanner;

public class GoldenCircle {

public static void main(String[] args)

{

	Scanner input = new Scanner(System.in);
	double Pie = 3.14;

	System.out.println("Type in radius");
	double Radius = input.nextDouble();

	System.out.println("Type in length");
	double Length = input.nextDouble();

	double Area = (Radius * Radius * 3.14);

	double Volume = (Area * Length);

	System.out.println("Area and Volume are "+ Area + " and " + Volume + " respectively");

}

}
	