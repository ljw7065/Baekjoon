import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());		
			
			int [] time = {300, 60, 10};
			int [] countTime = {0, 0, 0};

			if(t % 10 != 0) {
				System.out.println(-1);
			} else {
				for (int i = 0; i <time.length; i++) {
					countTime[i] = t / time[i];
					System.out.print(countTime[i]+" ");
					t %= time[i];
				}			
			}
			
			br.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
