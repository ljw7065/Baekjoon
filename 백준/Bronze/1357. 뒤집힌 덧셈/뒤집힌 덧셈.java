import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String Y = sc.next();

		StringBuilder sb1 = new StringBuilder(X);
		StringBuilder sb2 = new StringBuilder(Y);
		sb1 = sb1.reverse();
		sb2 = sb2.reverse();

		X = sb1.toString();
		Y = sb2.toString();

		int numX = Integer.parseInt(X);
		int numY = Integer.parseInt(Y);
		int numSum = numX + numY;
		String sum = Integer.toString(numSum);

		StringBuilder sb3 = new StringBuilder(sum);
		sb3 = sb3.reverse();
		int temp = Integer.parseInt(sb3.toString());
		System.out.println(temp);
	}
}
