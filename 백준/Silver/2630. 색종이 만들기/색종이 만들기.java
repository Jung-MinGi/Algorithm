import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    static int white=0;
    static int black=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0,0,n);
        System.out.println(white);
        System.out.println(black);
    }
    static void partition(int x,int y,int size){
        if(colorCheck(x,y,size)){
            if(arr[x][y]==1)black++;
            else white++;
            return;
        }

        int newSize=size/2;
        partition(x,y,newSize);
        partition(x,y+newSize,newSize);
        partition(x+newSize,y,newSize);
        partition(x+newSize,y+newSize,newSize);

    }
    static boolean colorCheck(int x,int y,int size){
        int standard=arr[x][y];
        for(int i=x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(arr[i][j]!=standard)return false;
            }
        }
        return true;
    }
}
