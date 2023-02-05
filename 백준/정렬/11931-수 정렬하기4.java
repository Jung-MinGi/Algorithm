import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Integer a: arr) {
			sb.append(a).append('\n');
		}System.out.println(sb);
		
	}
}
