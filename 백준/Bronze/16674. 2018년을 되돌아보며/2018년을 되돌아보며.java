import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] visit = new int[10];
        for(int i=0;i<s.length();i++){
            visit[s.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            if(visit[i]>0){
                if(i!=2&&i!=0&&i!=1&&i!=8){
                    System.out.println(0);
                    return;
                }
            }
        }
        if(visit[2]==0||visit[0]==0||visit[1]==0||visit[8]==0){
            System.out.println(1);
            return;
        }
        int k = visit[2];
        if(k==visit[0]&&visit[1]==k&&visit[8]==k){
            System.out.println(8);
        }else{
            System.out.println(2);
        }

    }
}
