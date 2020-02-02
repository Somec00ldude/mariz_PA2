package mariz_p1;
public class Encrypter {

	public static void main(int encryptnum) {
		//create array to store digits in user number
		int[] encryptarray = new int[4];
		//use for loop to assign each digit to spot in array
		for(int i = 3; i>=0; i--)
		{
			encryptarray[i] = encryptnum%10;
			encryptnum = encryptnum/10;
		}
		//for loop to assign the remainder after adding 7 to each digit
		for(int k = 0; k<4; k++)
		{
			encryptarray[k] = (encryptarray[k] + 7)%10;
		}
		//swap function for 1st and 3rd digit
		int temp1 = encryptarray[0];
		encryptarray[0] = encryptarray[2];
		encryptarray[2] = temp1;
		//swap function for 2nd and 4th digit
		int temp2 = encryptarray[1];
		encryptarray[1] = encryptarray[3];
		encryptarray[3] = temp2;
		//print out each digit to get encrypted number
		for(int j = 0; j<4; j++)
		{
			System.out.printf("%d", encryptarray[j]);
		}

	}

}
