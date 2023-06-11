import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = new String(br.readLine());
		String temp = n;
		String[] arr = new String[n.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n.substring(i, n.length());
		}
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(String a : arr) {
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
}
