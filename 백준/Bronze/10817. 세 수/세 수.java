import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if ((A >= B && A <= C) || (A >= C && A <= B)) {
			System.out.println(A);
		} else if ((B >= A && B <= C) || (B >= C && B <= A)) {
			System.out.println(B);
		} else {
			System.out.println(C);
		}

	}

}
