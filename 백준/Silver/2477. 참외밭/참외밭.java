import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[6][2];
        int[] num = new int[5];

        int max = 0;
        int maxside = 0;
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            num[a]++;
            arr[i][0] = a;
            arr[i][1] = b;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int a = arr[0][1];
        int b = arr[1][1];
        int c = arr[3][1];
        int d = arr[4][1];
        list.add(arr[0][0]);
        list.add(arr[1][0]);
        list.add(arr[3][0]);
        list.add(arr[4][0]);
        int cnt=0;
        for (Integer i : list) {
            if(num[i]==1)cnt++;
        }
        int ans=0;
        if(cnt==2){
            ans=Math.abs((a*b)-(c*d))*n;
        }else ans=((a*b)+(c*d))*n;
        System.out.println(ans);
//        System.out.println("ans = " + ans);
//        System.out.println("smallcol = " + smallcol);
//        System.out.println("smallrow = " + smallrow);

    }
}


