import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static class Node {
        int day;
        int price;

        public int getDay() {
            return day;
        }

        public int getPrice() {
            return price;
        }

        public Node(int day, int price) {
            this.day = day;
            this.price = price;
        }
    }

    static Node[] arr;
    static Node[] dp;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Node[n];
        dp = new Node[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < n; i++) {
            visit[i] = true;
            if (arr[i].getDay() + i == n) {
                backTracking(arr[i].getDay()+i,arr[i].getPrice(),n);
            }
            if (arr[i].getDay() + i > n) {
                backTracking(arr[i].getDay()+i,0,arr[i].getDay()+i);
            }
            if (arr[i].getDay() + i < n) {
                backTracking(arr[i].getDay()+i,arr[i].getPrice(),arr[i].getDay()+i);
            }
            visit[i]=false;
        }
        System.out.println(m);
    }

    static void backTracking(int idx, int sum, int depth) {
        if (depth >= n) {
            m = Math.max(m, sum);
            return;
        }
        for (int i = idx; i < n; i++) {
            Node node = arr[i];
            if (!visit[i]) {
                visit[i]=true;
                if (node.getDay() + i == n) {
                    backTracking(node.getDay()+i,sum+node.getPrice(),n);
                }
                if (node.getDay() + i > n) {
                    backTracking(node.getDay()+i,sum,node.getDay()+i);
                }
                if (node.getDay() + i < n) {
                    backTracking(node.getDay()+i,sum+node.getPrice(),node.getDay()+i);
                }
                visit[i] = false;
            }
        }
    }
}


