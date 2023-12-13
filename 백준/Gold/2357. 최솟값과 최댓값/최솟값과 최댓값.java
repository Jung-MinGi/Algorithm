import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main {

    static int[][] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int i = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        tree = new int[(int) Math.pow(2, i)][2];
        init(arr, 1, 1, n);
        while (k-->0) {
             st = new StringTokenizer(br.readLine());
            int[] query = query(1, 1, n, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            if(query[0]>query[1]){
                System.out.println(query[1]+" "+query[0]);
            }else{
                System.out.println(query[0]+" "+query[1]);
            }
        }

    }
    static int[] query(int node,int start,int end,int left,int right){
        if(end < left|| start > right) return new int[]{0,0};
        if(left<=start&&end<=right) return tree[node];
        int[] tmp = query(node * 2, start, (start + end) / 2, left, right);
        int[] tmp2 = query(node * 2+1, (start + end) / 2+1,end, left, right);
            int a = tmp[0];
            int b = tmp[1];
            int c = tmp2[0];
            int d = tmp2[1];
        int max = Math.max(Math.max(a, b), Math.max(d, c));
        int[] array = new int[]{a, b, c, d};
        Arrays.sort(array);
        int min = 0;
        for (int i : array) {
            if (i != 0) {
                min = i;
                break;
            }
        }
        return new int[]{max,min};
    }

    static void init(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = new int[]{arr[start], 0};
        } else {
            init(arr, node * 2, start, (start + end) / 2);
            init(arr, node * 2 + 1, (start + end) / 2 + 1, end);
            int a = tree[node * 2][0];
            int b = tree[node * 2][1];
            int c = tree[node * 2 + 1][0];
            int d = tree[node * 2 + 1][1];
            int max = Math.max(Math.max(a, b), Math.max(d, c));
            int[] tmp = new int[]{a, b, c, d};
            Arrays.sort(tmp);
            int min = 0;
            for (int i : tmp) {
                if (i != 0) {
                    min = i;
                    break;
                }
            }
            tree[node][0] = max;
            tree[node][1] = min;
        }
    }
}
