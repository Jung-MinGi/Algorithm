import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while ((str = br.readLine())!=null) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c==' ')continue;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        ArrayList<String[]> list = new ArrayList<>();
        for (Character c : map.keySet()) {
            list.add(new String[]{c + "", map.get(c) + ""});
        }
        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[1].equals(o2[1])) return o1[0].compareTo(o2[0]);
                else {
                    int i = Integer.parseInt(o1[1]);
                    int a = Integer.parseInt(o2[1]);
                    return a-i;
                }
            }
        });
        int max = Integer.parseInt(list.get(0)[1]);
        for (String[] strings : list) {
            int i = Integer.parseInt(strings[1]);
            if (i == max) System.out.print(strings[0]);
            else break;
        }
    }
}
