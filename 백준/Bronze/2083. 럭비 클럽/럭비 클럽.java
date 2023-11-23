import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

				
				while(true) {
					String [] info = br.readLine().split(" "); //String과 String 배열은 다름 
					String name = info[0];
					int age = Integer.parseInt(info[1]);
					int weight = Integer.parseInt(info[2]);
			
					if(name.equals("#")) {
						break;
					}
					
		            if(age>17||weight>=80) {
		            	bw.write(info[0]+" Senior");
					}else {
						bw.write(info[0]+" Junior");
					}
				
	  			bw.newLine();
	            
				}
		
				bw.flush();
				br.close();
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
	}

}

