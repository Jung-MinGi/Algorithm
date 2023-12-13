import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }
        Queue<Integer> q = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }
        int cnt=0;
        while(!q.isEmpty()){
            Integer poll = q.poll();
            Object[] array = deque.toArray();

            for(int i=0;i<deque.size();i++){
                if(poll.equals(array[i])){
                    int tmp = deque.size()-1 - i;
                    if(i<=tmp){
                        for(int j=0;j<i;j++){
                            cnt++;
                            Integer i1 = deque.pollFirst();
                            deque.addLast(i1);
                        }
                        deque.pollFirst();
                    }else{
                        for(int j=0;j<=tmp;j++){
                            cnt++;
                            Integer i1 = deque.pollLast();
                            deque.addFirst(i1);
                        }
                        deque.pollFirst();
                    }
                    break;
                }
            }
        }
        System.out.println(cnt);
    }


}
