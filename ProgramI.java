//Danielle Steinborn
import java.util.Scanner; //import java scanner

public class ProgramI{
	
	public static void main (String[] args) {
		int userLimit=0;
		int i=0;//initialize userLimit and int
		Scanner in = new Scanner(System.in); //set scanner
		System.out.print("Enter an upper Limit: "); //print for input
		do{ //loop scanner 
			if (!in.hasNextInt()){ //if the input is not an integer then scanner will print again
				System.out.print("Enter an upper Limit: "); //print for input
				in.next();
			}
			else { //if it is an integer
				userLimit = in.nextInt();//userLimit is set to the input from user
				for (i = 2; i <= userLimit; i++){ //for i under the userLimit i increments by 1 checking for Mersenne primes
					if (isMersennePrime(i)){ // and if the number is a Mersenne Prime
							System.out.println(i + ": is a Mersenne prime"); //if Mersenne Prime is true then prints
						}
					}
				}
		
			}while(i<=userLimit); //while i is less than or equal to the userLimit
	
		}
	/**
		Returns true if num is a Mersenne number
		@param num between i and userLimit being tested
		@return true if number is a Mersenne Number
		*/
	public static boolean isMersenneNumber(int num){
		int mersenne = num + 1; //add one to the number to check if number before is a power of 2
		if (isPowerOf2(mersenne)){
			return true; //if the number is a power of 2 then return true
		}
		return false; //otherwise it is false
	}
	/**
		Returns true if num is a Power of 2
		@param num between i and userLimit being tested
		@return true if number is a power of 2
	*/
	public static boolean isPowerOf2(int num){
		if ((num & -num) == num) {//checks if the number is a power of two
			return true;//returns true
		}
		return false;
	}
	/**
		Returns true if num is a prime number
		@param num between i and userLimit being tested
		@return true if number is a prime number
	*/
	public static boolean isPrime(int num){
		for (int start = 2; start <= Math.sqrt(num); start++){ //for start less than or equal to the square root of the integer increment start
			if (num % start == 0){
				return false; //returns false if the remainder of the number and start is zero
			}
		}
		return true; //if it is prime then it returns true
	}
	/**
		Returns true if num is a Mersenne Prime
		@param num between i and userLimit being tested
		@return true if number is a Mersenne Prime
	*/
	public static boolean isMersennePrime(int num){
		if(isPrime(num) && isMersenneNumber(num)){ //check if the number is prime and a Mersenne number
			return true; // if all that is correct then it is true
		}
		return false; // otherwise it is false
	}
}
		