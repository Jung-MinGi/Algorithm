import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        String s = Integer.toBinaryString(1 << map.get(c));
        long i = (long) ((map.get(a) * 10) + map.get(b));
        long l = i * Long.parseLong(s);
        System.out.println(l);
    }
}


