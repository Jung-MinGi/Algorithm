import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static String[] arr = new String[]{"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static int n, m;
    static String[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        array = new String[m - n + 1][2];
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(i + n);
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                str.append(arr[s.charAt(j) - '0']);
            }
            array[i] = new String[]{str.toString(), s};
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        int idx=1;
        StringBuilder sb = new StringBuilder();
        for (String[] strings : array) {
           sb.append(strings[1]);
           if(idx<10){
               sb.append(' ');
           }else{
               sb.append('\n');
               idx=0;
           }
            idx++;
        }
        System.out.println(sb);
    }
}


