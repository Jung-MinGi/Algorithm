import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(new int[]{Integer.parseInt(st.nextToken()), i});
        }
        Collections.sort(list, (int[] a, int[] b) -> a[0] - b[0]);
        int[] p = new int[n];

        for(int i=0;i<n;i++){
            p[list.get(i)[1]]=i;
        }
        for (int i : p) {
            System.out.print(i+" ");
        }
    }


}