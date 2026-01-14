
//  1. Write a Java program that takes an integer (1â€“7) and prints 
//  the corresponding day name (e.g., 1 â†’ Monday
 
/*public class Switchcase {
	public static void main(String[] args) {
		int num=8;
    switch (num){
		case 1:
			System.out.println("Monday");
		break;	
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
		break;
		case 4:
			System.out.println("Thursday");
		break;
		case 5:
			System.out.println("Friday");
		break;
		case 6:
			System.out.println("Saturday");
		break;
		case 7:
			System.out.println("Sunday");
		break;
		default:
			System.out.println("Invalid");
	}
		}
}*/


// 2.Accept two numbers and an operator (+, -, *, /) from the user 
// and perform the operation using a switch case.

/*public class Switchcase {
	public static void main(String[] args) {
		
		char  operator ='/';
		int a= 10;
		int b= 2;
    switch (operator){
		case '+':
			System.out.println(a+b);
		break;	
		case '-':
			System.out.println(a-b);
		break;
		case '*':
			System.out.println(a*b);
		break;
		case '/':
			System.out.println(a/b);
		break;
		
		default:
			System.out.println("Invalid");
	}
		}
}
*/


//3.Use a switch statement to check if a number is even or odd 
//(hint: use number % 2 as the expression)/

/* class Switchcase {
	public static void main(String[] args) {
		int num= 11;
		switch(num %2) {
		case 0:
			System.out.println("even");
		break;
		case 1:
			System.out.println("odd");
		break;
		default:
			System.out.println("Invalid");
		}
	}
}
*/


//4.Take month number (1â€“12) and print the corresponding season:
//
//Decâ€“Feb â†’ Winter
//Marâ€“May â†’ Summer
//Junâ€“Aug â†’ Monsoon
//Sepâ€“Nov â†’ Autumn

/*
public class Switchcase{
	public static void main(String[] args) {
		int month = 6;
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
			break;
			case 3:
			case 4:
			case 5:
				System.out.println("Summer");
			break;
			case 6:
			case 7:
			case 8:
				System.out.println("Monsoon");
			break;
			case 9:
			case 10:
			case 11:
				System.out.println("Autumn");
			break;
			default:
				System.out.println("Invalid");
		}
	}
}
*/


//5.Accept a category type (Domestic, Commercial, Industrial) 
//and print the electricity rate per unit using a switch case.

/*import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {

        String category;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter category (Domestic/Commercial/Industrial): ");
        category = sc.next();   // User input

        switch (category) {
            case "Commercial":
                System.out.println("8rs per unit");
                break;

            case "Domestic":
                System.out.println("5rs per unit");
                break;

            case "Industrial":
                System.out.println("12rs per unit");
                break;

            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}
*/


//Accept a day number (1-7) and print the day name (Monday to Sunday) using switch case.
//Accept a grade (A, B, C, D, F) and print the remark using switch case.
//Accept a month number (1-12) and print how many days the month has.
//Accept a character and check whether it is a vowel or consonant using switch case.
//Create a simple calculator using switch case (addition, subtraction, multiplication, division).
//Accept a number between 1-4 and print the corresponding season:
//1 + Summer
//2 Rainy
//3 + Winter
//4 + Spring
//Accept a vehicle type (Car, Bike, Bus, Truck) and print the toll tax amount using switch case.
//Accept a color code (R, G, B, Y) and print the color name.
//Accept a number 1-5 land print the star
//Accept user choice (1-3):
//1 Print "Start"
//2 + Print "Stop"
//3 + Print "Restart" 
//Use switch case.


//Accept a grade (A, B, C, D, F) and print the remark using switch case.
/*import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("grade (A, B, C, D, F)");
		
//		char grade='A';
		char grade=sc.next().charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("more better");
		break;
		case 'B':
			System.out.println("better");
		break;
		case 'C':
			System.out.println("best");
		break;
		case 'D':
			System.out.println("good");
		break;
		case 'F':
			System.out.println("fail");
		break;
		default:
			System.out.println("Invalid Input");
		} 
		sc.close();
	}
	}*/


//Accept a character and check whether it is a vowel or consonant using switch case.
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {

         char ch;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter category (Domestic/Commercial/Industrial): ");
        ch = sc.next().charAt(0);   

        switch (ch) {
            case 'A': case 'E': case 'O': case 'U': case 'I':
                System.out.println("Vowel");
                break;


            default:
                System.out.println("consonant");
        }
        sc.close();
    }
}
























