BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int totalA=0;//피로도 누적 양
			int totalB=0;
			
		int day = 24;
		//주어진 피로도가 번아웃보다 작거나 같은경우
		if(a <= d) {
			while(day > 0) {
			//직전의 피로도+새로운 피로도가 번아웃을 넘기지 않을경우
				if(totalA+a <= d) {
					//피로도를 올리고
					totalA+=a;
					//일 양도 올리고
					totalB+=b;
					//day--
					day--;
				}
				
			//넘을경우
				else {
					//휴식 시켜야됨
					//while로 돌려야됨
					while(true) {
						//if . 피로도-c +a가 번아웃 크면 
						if(totalA-c+a > d) {
							//피로도 -c
							totalA-=c;
							//day--
							day--;
						}else {//else .탈출
							break;
						}
					}
				}
		}
			System.out.println(b);
		}else {
			//주어진 피로도가 번아웃보다 큰 경우	
			//이 경우 0 출력
			System.out.println(0);
		}
*** 2023-01-21 
***시간초과남 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int totalA = 0;// 피로도 누적 양
		int totalB = 0;

		// 주어진 피로도가 번아웃보다 작거나 같은경우

		if (a <= d) {
			for (int i = 0; i < 24; i++) {
				if (totalA + a > d) {
					totalA -= c;
					if(totalA < 0 ) {
						totalA=0;
					}
				} else {
					totalA += a;
					totalB += b;
				}
			}
			System.out.println(totalB);
		} else {
			System.out.println(0);
		}
	}
}
***최악의 경우의 수가 들어와도 24번만 동작하면 되므로 시간복잡도가 O(N) 인걸 안 후
***코드가 간결해짐
***문제에서 주어진 조건을 무시해서 계속 틀림
