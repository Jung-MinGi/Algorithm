import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =Integer.parseInt(br.readLine());
       arr = new char[n][n];
       star(0,0,n,false);
       StringBuilder sb = new StringBuilder();
        for (char[] chars : arr) {
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    static void star(int x,int y,int n,boolean flag){
        if(flag){
            for(int i=x;i<x+n;i++){
                for(int j=y;j<y+n;j++){
                   arr[i][j]=' ';
                }
            }
            return;
        }
        if(n==1){
            arr[x][y]='*';
            return;
        }


        int size=n/3;//지금 현재 n의 크기 기준으로 바라볼때 한칸의 크기
        int count=0;

        for(int i=x;i<x+n;i+=size){
            for(int j=y;j<y+n;j+=size){
                count++;
                if(count==5){
                    star(i,j,size,true);
                }else star(i,j,size,false);
            }
        }
    }
}