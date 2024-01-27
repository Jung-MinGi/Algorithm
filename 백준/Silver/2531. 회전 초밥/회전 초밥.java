import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
static int answer=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//접시의수
        int d = Integer.parseInt(st.nextToken());//초밥의 가짓수
        int k = Integer.parseInt(st.nextToken());//연속개수
        int c = Integer.parseInt(st.nextToken());//쿠폰번호
arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }

        if (k == n) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < k; i++) {
                set.add(arr[i]);
            }
            System.out.println(set.contains(c) ? set.size() : set.size() + 1);
            return;
        }

        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<k;j++){
                int tmp = i + j;
                if(tmp<n)set.add(arr[tmp]);
                else{
                    set.add(arr[tmp-n]);
                }
            }
            answer = Math.max(answer,set.contains(c) ? set.size() : set.size() + 1);
        }
        System.out.println(answer);

    }
}
