import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] alph = new int[26][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        soultion();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            ArrayList<String[]> list = new ArrayList<>();
            while (a-- > 0) {
                String str = br.readLine();
                int tmp = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = str.charAt(i);
                    char t = s.charAt(i);
                    int[] aaa = alph[c - 'a'];
                    int[] bbb = alph[t - 'a'];
                    tmp+=Math.abs(aaa[0]-bbb[0])+Math.abs(aaa[1]-bbb[1]);
//                    tmp += getDistance(str.charAt(i), s.charAt(i));
                }
                list.add(new String[]{str, String.valueOf(tmp)});
            }
            Collections.sort(list, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    if (o1[1].equals(o2[1])) {
                        return o1[0].compareTo(o2[0]);
                    } else return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                }
            });

            for (String[] strings : list) {
                sb.append(strings[0]).append(' ').append(strings[1]).append('\n');
            }
        }
        System.out.println(sb);
    }
    

    static void soultion() {
        alph['q' - 'a'] = new int[]{0, 0};
        alph['w' - 'a'] = new int[]{0, 1};
        alph['e' - 'a'] = new int[]{0, 2};
        alph['r' - 'a'] = new int[]{0, 3};
        alph['t' - 'a'] = new int[]{0, 4};
        alph['y' - 'a'] = new int[]{0, 5};
        alph['u' - 'a'] = new int[]{0, 6};
        alph['i' - 'a'] = new int[]{0, 7};
        alph['o' - 'a'] = new int[]{0, 8};
        alph['p' - 'a'] = new int[]{0, 9};
        alph['a' - 'a'] = new int[]{1, 0};
        alph['s' - 'a'] = new int[]{1, 1};
        alph['d' - 'a'] = new int[]{1, 2};
        alph['f' - 'a'] = new int[]{1, 3};
        alph['g' - 'a'] = new int[]{1, 4};
        alph['h' - 'a'] = new int[]{1, 5};
        alph['j' - 'a'] = new int[]{1, 6};
        alph['k' - 'a'] = new int[]{1, 7};
        alph['l' - 'a'] = new int[]{1, 8};
        alph['z' - 'a'] = new int[]{2, 0};
        alph['x' - 'a'] = new int[]{2, 1};
        alph['c' - 'a'] = new int[]{2, 2};
        alph['v' - 'a'] = new int[]{2, 3};
        alph['b' - 'a'] = new int[]{2, 4};
        alph['n' - 'a'] = new int[]{2, 5};
        alph['m' - 'a'] = new int[]{2, 6};
    }
}


