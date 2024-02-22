import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			int[][] arr = new int[101][101];
			int cnt =0 ;
			for(int i =0 ; i < num ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				for(int x=a; x<a+10 ; x++) {
					for(int y = b ; y<b+10 ; y++) {
						arr[x][y] =1;
					}
				}
			}
			for(int i = 0 ; i<101;i++) {
				for(int j =0 ; j<101;j++) {
					if(arr[i][j]==1) cnt+=1;
				}
			}
			System.out.print(cnt);
			
			
	}
}