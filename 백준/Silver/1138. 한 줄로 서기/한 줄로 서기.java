import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int n;
    static boolean flag;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        line(0,new int[n],new boolean[n]);
    }

    static void line(int depth,int[] line,boolean[] visit) {
        if (depth == n) {
            if(checked(line)){
                for (int i : line) {
                    i++;
                    System.out.print(i+" ");
                }
                flag=true;
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!visit[i]){
                line[depth]=i;
                visit[i]=true;
                line(depth+1,line,visit);
                if(flag)return;
                visit[i]=false;
                line[depth]=-1;

            }
        }
    }
    static boolean checked(int[] line){
        if(arr[line[0]]!=0)return false;
        for(int i=1;i<n;i++){
            int cnt=0;
            for(int j=0;j<i;j++){
                if(line[i]<line[j])cnt++;
            }
            if(cnt!=arr[line[i]]){
                return false;
            }
        }
        return true;
    }
}