
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int[] arr = new int[2];
		for (int i = 0; i < n.length() - 1; i++) {
			if (n.charAt(i) != n.charAt(i + 1)) {
				arr[n.charAt(i) - '0']++;
			}
			if (i == n.length() - 2) {
				if (n.charAt(i) != n.charAt(i + 1)) {
					arr[n.charAt(i + 1) - '0']++;
				}else {
						arr[n.charAt(i)-'0']++;
					}
				}
		}
		if (arr[0] == arr[1]) {
			System.out.println(arr[0]);
		} else {
			System.out.println(Math.min(arr[0], arr[1]));
		}
	}
}