
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int error=0;
		for(int i = 0 ; i < n ; i++) {
			String str = br.readLine();
			int[] arr = new int[26];
			for(int j = 0 ; j < str.length() ; j++) {
				if(arr[str.charAt(j)-'a'] == 0) {
					arr[str.charAt(j)-'a']++;
				}else {
					if(str.charAt(j-1)==str.charAt(j)) {//바로 직전에 같은 값인 경우
						continue;
					}else {
						error++;
						break;
					}
				}
			}
		}
		System.out.println(n-error);
	}
}
/*
 * 데이터가 가장 큰 경우라도 반복문을 N번 만큼만 순회하면 되니 시간복잡도는 O(N)이다
 */
 
