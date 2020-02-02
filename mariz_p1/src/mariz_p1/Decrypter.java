package mariz_p1;

public class Decrypter {

	public static void main(int decryptnum) {
		//create array to store digits in user number
		int[] decryptarray = new int[4];
		//use for loop to assign each digit to spot in array
		for(int i = 3; i>=0; i--)
		{
			decryptarray[i] = decryptnum%10;
			decryptnum = decryptnum/10;
		}
		//swap function for 1st and 3rd digit
		int tempp1 = decryptarray[0];
		decryptarray[0] = decryptarray[2];
		decryptarray[2] = tempp1;
		//swap function for 2nd and 4th digit
		int tempp2 = decryptarray[1];
		decryptarray[1] = decryptarray[3];
		decryptarray[3] = tempp2;
		//for loop to assign the subtraction of 7 from each digit
		for(int k = 0; k<4; k++)
		{
			//if statement that adds 10 if the digit is below 7
			if(decryptarray[k]<7)
			{
				decryptarray[k] = decryptarray[k]+10;
			}
			decryptarray[k] = decryptarray[k]-7;
		}
		//print out each digit to get decrypted number
		for(int j = 0; j<4; j++)
		{
			System.out.printf("%d", decryptarray[j]);
		}
	}

}
