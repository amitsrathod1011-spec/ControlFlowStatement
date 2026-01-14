//1 Accept a number and check whether it is a multiple of 5 and 11 or not.
/*public class practicesifelse {
		public static void main(String[] args) {
			int num=1;
			
			if(num%5==0 && num%11==0) {
				System.out.println(num);
			}else {
				System.out.println("not");
			}
		}
}
*/


//2 Accept a person's salary and apply tax:
//Salary < 50,000 â†’ No Tax
//50,000 to 1,00,000 â†’ 10% Tax
//Above 1,00,000 â†’ 20% Tax

/*public class practicesifelse{
	public static void main(String[]args) {
		int Salary=100000;
		
		if(Salary<50000) {
			System.out.println("No tax");
		}else if(Salary<=100000){
			System.out.println("10% tax");
		}else {
			System.out.println("20% Tax");
		}
	}
}
*/


//3 Accept three sides of a triangle and check whether it is valid or not (sum of any two sides > third side).
/*import java.util.Scanner;
public class practicesifelse {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 sides:");
		int oneside =sc.nextInt();
		int twoside =sc.nextInt();
		int thirdside=sc.nextInt();
		
		if(oneside+twoside>thirdside && 
				oneside+thirdside>twoside &&
				twoside+thirdside>oneside) {
			System.out.println("valid");
		}else {
			System.out.println("not ");
		}
		sc.close();
	}
}*/



//4 Accept a character and check if it is uppercase, lowercase, digit, or special character.
/*public class practicesifelse{
	public static void main(String[]args) {
		char word='A';
		
		if(word>='A'&& word<='Z') {
			System.out.println("uppercase ");
		}else if(word>='a'&& word<='z'){
			System.out.println("lowercase");
		}else if(word>='0'&& word<='9') {
			System.out.println("digit");
		}else {
			System.out.println("special character");
		}
	}
}*/


//Accept a number and check if it is a perfect square or not.
/*import java.util.Scanner;
public class practicesifelse{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		while(true) {
		
		int num=sc.nextInt();
		int square=sc.nextInt();
		
		if(square*square==num) {
			System.out.println("perfect");
		}else {
			System.out.println("not");
		} 
		sc.close();	}
		
	}
}*/


