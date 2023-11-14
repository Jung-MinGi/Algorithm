import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static int[][] arr;
    static int cnt=0;
    static boolean[][] check;
    static int[][] target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        check = new boolean[n][m];
        target = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] charArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(charArray[j]));
            }
        }
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] charArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                target[i][j] = Integer.parseInt(String.valueOf(charArray[j]));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==target[i][j]){
                    check[i][j]=true;
                    continue;
                }
                if (!check[i][j]) {
                    if(change(i,j)){
                        cnt++;
                        for(int k=i;k<i+3;k++){
                            for(int l=j;l<j+3;l++){
                                check[k][l]=(arr[k][l]==target[k][l])?true:false;
                            }
                        }
                    }else{
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static boolean change(int row, int col) {
        if(row+3>n||col+3>m) return false;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                arr[i][j]=(arr[i][j]==0)?1:0;
            }
        }
        return true;
    }
}

