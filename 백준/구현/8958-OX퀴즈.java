import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			 String str=br.readLine();
			int totalSum = 0;
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O') {
					cnt++;
					totalSum += cnt;
				} else {
					cnt = 0;}
			}
			System.out.println(totalSum);
		}
	}
}
