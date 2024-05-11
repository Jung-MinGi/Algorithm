import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())list.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        for(int i=0;i<list.size();i++){
            if(list.get(i)==x){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(0);
    }
}
