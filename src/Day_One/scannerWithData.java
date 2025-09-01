package Day_One;

import java.util.Scanner;

public class scannerWithData {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Name: ");
	String name = sc.nextLine();
	
	System.out.println("Enter Mobile number :");
	long no = sc.nextLong();
	
	System.out.println("Enter Addesss : ");
	String add = sc.nextLine();
	
	sc.nextLine();
	System.out.println("Enter Email : ");
	String mail = sc.nextLine();
	
	System.out.println("Data :  ");
	System.out.println("Name :" +name);
	System.out.println("Mobile No :" +no);
	System.out.println("Address :" +add);
	System.out.println("Email :" +mail);
	}	

}
