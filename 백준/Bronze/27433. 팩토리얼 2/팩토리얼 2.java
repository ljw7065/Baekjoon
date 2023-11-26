import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 1;

        
        for(long i=n; i>=1; i--) {
        	result*=i;
            
            if (n == 0){
                System.out.println(1);  
            }
            
            
        }
        System.out.println(result);
     
    }
}