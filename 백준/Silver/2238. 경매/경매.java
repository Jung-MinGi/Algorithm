import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<String>[] list = new ArrayList[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            list[price].add(name);
        }
        ArrayList<int[]> li = new ArrayList<>();
        for(int i=1;i<=u;i++){
            if(list[i].isEmpty())continue;
            li.add(new int[]{i,list[i].size()});
        }
        Collections.sort(li, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0]<b[0]){
                    if(a[1] > b[1])return 1;
                    else return -1;
                }else{
                    if(a[1] <b[1])return -1;
                    else return 1;
                }
            }
        });
        System.out.println(list[li.get(0)[0]].get(0)+" "+li.get(0)[0]);
    }
}


