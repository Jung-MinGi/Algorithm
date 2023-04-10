import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		for(int i = 0 ; i < str.length() ; i++) {
			int cnt = str.charAt(i)-'a';
			if(arr[cnt] == -1){
				arr[cnt]=i;
			}
		}
		for(int a : arr) {
			
			System.out.print(a+" ");
		}
	}
}


