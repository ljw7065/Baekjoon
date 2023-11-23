import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");

		String first = str[0]+str[1];
		String second = str[2]+str[3];
		
		long result = Long.parseLong(first) + Long.parseLong(second);
		bw.write(Long.toString(result));
		
		bw.close();
		bw.close();
	}
	
}