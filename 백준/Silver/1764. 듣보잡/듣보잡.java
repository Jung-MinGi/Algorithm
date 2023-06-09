import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n+m; i++){
            String s = br.readLine();
            if(!hashSet.add(s)){
               list.add(s);
            }
        }
        String[] arr = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        sb.append(arr.length).append('\n');
        for (String s : arr) {
            sb.append(s).append('\n');

        }
        System.out.println(sb);
    }
}