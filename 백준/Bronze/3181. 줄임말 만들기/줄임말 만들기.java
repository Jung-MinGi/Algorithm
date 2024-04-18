import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
        //단어 거르는거롤 처음 입력들어올때 검사해야됨
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken().charAt(0));
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            boolean flag = false;
            for (String s : arr) {
                if (str.equals(s)) {
                    flag = true;
                }
            }
            if (!flag) sb.append(str.charAt(0));
        }

//        char c = sb.charAt(0);
//        String x = sb.toString().replaceFirst(String.valueOf(c), "");
//        if(x.inde)
//        String x = sb.toString();
//        String c="";
//        for (String s : arr) {
//            if(x.contains(s)&&x.indexOf(s)==0){
//                x=x.substring(s.length());
//                c=s;
//                break;
//            }
//        }
//        for (String s : arr) {
//            if (x.contains(s)) x = x.replaceFirst(s, "");
//        }
//        System.out.println((c+x).toUpperCase());
        System.out.println(sb.toString().toUpperCase());
    }

}
