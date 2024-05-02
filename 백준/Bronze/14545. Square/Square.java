import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        for(int i=2;;i++){
            list.add(list.get(list.size()-1)+((long) i *i));
            if(list.get(list.size()-1)>Integer.MAX_VALUE)break;
        }
        int n =Integer.parseInt(br.readLine());
        while(n-->0){
            int a =Integer.parseInt(br.readLine());
            System.out.println(list.get(a-1));
        }
    }
}