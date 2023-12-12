import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Main {
    static Long[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        tree = new Long[(int) Math.pow(2, a)];
        Long[] arr = new Long[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        init(1, arr, 1, n);
        while(k-->0){
            st = new StringTokenizer(br.readLine());
            System.out.println(findMinNum(1,1,n,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
    }

    static void init(int node, Long[] arr, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            init(node * 2, arr, start, (start + end) / 2);
            init(node * 2 + 1, arr, (start + end) / 2 + 1, end);
            tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
        }

    }

    static long findMinNum(int node, int start, int end, int left, int right) {
        if (end < left || start > right) return 0;

        if (left <= start && end <= right) {
            return tree[node];
        }
        long minNumLeft = findMinNum(node * 2, start, (start + end) / 2, left, right);
        long minNumRight = findMinNum(node * 2 + 1, (start + end) / 2 + 1, end, left, right);

        if(minNumLeft==0){
            return minNumRight;
        } else if (minNumRight==0) {
            return minNumLeft;
        }else{
            return Math.min(minNumLeft,minNumRight);
        }
    }
}


