import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static boolean[] visit = new boolean[1000000001];
    static PriorityQueue<String> pq = new PriorityQueue<>();
    private static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        soultion(n);
    }

    static void soultion(int num) {
        String[] operator = new String[]{"*", "+", "-", "/"};
        Queue<Object[]> q = new LinkedList<>();
        q.add(new Object[]{num, ""});
        visit[num] = true;
        while (!q.isEmpty()) {
            Object[] poll = q.poll();
            Long l = Long.parseLong(String.valueOf(poll[0]));
            String result = String.valueOf(poll[1]);
            for (int i = 0; i < 4; i++) {
                if (i == 1) {
                    String str = result;
                    long tmp = l + l;
                    if (tmp>=1000000001||visit[(int) tmp]) continue;
                    visit[(int) tmp] = true;
                    str += operator[i];
                    if (tmp == m) {
                        pq.add(str);
                        continue;
                    }
                    q.add(new Object[]{tmp, str});
                } else if (i == 0) {
                    String str = result;
                    long tmp = l * l;
                    if (tmp>=1000000001||visit[(int) tmp]) continue;
                    visit[(int) tmp] = true;
                    str += operator[i];
                    if (tmp == m) {
                        pq.add(str);
                        continue;
                    }
                    q.add(new Object[]{tmp, str});
                } else if (i == 2) {
                    String str = result;
                    long tmp = 0;
                    if (visit[(int) tmp]) continue;
                    visit[(int) tmp] = true;

                    str += operator[i];
                    if (tmp == m) {
                        pq.add(str);
                        continue;
                    }
                    q.add(new Object[]{tmp, str});
                } else {
                    String str = result;
                    long tmp =1;
                    if (visit[(int) tmp]) continue;
                    visit[(int) tmp] = true;
                    str += operator[i];
                    if (tmp == m) {
                        pq.add(str);
                        continue;
                    }
                    q.add(new Object[]{tmp, str});
                }
            }
        }
        if(!pq.isEmpty()){
            System.out.println(pq.poll());
            return;
        }
        if(n==m){
            System.out.println(0);
            return;
        }
        System.out.println(-1);
    }
}