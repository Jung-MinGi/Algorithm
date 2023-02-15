import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int cnt = 0;// x개수
		int error = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'X') {
				cnt++;
				if(i == n.length()-1) {//'.'이 없는 입력값 처리
					if(cnt%2==0) {
						while (cnt > 0) {
						if (cnt >= 4) {
							cnt-=4;
							sb.append("AAAA");
						} else {
							cnt-=2;
							sb.append("BB");
						}
						}
					}else error=-1;
				}
			} else {// '.'이 나왔을때
				if (cnt % 2 == 1) {// x개수가 홀수
					error=-1;
					cnt = -1;
					break;
				} else {// 짝수
					while (cnt > 0) {
						if (cnt >= 4) {
							cnt-=4;
							sb.append("AAAA");
						} else {
							cnt-=2;
							sb.append("BB");
						}
						}
					cnt=0;
					sb.append('.');
				}
			}
		}
		if(error!=-1) {
			System.out.println(sb);
		}else System.out.println(error);
	}
}
