import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String[] arr;
    static ArrayList<String[]> priority = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        arr = new String[n];
        int wordLen = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            wordLen += arr[i].length();
        }
        getPriority();
        int stick = len - wordLen;
        int idx = 0;
        while (stick-- > 0) {
            String[] strings = priority.get(idx);
            int i = Integer.parseInt(strings[1]);
            String s = arr[i];
            arr[i] = "_" + s;
            idx++;
            if (idx == n - 1) idx = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        System.out.println(sb);

    }

    static void getPriority() {
        for (int i = 1; i < arr.length; i++) {
            priority.add(new String[]{arr[i], i + ""});
        }
        Collections.sort(priority, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                char c = a[0].charAt(0);
                char v = b[0].charAt(0);
                if(c-'a'>=0&&c-'a'<=25&&v-'a'>=0&&v-'a'<=25){
                    //둘다 소문자
                    return a[1].compareTo(b[1]);
                }else if(c-'a'>=0&&c-'a'<=25) return -1;
                else if(v-'a'>=0&&v-'a'<=25) return 1;
                else return b[1].compareTo(a[1]);
            }
        });

    }
}


