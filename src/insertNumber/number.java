package insertNumber;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Въведи число:");
		int chislo = input.nextInt();

		switch (chislo) {
		case 1:
			System.out.println("едно");
			break;
		case 2:
			System.out.println("две");
			break;
		case 3:
			System.out.println("три");
			break;
		case 4:
			System.out.println("четри");
			break;
		case 5:
			System.out.println("пет");
			break;
		case 6:
			System.out.println("шест");
			break;
		case 7:
			System.out.println("седем");
			break;
		case 8:
			System.out.println("осем");
			break;
		case 9:
			System.out.println("девет");
			break;
		case 10:
			System.out.println("десет");
			break;
		default:
			System.out.println("няма");
			break;
		}
	}

}
