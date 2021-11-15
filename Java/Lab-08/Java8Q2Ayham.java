// Correct the following code
// Note: This program has no main method which will not work, I don't know if this is the full code but if it is then this is an error

public class Java8Q2Ayham {

	public static method1(int n, int m) { // var m is has no type, must be 'int m' without single quotes + there is no return type, it must return int
		n += m;
		xMethod(3.4); // xMethod accepts only integer type, must be 3 + must use return xMethod(3) to return the result
	}
	public static int xMethod(int n) {
		if (n > 0) return 1;
		else if (n == 0) return 0;
		else if (n < 0) return -1; // Changed to 'else' to make tell the method that it will always return a value
		//return 0; // This must be added or change the last 'else if' to 'else' so the code will be sure that it will always return something otherwise the method will throw an error
		}
	}