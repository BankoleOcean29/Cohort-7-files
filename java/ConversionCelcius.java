import java.util.Scanner;

public class ConversionCelcius {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a Celcius degree");

	double celciusNumber = input.nextDouble();

	System.out.print ("Degree in Fahrenheit is "+ (9.0/5) * celciusNumber + 32);

}

}
