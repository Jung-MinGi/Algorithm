import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int x = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            while (x-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                String c = st.nextToken();
                switch (s) {
                    case "R":
                        switch (c) {
                            case "R":
                                a++;
                                b++;
                                break;
                            case "P":
                                b++;
                                break;
                            case "S":
                                a++;
                                break;
                        }
                        break;
                    case "P":
                        switch (c) {
                            case "R":
                                a++;
                                break;
                            case "P":
                                a++;
                                b++;
                                break;
                            case "S":
                                b++;
                                break;
                        }
                        break;
                    case "S":
                        switch (c) {
                            case "R":
                                b++;
                                break;
                            case "P":
                                a++;
                                break;
                            case "S":
                                a++;
                                b++;
                                break;
                        }
                        break;
                }
            }
            if(a>b) System.out.println("Player 1");
            else if(a<b) System.out.println("Player 2");
            else System.out.println("TIE");
        }
    }
}
