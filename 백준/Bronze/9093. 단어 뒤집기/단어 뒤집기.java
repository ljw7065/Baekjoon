import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");

			for (int j = 0; j < str.length; j++) {
				StringBuilder sb = new StringBuilder(str[j]);
				sb.reverse();
				bw.write(sb.toString() + " ");

			}
			bw.newLine();
		}

		bw.flush();
		br.close();
	}
}