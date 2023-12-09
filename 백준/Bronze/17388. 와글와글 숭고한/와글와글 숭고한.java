import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		int min = Math.min(arr[0], arr[1]);
		min = Math.min(arr[2], min);

		if (sum >= 100) {
			System.out.println("OK");
		} else {
			if (min == arr[0]) {
				System.out.println("Soongsil");
			} else if (min == arr[1]) {
				System.out.println("Korea");
			} else if (min == arr[2]) {
				System.out.println("Hanyang");
			}
		}

	}
}