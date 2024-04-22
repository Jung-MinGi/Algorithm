import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        while (n-->0){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            map.put(s,map.getOrDefault(s,0)+i);
        }
        double a=0;
        for (String s : map.keySet()) {
            a+=map.get(s);
        }
        System.out.println((int)a);
        System.out.println(map.get("bedroom")==null?0:map.get("bedroom"));
        if(map.get("balcony")!=null){
            a-=map.get("balcony");
            a+=map.get("balcony")/2.0;
        }
        System.out.printf("%.6f",a*price);
    }
}
