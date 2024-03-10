import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        while(a-->0)set.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());

        while(b-->0){
            int s = Integer.parseInt(st.nextToken());
            if(set.contains(s))set.remove(s);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : set) {
            list.add(i);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(' ');
        }
        System.out.println(set.size());
        System.out.println(sb);
    }
}


