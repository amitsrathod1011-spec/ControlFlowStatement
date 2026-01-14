//Print numbers from 1 to 50 but stop when number becomes 25.
//Print even numbers from 1 to 100 but stop when you get first odd number.
//Print table of 9 but stop when product becomes more than 50.
//Print numbers from 1 to 50 but skip numbers divisible by 7.
//Print numbers from 1 to 100 but skip numbers ending with digit 5.
//Print characters from a€ Aa€™ to a€ Za€™ but skip vowels.


//Print numbers from 1 to 50 but stop when number becomes 25.
/*public class breakloop {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i == 25) {
				
				break;
			}System.out.println(i);
		}
	}
}
*/

//Print even numbers from 1 to 100 but stop when you get first odd number.
/*public class breakloop {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if( i % 2 == 1) {
				
				continue;
			}System.out.println(i);
		}
	}
}*/


//Print table of 9 but stop when product becomes more than 50.

/*public class breakloop {
	public static void main(String[] args) {
		int num=9;
		for(int i=1; i<=50; i++) {
			if( i *num  >50 ) {
				
				break;
			}System.out.println(i*num);
		}
	}
}*/


//Print numbers from 1 to 50 but skip numbers divisible by 7.

/*public class breakloop {
	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++)
		{
			
			if(i%7 == 0  ) {
				
				continue;
			}System.out.println(i);
		}
	}
}*/


//Print numbers from 1 to 100 but skip numbers ending with digit 5.

/*public class breakloop {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++)
		{
			
			if(i%10 == 5 ) {
				
				continue;
			}System.out.println(i);
		}
	}
}*/

//Print characters from a€ Aa€™ to a€ Za€™ but skip vowels.

/*public class breakloop {
	public static void main(String[] args) {
		
		for(char i='A'; i<='Z'; i++) {
		
			
			if(i =='A' || i =='E'|| i =='I' || i =='O'|| i=='U') {
				
				continue;
			}
			System.out.println(i);
		}
	}
}*/



//prime 1 to 50

public class breakloop {
	public static void main(String[] args) {
		
		for(int i=2; i<=50; i++) {
		int flag =0;
			
		for(int j=2; j<i; j++) {
			if(i%2==0) {
				flag =1;
				break;
			}
			}if(flag == 0){
			System.out.println(i);
		}
	}
}
}

