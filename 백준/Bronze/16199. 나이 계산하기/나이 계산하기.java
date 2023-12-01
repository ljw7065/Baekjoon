import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String [] str = br.readLine().split(" ");
		int year = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int date = Integer.parseInt(str[2]);
		
		String [] str2 = br.readLine().split(" ");
		int year2 = Integer.parseInt(str2[0]);
		int month2 = Integer.parseInt(str2[1]);
		int date2 = Integer.parseInt(str2[2]);
		
		
		
		if(month2<month || month2==month&&date2<date) {
			bw.write(Integer.toString(year2-year-1)); //만나이
			bw.newLine();
		}else {
			bw.write(Integer.toString(year2-year));
			bw.newLine();
		}
		
		bw.write(Integer.toString(year2-year+1)); //세는나이
		bw.newLine();
		bw.write(Integer.toString(year2-year)); //연나이
		bw.newLine();
		
		
		
		bw.flush();
		br.close();
	}
}
