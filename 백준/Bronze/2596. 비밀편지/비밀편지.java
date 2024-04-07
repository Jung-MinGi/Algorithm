import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[]{"000000"
                , "001111"
                , "010011"
                , "011100"
                , "100110"
                , "101001"
                , "110101"
                , "111010"};
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for (int i = 0; i + 6 <= s.length(); i += 6) {
            String substring = s.substring(i, i + 6);
            soultion(sb, substring, arr);
            char c = sb.charAt(sb.length() - 1);
            if(c=='A'||c=='B'||c=='C'||c=='D'||c=='E'||c=='F'||c=='G'||c=='H'){
                continue;
            }else{
                System.out.println(sb.length());
                return;
            }
        }
        System.out.println(sb);
    }

    static void soultion(StringBuilder sb, String str, String[] arr) {
        int gap = 7;
        int a = -1;
        for (int k = 0; k < arr.length; k++) {

            int tmp = 0;
            for (int i = 0; i < 6; i++) {
                if (arr[k].charAt(i) != str.charAt(i)) tmp++;
            }
            if (gap > tmp) {
                gap = tmp;
                a = k;
            }
        }
        if(gap>=2)a=-1;
        sb.append((char) (a + 65));
    }
}
