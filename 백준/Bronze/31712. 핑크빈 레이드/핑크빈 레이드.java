import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] player = new int[3][3];
        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            player[i][0]=0;
            player[i][1]=b;//공격력
            player[i][2]=a;
        }
        int boss=Integer.parseInt(br.readLine());
        int time=-1;
        while(boss>0){
            for (int[] ints : player) {
                ints[0]--;
                if(ints[0]<=0){
                    boss-=ints[1];
                    ints[0]=ints[2];
                }
            }
            time++;
        }
        System.out.println(time);
    }
}
