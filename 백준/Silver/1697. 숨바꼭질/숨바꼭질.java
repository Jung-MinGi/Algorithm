import org.w3c.dom.traversal.NodeIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

class Main {
    static Integer[] map = new Integer[100001];
    static HashSet<Integer> circleLine;
    static boolean[] visit;
    static StringTokenizer st;
    static int n, m;
    static boolean flag = false;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        if (n == m) {
            System.out.println(0);
        }else{
            Queue<Integer> q = new LinkedList<>();
            int cnt=0;
            map[n]=cnt;
            q.add(n);
            while(!q.isEmpty()){
                Integer poll = q.poll();
                if(poll == m){
                    System.out.println(map[poll]);
                    return;
                }
                if(poll+1<=100000 && map[poll+1]==null){
                    q.add(poll+1);
                    map[poll+1]=map[poll]+1;
                }
                if(poll-1>=0 && map[poll-1] == null){
                    q.add(poll-1);
                    map[poll-1]=map[poll]+1;
                }
                if(poll*2<=100000 && map[poll*2]==null){
                    q.add(poll*2);
                    map[poll*2]=map[poll]+1;
                }
            }
        }
    }


}