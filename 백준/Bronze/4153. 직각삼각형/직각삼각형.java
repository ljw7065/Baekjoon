import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);

			if (a==0 && b==0 && c==0) {
				break;
			}

			if ((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(a*a)+(b*b)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

			bw.newLine();

		}

		bw.flush();
		br.close();

	}

}
