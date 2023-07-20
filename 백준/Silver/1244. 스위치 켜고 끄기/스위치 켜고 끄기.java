import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] switchState;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        switchState = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            switchState[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(sex == 1){
                for(int i =num; i<n+1; i=i+num){
                    transition(i);
                }
                continue;
            }
            int min = Math.min(num - 1, n  - num);
            for(int i=0; i<=min; i++){
                if(i==0){
                    transition(i+num);
                    continue;
                }
                if(switchState[num-i] == switchState[num+i]){
                    transition(num-i);
                    transition(num+i);
                }else{
                    break;
                }
            }
        }
        int cnt=0;
        for(int i=1; i< switchState.length; i++){
            cnt++;
            sb.append(switchState[i]);
            if(cnt%20 == 0){
                sb.append('\n');
            }else{
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
    static void transition(int a){
        if(switchState[a]==0) switchState[a]=1;
        else switchState[a]=0;
    }
}
