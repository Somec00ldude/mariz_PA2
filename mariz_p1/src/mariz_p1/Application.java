package mariz_p1;
import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		//create scanner for user input
		Scanner numinput = new Scanner(System.in);
		//ask user for integer and assign to input variable
		System.out.println("To encrypt, press 1. To decrypt, press 2.");
		int edinput = numinput.nextInt();
		//if statement for encrypt option
		if(edinput == 1)
		{
			//read user number and run encrypter class
			System.out.println("Enter a four-digit integer to encrypt.");
			int encryptnum = numinput.nextInt();
			System.out.print("Your number is ");
			Encrypter.main(encryptnum);
			System.out.print(".");
		}
		//if statement for decrypter option
		else if(edinput == 2)
		{
			//read user number and run decrypter class
			System.out.println("Enter a four-digit integer to decrypt.");
			int decryptnum = numinput.nextInt();
			System.out.print("Your number is ");
			Decrypter.main(decryptnum);
			System.out.print(".");
		}
		//let user know integer output is incorrect
		else {
			System.out.print("That is not an option");
		}
	}

}
