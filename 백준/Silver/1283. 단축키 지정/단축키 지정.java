import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static HashSet<Character> set = new HashSet<>();
    static ArrayList<ArrayList<String>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int idx = 0;
        boolean[] visit = new boolean[n];
        while (n-- > 0) {
            list.add(idx, new ArrayList<>());
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreElements()) list.get(idx).add(st.nextToken());
            idx++;
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> strings = list.get(i);
            for (int j = 0; j < strings.size(); j++) {
                String s = strings.get(j);
                String tmp = strings.get(j).toLowerCase();
                if (set.add(tmp.charAt(0))) {
                    visit[i] = true;
                    strings.remove(j);
                    strings.add(j, "[" + s.charAt(0) + "]" + s.substring(1));
                    break;
                }
            }
            if(!visit[i]){//단어의 첫글자에서 단축키 지정 못한경우
                boolean flag = false;
                for (int j = 0; j < strings.size(); j++) {
                    String s = strings.get(j);
                    String tmp = strings.get(j).toLowerCase();
                    for (int k = 1; k < s.length(); k++) {
                        if (set.add(tmp.charAt(k))) {
                            strings.remove(j);
                            strings.add(j, s.substring(0, k) + "[" + s.charAt(k) + "]" + ((k == s.length() - 1) ? "" : s.substring(k + 1)));
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;
                }
            }
        }
        for (ArrayList<String> strings : list) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}