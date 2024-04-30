import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        setUp();
        int[] a = new int[8];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (map.get(c) == null) a[7]++;
            else a[map.get(c)]++;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }

    static void setUp() {
        map.put('1', 0);
        map.put('Q', 0);
        map.put('A', 0);
        map.put('Z', 0);

        map.put('2', 1);
        map.put('W', 1);
        map.put('S', 1);
        map.put('X', 1);

        map.put('3', 2);
        map.put('E', 2);
        map.put('D', 2);
        map.put('C', 2);

        map.put('4', 3);
        map.put('5', 3);
        map.put('R', 3);
        map.put('T', 3);
        map.put('F', 3);
        map.put('G', 3);
        map.put('V', 3);
        map.put('B', 3);

        map.put('6', 4);
        map.put('7', 4);
        map.put('Y', 4);
        map.put('U', 4);
        map.put('H', 4);
        map.put('J', 4);
        map.put('N', 4);
        map.put('M', 4);

        map.put('8', 5);
        map.put('I', 5);
        map.put('K', 5);
        map.put(',', 5);

        map.put('9', 6);
        map.put('O', 6);
        map.put('L', 6);
        map.put('.', 6);

    }
}

