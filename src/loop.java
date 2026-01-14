//Print numbers from 1 to 10 using a loop.
/*public class loop {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;++i) {
			System.out.println(i);
		}
	}
}
*/


//Print numbers from 10 to 1.
/*public class loop{
	public static void main(String[] args) {
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
}
*/

//Print all even numbers between 1 and 50.
/*public class loop{
	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++) {
			if (i%2==0)
			System.out.println(i);
		}
	}
}
*/

//Print all odd numbers between 1 and 50.
/*public class loop{
	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++) {
			if (i%2==1)
			System.out.println(i);
		}
	}
}
*/


//Print the table of 5 using a loop.
/*public class loop{
	public static void main(String[] args) {
		
		int i=1;
		do {
			System.out.println(5*i);
			i++;
		}while(i<=10);
	}
}
*/


//Print the table of any number (e.g., n = 7).
/*public class loop{
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10){
			System.out.println(7*i);
			i++;
		}
	}
}
*/

//Print Hello 10 times.
/*public class loop{
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10){
			System.out.println("Hello");
			i++;
		}
	}
}
*/


//Print the sum of first 10 natural numbers.
/*public class loop{
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;	
		}System.out.println(sum);
	}
}
*/


//Print the sum of even numbers from 1 to 100.
/*public class loop{
	public static void main(String[] args) {
		
		int sum =0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) 
			sum=sum+i;
			 
		}System.out.println(sum);
		
	}
}
*/


//Print the sum of odd numbers from 1 to 100.
/*public class loop{
	public static void main(String[] args) {
		
		int sum =0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) 
			sum=sum+i;
			 
		}System.out.println(sum);
		
	}
}
*/


//Count how many numbers between 1 and 100 are divisible by 5.
/*public class loop{
	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%5==0) 
				count++;
			}System.out.println(count);
		}
	}
*/


//Print all numbers from 1 to 100 using for, while, and do-while loops.
//Print the multiplication table of any number (example: 7) using all three loops.
//Print the sum of digits of a number using while loop.
//Print all even numbers between 1 to 200 using for loop.
//Print the reverse of a number (e.g., 1234 + 4321) using while loop.
//Print factorial of any number using do-while loop.
//Print Fibonacci series up to 10 terms using for loop.
//Print all numbers divisible by 3 and 5 between 1 and 150 using for loop.
//Count how many digits are in a number (e.g., 48793 + 5 digits) using while loop.
//Accept a number and print whether it is a palindrome or not using while loop.



//Print the multiplication table of any number (example: 7) using all three loops.

/*public class loop{
	public static void main(String[] args) {
		
		int num=7;
		int i=1;
	while(i<=10) {
		
		System.out.println(num*i);
		i++;
	}
		
	}
}
*/


//Print the sum of digits of a number using while loop.
/*public class loop{
	public static void main(String[] args) {
		
	int sum =0;
		int i=0;
	while(i<=9) {
		sum=sum+i;
		System.out.println(sum);
		i++;
	}
		
	}
}*/


//Print the reverse of a number (e.g., 1234 + 4321) using while loop.

/*public class loop{
	public static void main(String[] args) {
		
	int num= 1234;
 	int rev=0;
	while(num>0) {
         rev=rev*10+num%10;
		num=num/10;
		
	}System.out.println(rev);
	}
}**/


//Print factorial of any number using do-while loop.
/*public class loop{
	public static void main(String[] args) {
		int num =5;
		int fact=1;
	int i=1;
	do{
		fact= fact*i;
		
		i++;
	}while(i<=num);
	System.out.println(fact);
	}
}*/


///Print Fibonacci series up to 10 terms using for loop.

/*public class loop{
	public static void main(String[] args) {
		
	int a=0;
	int b=1;
	for(int i=1; i<=10; i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	}
}*/


//Print all numbers divisible by 3 and 5 between 1 and 150 using for loop.
/*public class loop{
	public static void main(String[] args) {
		
	for(int i=1; i<=150; i++) {
		if(i%3==0 && i%5==0 )
		System.out.println(i);
		
	}
	}
}*/


//Count how many digits are in a number (e.g., 48793 + 5 digits) using while loop.

/*public class loop{
	public static void main(String[] args) {
	int count=0;	
	int i=48793 ;
	while(i>0) {
	
	i=i/10;	
		count++;
	}System.out.println(count);
	}
}
*/


//Accept a number and print whether it is a palindrome or not using while loop.

/*public class loop{
	public static void main(String[] args) {
		int rev=0;
		
	int num=121;
	int temp =num;
	while(num>0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	if(temp == rev) {
		System.out.println("p");
	}else {
		System.out.println("m");
	}
}
}
*/


//check no is prime or not (int num =25)

//reverse no (int a=12345)

/*public class loop{
	public static void main(String[] args) {
	int num=23;
	blooean isprime = true;
	while (true) {
		if(num%2 == 0) {
			System.out.println(" prime");
		}else {
			System.out.println("not prime");
		}
	}
	}
}
*/


/*public class loop{
	public static void main(String[] args) {
	int a =12345;
	int rev;
	while (a>0) {
	rev= rev*10 +a%10;
	a=a/10;
		System.out.println(rev);
	}
	}
}
*/


/*/public class loop {
    public static void main(String[] args) {
        int num = 12345;   
        int rev = 0;       

        while(num != 0) {
            int digit = num % 10;     
            rev = rev * 10 + digit;   
            num = num / 10;           
        }

        System.out.println("Reversed Number: " + rev);
    }
}
*/











public class loop{
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
	for(int i =1; i<=25; i++) {
		
		int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
	}
}
}


/*public class loop{
	public static void main(String[] args) {
int num = 23;
boolean isPrime = true;

for(int i = 2; i < num; i++){
    if(num % i == 0){
        isPrime = false;
        break;
    }
}

if(isPrime){
    System.out.println(num + " is Prime");
} else {
    System.out.println(num + " is Not Prime");
}
	}}

*/





