import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 2 1
 * 2 60
 * 30 98
 * 65 25
 */
class Main {
    static int n, m;
    static HashMap<Integer, Integer> snake = new HashMap<>();
    static HashMap<Integer, Integer> ladder = new HashMap<>();
    static int[] arr = new int[101];
    static boolean[] visit = new boolean[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            ladder.put(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            snake.put(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
soultion();
    }
    static void soultion(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,0});
        visit[1]=true;
        while(!q.isEmpty()){
            int[] poll = q.poll();
            if(poll[0]==100){
                System.out.println(poll[1]);
                break;
            }
            for(int i=1;i<7;i++){
                int next = poll[0]+i;
                if(next>100)continue;
                if(visit[next])continue;
                if(ladder.containsKey(next)){
                    q.add(new int[]{ladder.get(next),poll[1]+1});
                }else if(snake.containsKey(next)){
                    q.add(new int[]{snake.get(next),poll[1]+1});
                }else{
                    visit[next]=true;
                    q.add(new int[]{next,poll[1]+1});
                }
            }
        }
    }
}