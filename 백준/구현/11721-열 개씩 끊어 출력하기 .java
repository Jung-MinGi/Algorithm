import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		if(str.length() <= 10) {
			System.out.println(str);
		}else {
			for(int i = 0 ; i < str.length(); i++) {
				sb.append(str.charAt(i));
				if((i+1)%10 == 0) {
					sb.append('\n');
				}
			}
			System.out.print(sb);
		}
	}
}
