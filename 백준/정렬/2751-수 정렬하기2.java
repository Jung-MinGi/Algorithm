import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[2000001];
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a + 1000000]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
			sb.append(i-1000000);
			sb.append('\n');
			}
			
		}System.out.println(sb);
	}
}
/*
*최악의 데이터 크기가 10^6이니깐 시간복잡도O(N)이하로 봐야되고
*데이터의 개수와 범위를 봐서 카운팅 정렬을 사용해도 메모리 낭비는 없을거 같음ㅁ
*그리고 첫 제출시 StringBuilder를 쓰지 않아 시간초과 발생했음
*/
