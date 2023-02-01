import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int[] arr = new int[10];
		for (int i = 0; i < n.length(); i++) {
			arr[n.charAt(i) - '0']++;
		}
		int x = arr[6] + arr[9];
		if (x % 2 == 0) {
			arr[6] = x / 2;
			arr[9] = x / 2;
		} else {
			arr[6] = x / 2 + 1;
			arr[9] = x / 2 + 1;
		}
		int max=0;
		for(int a : arr) {
			 max=Math.max(max,a);
		}System.out.println(max);
	}
}
/*
*시간제한 2초 4천만번안에 풀려야함
*데이터 크기 10^6 O(N)풀이
*카운팅 정렬사용가능 
*/
