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
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Long[] arr = new Long[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        size(n);
        init(1, arr, 1, n);
        int i = m + k;
        while (i-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Long c = Long.parseLong(st.nextToken());
            if (a == 1) {
                update(1, 1, n, b, c - arr[b]);
                arr[b] = c;
            } else {
                long sum = sum(1, 1, n, b, c);
                System.out.println(sum);
            }
        }
    }

    static void size(int n) {
        int i = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        tree = new Long[(int) Math.pow(2, i)];
    }

    static Long init(int node, Long[] arr, int start, int end) {
        if (start == end) {
            return tree[node] = arr[start];
        }

        return tree[node] = init(node * 2, arr, start, (start + end) / 2) +
                init(node * 2 + 1, arr, (start + end) / 2 + 1, end);
    }

    static void update(int node, int start, int end, int tmp, long gap) {
        if (tmp < start || tmp > end) return;

        tree[node] += gap;
        if (start != end) {
            update(node * 2, start, (start + end) / 2, tmp, gap);
            update(node * 2 + 1, (start + end) / 2 + 1, end, tmp, gap);

        }
    }

    static Long sum(int node, int start, int end, int left, Long right) {
        if (left > end || right < start) return 0L;

        if (start >=left && end <= right) return tree[node];

        return sum(node * 2, start, (start + end) / 2, left, right)
                + sum(node * 2 + 1, (start + end) / 2 + 1, end, left, right);
    }
}


