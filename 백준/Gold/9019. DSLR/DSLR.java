import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    static String[] answer = new String[10000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            visit = new boolean[10000];
            answer = new String[10000];
            Arrays.fill(answer,"");
            StringTokenizer st = new StringTokenizer(br.readLine());
            soultion( Integer.parseInt(st.nextToken()),  Integer.parseInt(st.nextToken()));
        }
        System.out.println(sb);
    }

    static void soultion(int start, int targetNum) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visit[start] = true;
        while (!q.isEmpty()) {
            Integer s = q.poll();
            if (s== targetNum) {
                sb.append(answer[s]).append('\n');
                break;
            }
            int d = D(s);
            int x = S(s);
            int l = L(s);
            int r = R(s);
            if (!visit[d]) {
                visit[d] = true;
                q.add(d);
                answer[d]=answer[s]+"D";
            }
            if (!visit[x]) {
                visit[x] = true;
                q.add(x);
                answer[x]=answer[s]+"S";
            }
            if (!visit[l]) {
                visit[l] = true;
                q.add(l);
                answer[l]=answer[s]+"L";
            }
            if (!visit[r]) {
                visit[r] = true;
                q.add(r);
                answer[r]=answer[s]+"R";
            }
        }
    }

    public static int D(int n) {
        return (n * 2) % 10000;
    }

    public static int S(int n) {
       return (n==0)?9999:n-1;
    }

    public static int L(int n) {
     return (n%1000)*10+n/1000;
    }

    public static int R(int n) {
       return (n%10)*1000+n/10;
    }
}