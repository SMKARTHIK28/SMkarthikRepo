package week1.day1;
import java.util.Scanner;
public class ConvertANegativeNumberToPositiveNumber {
	 public static void main(String[] args) {
	        int givenNumber;
	        int positiveNumber;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");

	        givenNumber = sc.nextInt();

	        if (givenNumber < 0) {
	            positiveNumber = givenNumber * (-1);
	            System.out.println("Positive number: " + positiveNumber);
	        }
	    }

}
