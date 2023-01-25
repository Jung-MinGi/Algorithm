import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt=0;
		int prevMilk=3;
		for(int i = 0 ; i < arr.length; i++) {
			if(prevMilk==3 && arr[i] == 0) {
				cnt++;
				prevMilk = 0;
				continue;
			}
			else if(prevMilk == 2 && arr[i]==0) {
				cnt++;
				prevMilk = arr[i];
				continue;
			}
			else if(prevMilk == 0 && arr[i]==1) {
				cnt++;
				prevMilk = arr[i];
				continue;
			}
			else if(prevMilk == 1 && arr[i]==2) {
				cnt++;
				prevMilk = arr[i];
				continue;
			}else continue;
			
		}
		System.out.println(cnt);
	}
}
/*
 왜 그리디 인지 모르겠음 단순 구현문제같음
 prevMilk값은 현재인덱스가 가리키는 값의 바로 이전 인덱스의 값을 말하는데 
 입력이 0,1,2로만 주어지기 때문에 0,1,2를 제외한 수로 초기화함
 최악의 수는  우유가게의 개수(n)에 비례하기 때문에 O(N)이다
 */
