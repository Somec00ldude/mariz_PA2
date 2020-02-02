package mariz_p2;
import java.util.Scanner;
import java.lang.*;
public class BMICalculator {
	int unitval = 0;
	int bmicat;
	private float height;
	private float weight;
	private float Bmi;
	Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
		

	}
	public void readUserData() {
		int unitval = readUnitType();
		//plug input into next method
		readMeasurementData(unitval);
	}
	private int readUnitType() {
		//set loop that runs until user enters either 1 or 2
		while(unitval < 1 || unitval > 2)
		{
			System.out.println("Press 1 for Metric, or press 2 for Imperial.");
			unitval = userinput.nextInt();
		}
		//return user input
		return unitval;
	}
	private void readMeasurementData(int unitvalue) {
		//set loop to read data into metric method
		if(unitvalue == 1)
		{
			readMetricData();
		}
		//set loop to read data into imperial method
		else if(unitvalue == 2)
		{
			readImperialData();
		}
	}
	private void readMetricData() {
		System.out.println("You chose metric.");
		System.out.println("What is your height in meters?");
		//get user input for height
		float userheight = userinput.nextFloat();
		//exit if user input is negative
		if(userheight<0)
		{
			System.out.println("Exiting...");
			System.exit(0);
		}
		//set height universally
		setHeight(userheight);
		System.out.println("What is your weight in kilograms?");
		//get user input for weight
		float userweight = userinput.nextFloat();
		//exit if user input is negative
		if(userweight<0)
		{
			System.out.println("Exiting...");
			System.exit(0);
		}
		//set weight universally
		setWeight(userweight);

	}
	private void readImperialData() {
		System.out.println("You chose imperial.");
		System.out.println("What is your height in inches?");
		float userheight = userinput.nextFloat();
		if(userheight<0)
		{
			System.out.println("Exiting...");
			System.exit(0);
		}
		setHeight(userheight);
		System.out.println("What is your weight in pounds?");
		float userweight = userinput.nextFloat();
		if(userweight<0)
		{
			System.out.println("Exiting...");
			System.exit(0);
		}
		setWeight(userweight);

	}
	public void calculateBmi() {
		//set local variables for bmi calculation
		float calcweight = getWeight();
		float calcheight = getHeight();
		//set one calculation for metric units
		if(unitval == 1)
		{
			Bmi = calcweight/(calcheight*calcheight);
		}
		//set one calculation for imperial units
		else if(unitval == 2)
		{
			Bmi =(703*calcweight)/(calcheight*calcheight);
		}
		//load bmi into category method to categorize the interval in which it falls under
		calculateBmiCategory(Bmi);
	}
	private void calculateBmiCategory(float Bmival) {
		//if statements that categorize the bmi
		if(Bmival<18.5)
		{
			bmicat = 1;
		}
		else if(Bmival>=18.5 && Bmival<=24.9)
		{
			bmicat = 2;
		}
		else if(Bmival>=25 && Bmival<=29.9)
		{
			bmicat = 3;
		}
		else if(Bmival>=30)
		{
			bmicat = 4;
		}
	}
	public void displayBmi() {
		//set local variable of bmi to display
		float displayb = getBmi();
		//round to 2nd decimal
		System.out.printf("Your BMI is %.2f", displayb);
		System.out.println();
		//return category of bmi
		getBmiCategory();
		
	}
	public float getWeight() {
		return weight;
	}
	private void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
	}
	public float getBmi() {
		return Bmi;
	}
	public void getBmiCategory( ) {
		System.out.println("The BMI Categories are:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = 30+");
		//set if statements that return specific response based on category value
		if(bmicat == 1)
		{
			System.out.println("Your category is underweight.");
		}
		else if(bmicat == 2)
		{
			System.out.println("Your category is normal weight.");
		}
		else if(bmicat == 3)
		{
			System.out.println("Your category is overweight.");
		}
		else if(bmicat == 4)
		{
			System.out.println("Your category is obesity.");
		}
	}

}
