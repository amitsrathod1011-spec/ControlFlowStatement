import java.util.Scanner;
public class pract {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int balance = 5000;
		int choice;
		
		while(true) {
			System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
			choice =sc.nextInt();
			
		switch(choice){
			case 1:
				System.out.println(balance);
			break;
			
			case 2:
				int deposit =sc.nextInt();
				balance+=deposit;
				System.out.println("Deposit Money"+balance);
			break;
			
			case 3:
				int withdraw=sc.nextInt();
				if (withdraw<=balance) {
					System.out.println(balance-=withdraw);
				}else {
					System.out.println("Insufficient");	
					}
			break;
			
			case 4:
				System.out.println("Exit");
			break;
			default:
				System.out.println("Invalid Choice! Please try again.");
				sc.close();
		}
		}
		}
	}

