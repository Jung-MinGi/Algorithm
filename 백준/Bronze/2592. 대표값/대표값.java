import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 10; i < 1000; i += 10) map.put(i, 0);
        int sum=0;
        for(int i=0;i<10;i++){
            int a = Integer.parseInt(br.readLine());
            sum+=a;
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(sum/10);
        int cnt=0;
        int n=0;
        for (Integer i : map.keySet()) {
            if(cnt<map.get(i)){
                cnt=map.get(i);
                n=i;}
        }
        System.out.println(n);
    }
}
