//Fibonacci series
/*import java.util.Scanner;
public class question {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci");
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		int i=0;
		while(num>0){
		int c=a+b;
		System.out.println(a);
		a=b;
		b=c;
		num--;
	}
}
}
*/
//prime no
/*import java.util.Scanner;
public class question {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no");
			int num=sc.nextInt();
			int count=0;
			int i=1;
			while(i<=num) {
				if(num%i==0) {
					count++;
				}i++;
			}
			if(count==2) {
				System.out.println("prime");
			}else {
				System.out.println("Not Prime");
			}
			
	}
}*/



//Reverse no
/*import java.util.Scanner;
public class question {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no");
			int num=sc.nextInt();
			
			int rev=0;
			
			while(num>0) {
				int last=num%10;
				rev= rev*10+last;
				num=num/10;
				
			
			}System.out.println(rev);
	}
}
*/



//Even odd
//import java.util.Scanner;

/*public class question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
		    System.out.println("Enter the value");
		    int num=sc.nextInt();
		    if(num%2==0) {
		    	System.out.println("Even");
		    }else {
		    	System.out.println("odd");
		    }
		}
	}
}*/


//Armstrong NO
import java.util.Scanner;

public class question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int num=sc.nextInt();
		int temp=num;
		int arm=0;
		while(num>0) {
			int digit=num%10;
			arm=arm+digit*digit*digit;
			num=num/10;
		}
	
		if(temp==arm) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	sc.close();
	}
}



















