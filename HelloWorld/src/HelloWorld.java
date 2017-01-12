import java.util.Scanner;

public class HelloWorld {

	public static String exampleParameter(String exampleParameter) {
		return exampleParameter;
	}

	public static void exampleInt(int a, int b) {

		int total = 0;
		if (a == 0 && b != 0) {
			total = b;
		} else if (b == 0 && a != 0) {
			total = a;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(total);

		}

	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("your array size :");

		int arraySize = myScanner.nextInt();
		int[] arraySum = new int[arraySize];
		myScanner.close();
		for (int i = 0; i < arraySum.length; i++)

		{
			arraySum[i] = i + 4;

			System.out.println("arraySum  " + i * 10);

		}
		int[] arrayInts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		exampleInt(arrayInts[2], arrayInts[4]);
		System.out.println(exampleParameter("five"));

		for (int i : arrayInts) {
			System.out.println("arrayInts : " + i);
		}

	}
}
/*
 * conditionals
 * 
 * public static int exampleInt(int a, int b, boolean test){
 * 
 * int total = 0; if (test){ total = a + b; } else {total = a * b; } return
 * total; * }
 * 
 * 
 * 
 * 
 * conditional 2
 * 
 * public static int exampleInt(int a, int b){
 * 
 * int total = 0; if (a == 0&&b!= 0){ total = b; } else if (b== 0 && a!= 0){
 * total = a; } return total;
 */

/*
 * recursion public static void exampleInt(int a, int b) {
 * 
 * int total = 0; if (a == 0 && b != 0) { total = b; } else if (b == 0 && a !=
 * 0) { total = a; }
 * 
 * for (int i = 0; i < 10; i++) { System.out.println(total); }
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * System.out.println(exampleParameter("five"));
 */