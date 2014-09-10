package MainPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger num = new MyInteger(10);
		char[] array = {0,1,2,3,4,5};
		String word = ("This is a test");
		System.out.println("Is num even? " + num.isEven());
		System.out.println("Is num odd? " + num.isOdd());
		System.out.println("Is num prime? " + num.isPrime());
		System.out.println("The sum of the array is: " + num.parseInt(array));
		System.out.println("This is a static isEven method: " + num.isEven(6));
		System.out.println("This is a static isOdd method: " + num.isOdd(11));
		System.out.println("Length of string to int value: " + num.parseInt(word));
		
	}

}

class MyInteger {
	//An int data field named value that stores the int value represented by this object
	private static int value;
	
	//A constructor that creates a MyInteger object for the specified int value
	MyInteger(int newValue) {
		value = newValue;
	}
	
	//A get method that returns the int value
	public int getValue() {
		return value;
	}

	//Checks if value is even and returns true if it is or false if it's not
	public boolean isEven() {
		if(value % 2 == 0)
			return true;
		else
			return false;
	}
	
	//Checks if value is odd and returns true if it is or false if not
	public boolean isOdd() {
		if(value % 2 != 0)
			return true;
		else
			return false;
	}
	
	//Checks if value is a prime number and returns true if it is or false if not
	public boolean isPrime() {
		 if (value <= 1) {
		       return false;
		   }
		   for (int x = 2; x < Math.sqrt(value); x++) {
		       if (value % x == 0) {
		           return false;
		       }
		   }
		   return true;
	}
	
	public static boolean isEven(int value) {
		if(value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int value) {
		if(value % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int value) {
		 if (value <= 1) {
		       return false;
		   }
		   for (int x = 2; x < Math.sqrt(value); x++) {
		       if (value % x == 0) {
		           return false;
		       }
		   }
		   return true;
	}
	
	private static boolean isEven(MyInteger MyInt) {
		if(MyInteger.value % 2 == 0)
			return true;
		else
			return false;
	}

	private static boolean isOdd(MyInteger MyInt) {
		if(MyInteger.value % 2 != 0)
			return true;
		else
			return false;
	}
	
	private static boolean isPrime(MyInteger value) {
		return MyInteger.isPrime(value.getValue());
	}
	
	public boolean equals(int value) {
		if (this.value == value)
			return true;
		else
			return false;
	}

	private boolean equals(MyInteger number) {
		if(number.value == value)
			return true;
		else
			return false;
	}

	public static int parseInt(char[] value) {
		int total = 0;
		
		 for (int i = 0 ; i < value.length; i++){
			 total += value[i];
		 }
		 return total;
	}
	
	public static int parseInt(String value) {
		return value.length();
	}


}





