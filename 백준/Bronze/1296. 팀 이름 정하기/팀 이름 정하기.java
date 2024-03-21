import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = 0;
        int o = 0;
        int v = 0;
        int e = 0;
        String s = br.readLine().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'v':
                    v++;
                    break;
                case 'e':
                    e++;
                    break;
            }
        }
        ArrayList<Object[]> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String answer = null;
        while (n-- > 0) {
            int a = l;
            int b = o;
            int c = v;
            int d = e;
            String str = br.readLine().toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case 'l':
                        a++;
                        break;
                    case 'o':
                        b++;
                        break;
                    case 'v':
                        c++;
                        break;
                    case 'e':
                        d++;
                        break;
                }
            }
            int i = ((a + b) * (a + c) * (a + d) * (b + c) * (b + d) * (c + d)) % 100;
            list.add(new Object[]{i, str.toUpperCase()});
        }
        Collections.sort(list, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if (o1[0] == o2[0]) {
                    String a = (String) o1[1];
                    String b = (String) o2[1];
                    return a.compareTo(b);
                }
                return (Integer) o2[0] - (Integer) o1[0];
            }
        });
        System.out.println(list.get(0)[1]);

    }
}
