import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static long[] segmentTree;
    static long[] arr;
    static final int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int h = (int) Math.ceil(Math.log10(n) / Math.log10(2)) + 1;
        segmentTree = new long[(int) Math.pow(2, h)];
        init(1, 1, n);
        int i = m + k;
        while (i-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            if (a == 1) {
                arr[b] = c;
                update(1, b, 1, n, c);
            } else {
                System.out.println(query(1, b, (int) c, 1, n));
            }
        }
    }

    static long query(int node, int left, int right, int start, int end) {
        if (start > right || end < left) return 1;
        if (left <= start && end <= right) return segmentTree[node];
        else {
            return ((query(node * 2, left, right, start, (start + end) / 2) % mod) *
                    (query(node * 2 + 1, left, right, (start + end) / 2 + 1, end) % mod) % mod);
        }
    }

    static long update(int node, int index, int start, int end, long changeValue) {
        if (index < start || end < index) return segmentTree[node];
        else {
            if (start != end) {
                segmentTree[node] = (update(node * 2, index, start, (start + end) / 2, changeValue) *
                        update(node * 2 + 1, index, (start + end) / 2 + 1, end, changeValue)) % mod;
                return segmentTree[node];
            } else {
                segmentTree[node] = arr[start];
                return segmentTree[node];
            }
        }
    }
    static long init(int node, int start, int end) {
        if (start == end) {
            segmentTree[node] = arr[start];
            return segmentTree[node];
        } else {
            segmentTree[node] = (init(node * 2, start, (start + end) / 2) *
                    init(node * 2 + 1, (start + end) / 2 + 1, end)) % mod;
            return segmentTree[node];
        }
    }

}
