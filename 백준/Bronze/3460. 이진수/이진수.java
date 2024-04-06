import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String s = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            for(int j=s.length()-1;j>=0;j--){
                if(s.charAt(j)=='1') System.out.print((s.length()-j-1)+" ");
            }
            System.out.println();
        }
    }

}

