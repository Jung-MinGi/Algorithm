import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] a = new int[100001];
    // 00 10 01 11
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[Integer.parseInt(st.nextToken())]++;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0)continue;
            list.add(new int[]{a[i],i});
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o2[0]-o1[0];
            }
        });
        int i = list.get(0)[0];
        if(n%2==0){
            if(n/2<i) System.out.println("NO");
            else System.out.println("YES");
        }else {
            if(n/2+1<i) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
