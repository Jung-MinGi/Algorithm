import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
 static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n =Integer.parseInt(br.readLine());
      arr = new int[n+1];
      int a = Integer.parseInt(br.readLine());
      int[] p = new int[a+1];
      int expected=0;
      int num=0;
        for(int i=1;i<=a;i++){
          StringTokenizer st = new StringTokenizer(br.readLine());
          int x = Integer.parseInt(st.nextToken());
          int y = Integer.parseInt(st.nextToken());
          if(expected<y-x){
              expected=y-x;
              num=i;
          }
          for(int j=x;j<=y;j++)if(arr[j]==0)arr[j]=i;
      }
        ArrayList<int[]> list = new ArrayList<>();
        for (int i : arr) {
            p[i]++;
        }
        for(int i=1;i<=a;i++){
            list.add(new int[]{i,p[i]});
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])return o1[0]-o2[0];
                return o2[1]-o1[1];
            }
        });
        System.out.println(num);
        System.out.println(list.get(0)[0]);
    }

}
