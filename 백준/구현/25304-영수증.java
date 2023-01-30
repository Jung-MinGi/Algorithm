import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int price = Integer.parseInt(br.readLine());
	int n = Integer.parseInt(br.readLine());
	int sum=0;
	StringTokenizer st;
	while(n-->0) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		sum+=a*b;
	}
	if(sum == n) {
		System.out.println("Yes");
	}else System.out.println("No");
	
	}
}
