import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final String ttt = "TTT";
    private static final String tth = "TTH";
    private static final String tht = "THT";
    private static final String thh = "THH";
    private static final String htt = "HTT";
    private static final String hth = "HTH";
    private static final String hht = "HHT";
    private static final String hhh = "HHH";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
           int[] arr = new int[8];
            String s = br.readLine();
            for(int i=0;i<=s.length()-3;i++){
                String substring = s.substring(i, i + 3);
                switch (substring){
                    case ttt:
                        arr[0]++;
                        break;
                    case tth:
                        arr[1]++;
                        break;
                    case tht:
                        arr[2]++;
                        break;
                    case thh:
                        arr[3]++;
                        break;
                    case htt:
                        arr[4]++;
                        break;
                    case hth:
                        arr[5]++;
                        break;
                    case hht:
                        arr[6]++;
                        break;
                    case hhh:
                        arr[7]++;
                        break;

                }
            }
            for (int i : arr) {
                sb.append(i).append(' ');
            }sb.append('\n');
        }
        System.out.println(sb);
    }

}

