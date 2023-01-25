import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] counting = new int[1001];
		int[] arr = new int[n];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			counting[arr[i]]++;
		}
		int sum = 0;
		int prevSum = 0;
		for (int i = 0; i < counting.length; i++) {
			while (counting[i]-- > 0) {
				prevSum +=i;
				sum += prevSum;
			}
		}
		System.out.println(sum);
	}
}
/*
 * 시간제한1*2천만번안에 구현되어야 함 데이터 개수가 10^3이므로 O(N^2)까지 가능 데이터범위도 크지 않으니 메모리 낭비도 없
 * 시간복잡도가 O(N)인 카운팅 정렬사용
 */
