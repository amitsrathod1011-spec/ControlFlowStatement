
/*public class practiceswhile {
	public static void main(String[] args) {
		int a=1241;
		
		while(a>0){
			
			
		int	rev=a%10;
		a=a/10;
			System.out.print(rev);
			}
	}
}*/

//divided by 
/*public class practiceswhile {
	public static void main(String[] args) {
		int num=22;
		int i=1;
		while(i<num){
			if(num%i==0)
			{
			System.out.print(i +" " );
			}i++;
	}
}
}*/

//reverse number 
/*public class practiceswhile {
	public static void main(String[]args) {
		
		int num=1234;
		int rev=0;
		
		while(num>0) {
			
		int digit=num%10;  //reverse num
			rev=rev*10+digit;  //digit last
			num=num/10; //remove digit
		}
		System.out.println(rev);
	}
}*/

//pelindrome
/*public class practiceswhile {
	public static void main(String[]args) {
		
		int num=1221;
		int rev=0;
		int original =num;
		while(num>0) {
			
		int digit=num%10;  //reverse num
			rev=rev*10+digit;  //digit last
			num=num/10; //remove digit
		}
		System.out.println(rev);
		
		if(rev==original) {
			System.out.println("pelindrome");
		}else {
			System.out.println("Not a pelindrome");
		}
	}
}*/

/*palindrome
public class practiceswhile {
	public static void main(String[]args) {
		
		int num=3784;
		int rev =0;
		
		while(num>0) {
			
			int digit =num % 10; 
			rev=rev*10+digit;  
			num=num/10;
			
		}System.out.println(rev);
		if(num==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}
		}
	}
*/

//sum of digit 
/*public class practiceswhile {
	public static void main(String[] args) {
		
		int num=125864;
		int sum=0;
		int count=0;
		
		while(num>0){
			
			int digit =num%10; //last 
			sum=sum+digit;   // store
			num=num/10;      // remove
			count++;
			}
			System.out.println("Digit count:"+count+"  &  "+"Sum of digit:"+sum);
			
	}
}
*/

//Armstrong otr not
/*public class practiceswhile {
	public static void main(String[] args) {
		
		int num=153;
		int rev=0;
		int count=0;
		int temp=num;
		
		while(num>0){
			
			int digit =num%10;   //last digit
		int power=	digit*digit*digit; //
			rev=rev+power;  //store
			
			num=num/10;  // remove
			count++;
			}
			System.out.println("Digit count:"+count+"  &  "+"Sum of digit:");
			System.out.print(rev);
			
			if(rev==temp) {
				System.out.println("Armstrong");
			}else {
				System.out.println("Not a Armstrong");
			}
				
			
	}
}
*/

/*public class practiceswhile {
	public static void main(String[] args) {
		int num=22;
		int fact=1;
		
	while(num>0)	{ fact=fact*num;
			num++;}
			System.out.println(fact);
		
	}
}*/

//Write a Java program to print the digits from 0 to 9 using a loop.
/*public class practiceswhile {
	public static void main(String[] args) {
		for(int num=0;num<=9;num++) {
			System.out.println(num);
		}
		
	}
}*/

//Write a Java program to print all factors of a given number.
//number=12-1,2,3,4,6,12.
/*public class practiceswhile {
	public static void main(String[] args) {
		
		int  num= 12;
	int i=1;
		while(num>=i) {
			if(num%i==0) {
				System.out.println(i);
			}i++;
		}
		
	}
}
*/

//7.Write a Java program to 
//find the sum of all even digits from a given number.

/*public class practiceswhile {
	public static void main(String[] args) {
		
		int  num= 4285;
		int sum=0;
		while(num>0) {
			
		int	digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	}
}
*/

//Write a Java program to print the multiplication tables from 1 to 10.

/*public class practiceswhile {
	public static void main(String[] args) {
		
		int lastnum=10;
		int num=1;
		while(num<=lastnum) {
			
		int mul =lastnum*num;
		System.out.println(mul);
			num++;
		}
		
	}
}
*/

//Write a Java program to calculate the power of a number (a^b).

/*public class practiceswhile {
	public static void main(String[] args) {
		
		int a=1;
		int b=3;
		
		System.out.println(a^b);
	
	}
}*/

//Generate the Series 2 4 6 8 10 .... .18

/*public class practiceswhile {
	public static void main(String[] args) {
		int i=2; 
		while(i<=20) {
		if	(i % 2 == 0) {
			System.out.println(i);
		}i++;
		}
		
		}
	}
*/

//11. Generate the Series 1 -2 3 -4 5 -6 7 -8 9 -10.

/*public class practiceswhile {
	public static void main(String[] args) {
		 
		for(int i=1;i<=10;i++) {
		if	(i % 2 == 0) {
			System.out.print("-"+i);
		}else {
			System.out.print(" "+i);
		}
		
		}
		
		}
	}
*/

//Generate the Series 1 10 100 1000.
/*
public class practiceswhile {
	public static void main(String[] args) {
		 int num=1;
		for(int i=1;i<=5;i++) {
		num=num * 10;
			System.out.println(num);
			i++;
		}
		}
		}*/

//Generate the Series 0 1 3 6 10 15 21 28 36 ..

/*public class practiceswhile {
	public static void main(String[] args) {
		 
		for(int i=1;i<=36;i++) {
	     if(i%3==0) {
			System.out.println(i);
			i++;
		}
		}
		}
}
*/

//Print 1 to 100 numbers prime numbers.

/*public class practiceswhile {
	public static void main(String[] args) {
		 
		for(int i=1;i<=100;i++) {
	     if(i%2==1) {
			System.out.println(i);
			i++;
		}
		}
		}
}
*/

//find the  hcf common factor

/*public class practiceswhile {
	public static void main(String[] args) {
		 
		int num1=22;
		int num2=18;
		int hcf=1;
		if(num1>num2) {
			for(int i=1; i<=22; i++) {
				if(num1%i==0 && num2%i==0) {
				 hcf=i;
			}
		}System.out.println(hcf);
		}
}}

*/

/*public class practiceswhile {
	public static void main(String[] args) {

		int num1 = 24;
		int num2 = 36;
		int hcf = 1;
		if (num1 > num2) {
			for (int i = 1; i <= 24; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					hcf = i;
				}
			}
			System.out.println(hcf);
		}
	}
}

*/

/*public class practiceswhile {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int i= 1;
		System.out.print(a+" "+b+" ");
		while( i<=10) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		i++;
		}
	}
}*/

/*public class practiceswhile {
	public static void main(String[] args) {

		int num = 1221;
		int temp = num;
		int rev = 0;

		while (num > 0) {

			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}

		System.out.println(rev);

		if (temp == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}
}*/

/*public class practiceswhile {
	public static void main(String[] args) {

		int num = 1234;
		int product=1;
		

		while (num > 0) {

			int digit = num % 10;
			product = product  * digit;
			num = num / 10;

		}

		System.out.println(product);

	}
}*/

//Write a program to find the factorial of a number using a while loop.

/*public class practiceswhile {
	public static void main(String[] args) {

		int num = 5;
		
		int fact=1;

		while (num> 0) {

			fact=fact*num;
			num--;
		}

		System.out.println(fact);

	}
}*/

//Write a program to print the Fibonacci series up to n terms using a while loop.

/*public class practiceswhile {
	public static void main(String[] args) {

		int a=0;
		int b=1;
		
       int i=1;
		while (i<=10) {
			System.out.println(a);
        int c=a+b;
			a=b;
			b=c;
			i++;
		}
	}
}
*/

//Write a program to print all prime numbers between 1 and 100 using a while loop.

/*public class practiceswhile {
	public static void main(String[] args) {

		
       int i=1;
		while (i<=100) {
			
			if(i%2==0){
			System.out.println(i);
			}
		}
	}
}*/

//Write a program to find the HCF of two numbers using a while loop.

/*public class practiceswhile {
	public static void main(String[] args) {

		int a=22;
		int b=18;
     
		while (a!=b) {
			
			if(a>b){
				a=a-b;
			}else {
				b=b-a;
			}
		}System.out.println(a);
	}
}*/

//Write a program to find the sum of first n natural numbers using a while loop.

//Write a program to check whether a number is prime or not using a while loop.

/*public class practiceswhile {
	public static void main(String[] args) {

	int num=1;
	int count=0;
	
	for(int i=1; i<=num; i++) {
		if(num%i==0) {
			count++;
		}
	}if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}
	}
	}
*/



//Write a program to print all prime numbers between 1 and 100 using a while loop.

/*public class practiceswhile {
	public static void main(String[] args) {

		int num=2;
		
		
		while(num<=100) {
			int count=0;
			int i=2;
			
			while(i<=num) {
				if(num%i==0) {
					count++;
				}
				i++;
			}
				if(count==1) {
					System.out.println(num);
				}
			
			num++;
		}
}
}*/


/*
public class practiceswhile {
	public static void main(String[] args) {

	int num=1;
	int count=0;
	
	for(int i=1; i<=num; i++) {
		if(num%i==0) {
			count++;
		}
	}if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}
	}
	}
*/

































