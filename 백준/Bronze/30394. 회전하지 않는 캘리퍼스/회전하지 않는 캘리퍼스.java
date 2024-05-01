import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1)-list.get(0));
    }
}

