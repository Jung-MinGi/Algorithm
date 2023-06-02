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