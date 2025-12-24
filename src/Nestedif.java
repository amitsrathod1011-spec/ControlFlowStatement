//Write a program to check if a person is eligible to vote,
//and if eligible, check if they can contest in elections (age ad¥ 25).
/*public class Nestedif {
	 public static void main(String[] args) {
		int age = 24;
		if (age >=18) {
			System.out.println("eligible to vote");
			if (age >= 25 ) {
				System.out.println("contest in election");
			}else {
				System.out.println("is not contest in election");
			}
		}
	else {
			System.out.println("not eligible to vote");
		}
	}
}
*/


//to check whether a number is even, and if even, check whether ita€™s greater than 50.

public class Nestedif {
	 public static void main(String[] args) {
		int num = 74;
		if (num%2 == 0) {
			System.out.println("Even");
			if (num >=50) {
				System.out.println("greater than 50");
			}else {
				System.out.println("is not greater than 50");
			}
		}
	else {
			System.out.println("odd");
		}
	}
}