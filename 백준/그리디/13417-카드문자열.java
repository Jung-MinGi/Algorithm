import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayDeque<Character> ad =null;
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int strlen = Integer.parseInt(br.readLine());
			char[] arr = new char[strlen];
			ad = new ArrayDeque<>();
			String str = br.readLine().replaceAll(" ", "");
			for (int k = 0; k < str.length(); k++) {
				arr[k] = str.charAt(k);
			}
			for (int l = 0; l < arr.length; l++) {
				if (ad.size() == 0) {
					ad.add(arr[l]);
				} else if (ad.getFirst() - 'A' < arr[l] - 'A') {
					ad.addLast(arr[l]);
				} else {
					ad.addFirst(arr[l]);
				}
			}
			for (Character a : ad) {
				sb.append(a);
			}
			System.out.println(sb);
		}

	}
}
/*
*자료구조 덱은 양방향 삽입,삭제 가능
*/
