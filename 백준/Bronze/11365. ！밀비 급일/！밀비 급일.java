import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		
		while(true) {
			
			str = br.readLine();
			if (str.equals("END")) {
				break;
			}
			StringBuilder sb = new StringBuilder(str);			
			sb.reverse();
			bw.write(sb.toString());
			bw.newLine();
		}
		
		bw.flush();
		br.close();

	}

}