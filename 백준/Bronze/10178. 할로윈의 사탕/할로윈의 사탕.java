import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {	

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int t = Integer.parseInt(br.readLine());

				for (int i = 0; i < t; i++) {
					String [] temp = br.readLine().split(" ");
					int c = Integer.parseInt(temp[0]);
					int v = Integer.parseInt(temp[1]);

					//bw.write(Integer.toString("You get %d piece(s) and your dad gets %d piece(s).", c / v, c % v));
					System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", c / v, c % v);
				}
				//bw.flush();
				br.close();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
