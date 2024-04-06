import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            String a = br.readLine();
            String b = br.readLine();
            int dis=0;
            for(int j=0;j<a.length();j++)if(a.charAt(j)!=b.charAt(j))dis++;
           sb.append("Hamming distance is ").append(dis).append(".").append('\n');
        }
        System.out.println(sb);
    }

}

