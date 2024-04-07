import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     * 왼쪽단어의 인덱스위치가 오른쪽 단어의 열을 결정
     * 오른쪽 단어의 인덱스위치가 왼쪽단어의 행을 결정
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 0;
        int col = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        boolean flag=true;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    row = j;
                    col = i;
                    flag=false;
                    break;
                }
            }
            if(!flag)break;
        }
        char[][] arr = new char[b.length()][a.length()];
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if(i==row)arr[i][j]=a.charAt(j);
                else if(j==col)arr[i][j]=b.charAt(i);
                else arr[i][j]='.';
            }
        }
StringBuilder sb = new StringBuilder();
        for (char[] chars : arr) {
            for (char aChar : chars) {
               sb.append(aChar);
            }sb.append('\n');
        }
        System.out.println(sb);
    }
}
