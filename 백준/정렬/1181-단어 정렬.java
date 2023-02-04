import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}

		});
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append('\n');
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i].equals(i - 1)) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}
}
/*
*내가 원하는 정렬조건을 구현할려면 
*Comparator인터페이스를 이용해서 Arrays.sort메소드에 익명객체를 이용해서 인자로 넘겨주면 
*/
