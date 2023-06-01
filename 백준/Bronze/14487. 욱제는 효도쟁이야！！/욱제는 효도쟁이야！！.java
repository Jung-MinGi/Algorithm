
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int sum =0;
		for(int a : arr) {
			sum+=a;
		}
		Arrays.sort(arr);
		System.out.println(sum-arr[n-1]);
	}
}
