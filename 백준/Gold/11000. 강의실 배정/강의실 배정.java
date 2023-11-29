import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static class Node {
        int start;
        int end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Node[] list = new Node[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(list, (a, b) -> (a.start == b.start) ? a.end - b.end : a.start - b.start);
        pq.add(list[0].end);
        for (int i=1;i<n;i++) {
            if (list[i].start >= pq.peek()) {
                pq.poll();
            }
            pq.add(list[i].end);
        }
        System.out.println(pq.size());
    }
}


