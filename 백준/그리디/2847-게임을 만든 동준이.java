import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt=0;
		for(int i = arr.length-1 ; i > 0 ; i--) {
			if(arr[i] <= arr[i-1]) {
				cnt+=arr[i-1]-(arr[i]-1);
				arr[i-1] = arr[i]-1;
			}else continue;
		}
		System.out.println(cnt);

	}
}
/*
*뒤에서부터 풀어볼 생각
*시간제한 1초*1천만번
*데이터 크기와 단계가 비례하므로 선형시간을 가진다
*/
