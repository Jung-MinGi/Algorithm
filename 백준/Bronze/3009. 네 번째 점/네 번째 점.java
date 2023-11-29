import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int[][] arr = new int[1001][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            arr[x][0]++;
            int y = Integer.parseInt(st.nextToken());
            arr[y][1]++;
        }
        Deque<Integer> d = new ArrayDeque<>();
        for(int i=1;i<1001;i++){
            if(arr[i][0]==1){
                d.addFirst(i);
            }
            if(arr[i][1]==1)d.addLast(i);
        }
        System.out.print(d.pollFirst()+" "+d.poll());
    }
}


