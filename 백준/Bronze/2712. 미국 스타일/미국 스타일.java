import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<String, Double> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map.put("kg", 2.2046);
        map.put("lb", 0.4536);
        map.put("l", 0.2642);
        map.put("g", 3.7854);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            String s = st.nextToken();
            double v = map.get(s) * a;
            System.out.printf("%.4f", v);
            if(s.equals("kg")) System.out.println(" lb");
            else if(s.equals("lb"))System.out.println(" kg");
            else if(s.equals("l")) System.out.println(" g");
            else if(s.equals("g")) System.out.println(" l");
        }
    }
}
