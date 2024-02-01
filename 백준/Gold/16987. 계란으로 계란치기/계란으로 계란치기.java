import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] weight;
    static int[] durability;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        weight = new int[n];
        durability = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            durability[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }
        breakEgg(0);
        System.out.println(answer);
    }

    /**
     * [0] 내구도
     * [1] 무게
     */
    static void breakEgg(int eggNum) {

//        for (int i = eggNum; i < weight.length; i++) {
//            if (durability[i] > 0) {
//                eggNum = i;
//                break;
//            }
//        }

        if (eggNum == durability.length) {
            int cnt=0;
            for (int i : durability) {
               if(i<=0)cnt++;
            }
            answer = Math.max(cnt,answer);
            return;
        }
        boolean flag = false;
        for (int i = 0; i < durability.length; i++) {
            if (i == eggNum) continue;
            if (durability[i] <= 0||durability[eggNum]<=0) continue;
            flag=true;
            durability[eggNum] -= weight[i];
            durability[i] -= weight[eggNum];
            breakEgg(eggNum + 1);
            durability[eggNum] += weight[i];
            durability[i] += weight[eggNum];
        }
        if(!flag){
            breakEgg(eggNum+1);
        }
    }

}