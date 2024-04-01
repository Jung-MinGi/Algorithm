import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++)sb.append(" ");
            for(int j=0;j<n-i;j++)sb.append("*");
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

