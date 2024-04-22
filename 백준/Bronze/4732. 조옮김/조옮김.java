import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static String[] a = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String string = br.readLine();
            if(string.equals("***"))break;
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(string);
            if (n > 0) {
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    if (s.equals("***")) return;
                    String str = getIndex(s);
                    for (int i = 0; i < a.length; i++) {
                        if (str.equals(a[i])) {
                            System.out.print(a[(i + 1) % a.length] + " ");
                            break;
                        }
                    }
                }
            } else {
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    if (s.equals("***")) return;
                    String str = getIndex(s);
                    for (int i = 0; i < a.length; i++) {
                        if (str.equals(a[i])) {
                            System.out.print(a[(i - 1 + a.length) % a.length] + " ");
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }

    }

    static String getIndex(String s) {
        if (s.length() == 1) {
            for (int i = 0; i < a.length; i++) {
                if (s.equals(a[i])) return a[i];
            }
        } else {
            if (s.charAt(1) == 'b') {
                for (int i = 0; i < a.length; i++) {
                    if (String.valueOf(s.charAt(0)).equals(a[i])) {
                        return a[(i - 1 + a.length) % a.length];
                    }
                }
            } else {
                for (int i = 0; i < a.length; i++) {
                    if (String.valueOf(s.charAt(0)).equals(a[i])) {
                        return a[(i + 1) % a.length];
                    }
                }
            }
        }
        return null;
    }
}
