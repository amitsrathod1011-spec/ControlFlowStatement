import java.util.Scanner;
public class practices {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int balance=4000;
			int choice;
			
			while(true) {
				System.out.println("\n===== ATM MENU =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
				choice= sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("1. Check Balance"+balance);
				break;
				
				case 2:
				
				int Deposit= sc.nextInt();
					System.out.println("2. Deposit Money"+(balance+=Deposit));
					System.out.println(balance);
				break;
				
				case 3:
				 System.out.println("3. Withdraw Money");
				int withdraw=sc.nextInt();
				if(withdraw<=balance) {
					balance -= withdraw;
					System.out.println(balance);
				}else {
						System.out.println("Insufficient Balance");
					}
					sc.close();
					break;
					
				case 4:
				System.out.println("4. Exit");
				
				break;
				default:
					System.out.println("Invalid Choice! Please try again.");
				}
				}
			}
		}

