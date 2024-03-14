import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * 원래 자기보다 앞에 차량 개수 > 현재 자기 차량 보다 남은 개수 -추월 한거임
     * 원래 자기보다 앞에 차량 개수 < 현재 자기 차량 보다 남은 개수 -추월 당한거임
     */
    static int[] init;
    static int[] exit;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        init = new int[n];
        exit = new int[n];
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }
        for (int i = 0; i < n; i++) {
            Integer a = map.get(br.readLine());
            exit[i] = a;
        }
        int cnt = 0;
        for (int i = 0; i < exit.length; i++) {
            int idx=0;
            int a = exit[i];
            if(a==0)continue;
            for(int j=0;j<i;j++){
                if(exit[j]<a)idx++;
            }
            if(idx!=a)cnt++;
        }
        System.out.println(cnt);

    }
}


