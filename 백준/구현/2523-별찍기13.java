
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = (2 * n) - 1;
		for (int i = 1; i <= (2 * n) - 1; i++) {// 행을 나타냄
			if (i <= n) {
				for (int k = 1; k <= i; k++) {// 해당 i행에 찍을 별의 개수를 나타냄
					System.out.print('*');
				}
				System.out.println("");
			} else {
				for (int j = 1; j <= max+1-i; j++) {// 해당 i행에 찍을 별의 개수를 나타냄
					System.out.print('*');
				}
				System.out.println("");
			}
		}
	}
}
