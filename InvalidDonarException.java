package Exception;

import java.util.Scanner;

public class InvalidDonarException {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Age :");
		int age = s.nextInt();
		System.out.println("Enter the Weight : ");
		float weight = s.nextFloat();
		
		if(age>=20 && age<=60 || weight>=40 && weight<=70) {
			System.out.println("Valid Donar");
			
		}else {
			System.out.println("Invalid Donar");
		}
	}
}
