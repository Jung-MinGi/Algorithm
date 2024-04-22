import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine()) != null) {
            boolean[] visit = new boolean[10];
            long n = Long.parseLong(s);
            for (int i = 1; ; i++) {
                long l = n * i;
                String a = String.valueOf(l);
                for (int j = 0; j < a.length(); j++) visit[a.charAt(j)-'0'] = true;
                boolean flag = false;
                for (boolean b : visit) {
                    if (!b) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {

                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
