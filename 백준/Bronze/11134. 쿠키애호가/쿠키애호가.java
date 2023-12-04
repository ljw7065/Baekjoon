import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int c = sc.nextInt();

			if (n % c == 0) {
				System.out.println(n / c);
			} else {
				System.out.println(n / c + 1);
			}
		}

	}
}
