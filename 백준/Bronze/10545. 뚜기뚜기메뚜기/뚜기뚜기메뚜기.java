import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static char[][] a = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int prevNum = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    if (c == a[j][k]) {
                        if (prevNum == j + 2) {
                            sb.append('#');
                        }
                        while (k-- >= 0) sb.append(j + 2);
                        prevNum = j + 2;
                        break;
                    }
                }
            }
        }
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i)=='#') System.out.print('#');
            for (int j = 0; j < array.length; j++) {
                if(sb.charAt(i)-'0'==array[j]){
                    System.out.print(j+1);
                    break;
                }
            }
        }

    }
}

