import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        StringBuilder sb = new StringBuilder();
        int hammingDistance = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int l = 0; l < s.length(); l++) {
                arr[i][l] = s.charAt(l) - 65;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int key=0;
            int value=0;
            for (int j = 0; j < n; j++) {
                map.put(arr[j][i], map.getOrDefault(arr[j][i], 0) + 1);
            }
            for (Integer integer : map.keySet()) {
                if(map.get(integer)>value||(map.get(integer)==value&&integer<key)){
                    key=integer;
                    value = map.get(key);
                }
            }
            hammingDistance += n-value;
            sb.append((char)(key+65));
            map.clear();
        }
        System.out.println(sb);
        System.out.print(hammingDistance);
    }
}


