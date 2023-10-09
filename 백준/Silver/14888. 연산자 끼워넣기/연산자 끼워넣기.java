import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static HashSet<String> set = new HashSet<>();
    static String[] dp;
    static int[] num;
    static ArrayList<String> list = new ArrayList<>();
    static boolean[] check;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        num = new int[n];
        dp = new String[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            int cnt = Integer.parseInt(st.nextToken());
            while (cnt-- > 0) {
                if (i == 0) list.add("+");
                else if (i == 1) list.add("-");
                else if (i == 2) list.add("*");
                else list.add("/");
            }
        }
        check = new boolean[list.size()];
        backTracking(0);
        System.out.println(max);
        System.out.println(min);

    }

    static void backTracking(int depth) {
        if (depth == n - 1) {
            StringBuilder sb = new StringBuilder();
            for (String s : dp) {
                sb.append(s);
            }
            if (!set.contains(sb.toString())) {
                set.add(sb.toString());
                String str = sb.toString();
                int[] ints = Arrays.copyOf(num, num.length);
                for (int i = 0; i < n - 1; i++) {
                    char c = str.charAt(i);
                    if (c == '+') {
                        ints[i+1] = ints[i] + ints[i + 1];

                    }else if(c=='-'){
                        ints[i+1] = ints[i] - ints[i + 1];
                    }else if(c=='*'){
                        ints[i+1] = ints[i]* ints[i + 1];
                    }else{
                        if(ints[i]<0){
                            ints[i+1]=-(Math.abs(ints[i])/ints[i+1]);
                        }else ints[i+1]=ints[i]/ints[i+1];
                    }
                }
                max = Math.max(max,ints[ints.length-1]);
                min = Math.min(min,ints[ints.length-1]);

            }
            return;
        }
            for (int i = 0; i < list.size(); i++) {
                if (!check[i]) {
                    dp[depth] = list.get(i);
                    check[i] = true;
                    backTracking(depth + 1);
                    check[i] = false;
                }
            }
        }
    }
