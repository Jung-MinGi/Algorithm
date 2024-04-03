import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static Integer[] arr = new Integer[1001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int a = Integer.parseInt(br.readLine());
            if(arr[a]!=null){
                stringBuilder.append(arr[a]).append('\n');
                continue;
            }
            int zero=0;
            for(int j=2;j<=a;j++){
                String s = soultion(a, j);
                int tmp=0;
                for(int k=s.length()-1;k>=0;k--){
                    if(s.charAt(k)=='0')tmp++;
                    else break;
                }
                zero+=tmp;
            }
            arr[a]=zero;
           stringBuilder.append(zero).append('\n');
        }
        System.out.println(stringBuilder);

    }
    static String soultion(int n ,int b){
        StringBuilder sb = new StringBuilder();
        while(true){
            sb.append(n%b);
            if(n<b)break;
            n=n/b;
        }
        return sb.reverse().toString();
    }
}


