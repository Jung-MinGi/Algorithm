import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static String n, m;
    static HashSet<String> set = new HashSet<>();
    static int[] num = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = st.nextToken();
        m = st.nextToken();
        int cnt=0;
        int answer = Integer.MAX_VALUE;
        // 일단 최대한 같게 만들어야함
        for(int i=0;i<m.length();i++){
            cnt=0;
            int len = i + n.length();
            if(len<=m.length()){
                for(int j=0;j<n.length();j++){
                    if(n.charAt(j)!=m.charAt(j+i))cnt++;
                }
                answer = Math.min(cnt,answer);
            }
        }
        System.out.println(answer);
    }
}


