import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;//빈도
        int x = 81;//합
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    map.put(i + j + k, map.getOrDefault(i + j + k, 0) + 1);
                }
            }
        }
        for (Integer key : map.keySet()) {
            //key합
            //map.get(key)==횟수
            if(map.get(key)>cnt){
                cnt=map.get(key);
                x=key;
            } else if (map.get(key)==cnt&&key<x) {
                cnt=map.get(key);
                x=key;
            }
        }
        System.out.println(x);
    }
}
