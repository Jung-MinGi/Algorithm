import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] rank;
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int k = Integer.parseInt(br.readLine());
            int pass=1;
            rank = new int[k][2];
            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                rank[i][0] = Integer.parseInt(st.nextToken());
                rank[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(rank, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0]-b[0];
                }
            });
            int min=rank[0][1];
            for(int i=1; i<k; i++){
               if(min > rank[i][1]){
                    //합격 대상임
                   pass++;
                   min = rank[i][1];
               }
            }
            sb.append(pass).append('\n');
        }
        System.out.println(sb);
    }
}