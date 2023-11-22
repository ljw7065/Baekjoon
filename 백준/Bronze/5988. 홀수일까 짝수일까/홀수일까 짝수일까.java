import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			BigInteger K = new BigInteger(br.readLine());

			if (K.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) { // mod: 나머지의 나머지
				bw.write("even");
			} else {
				bw.write("odd");
			}
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}