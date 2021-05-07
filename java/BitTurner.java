import java.util.Scanner;

public class BitTurner {

public static void main(String... args) {

	int number1 = 1;
	int number0 = 0;

Scanner input = new Scanner(System.in);

	System.out.println("Enter 0 or 1:");

	int userNumber = input.nextInt();

	if (userNumber == number1) {
		System.out.println(number0);

}

	if (userNumber == number0) {
		System.out.println(number1);
}

	if (userNumber > number1) {
		System.out.println("error, type in either 1 or 0");
}

	if (userNumber < number0) {
		System.out.println("error, type in either 1 or 0");


}


}

}