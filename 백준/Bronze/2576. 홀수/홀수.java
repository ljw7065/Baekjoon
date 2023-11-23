import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {

		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int[] arr = new int[7];
			int oddSum = 0;
			int oddMin = 10000;
			boolean oddOx = false;

			for (int i = 0; i < 7; i++) {
					arr[i] = Integer.parseInt(br.readLine());

				if (arr[i] % 2 != 0) {
					oddSum += arr[i];
					oddMin = Math.min(oddMin, arr[i]);
					oddOx = true;
				}

			}
			if (!oddOx) {
				System.out.println(-1);

			} else {
				System.out.println(oddSum);
				System.out.println(oddMin);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
