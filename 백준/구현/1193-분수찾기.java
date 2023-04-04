
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		int upValue=0;
		int botValue=0;
		if(n == 1) {
			System.out.println(1+"/"+1);
		}else {
			for (int i = 1; i <= n; i++) {
				max += i;
				int gap = 0;
				if (max >= n && i % 2 == 0) {//i가 짝수
					gap = max-n;
					upValue=i-gap;
					botValue=1+gap;
					break;
				}
			if (max >= n && i % 2 == 1) {
					gap = max-n;
					upValue=1+gap;
					botValue=i-gap;
					break;
				}
			}
			System.out.println(upValue+"/"+botValue);
		}
	}
}
