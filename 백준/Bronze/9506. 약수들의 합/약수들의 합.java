import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        StringBuilder sb = new StringBuilder();
        while((a=Integer.parseInt(br.readLine()))!=-1){
            ArrayList<Integer> list = findNum(a);
            int sum=0;
            for (Integer i : list) {
                sum+=i;
            }
            sb.append(a);
            if(sum==a){
                sb.append(" = ");
                for (int i=0;i<list.size();i++) {
                    sb.append(list.get(i));
                    if(i!=list.size()-1) sb.append(" + ");
                }
            }else{
                sb.append(" is NOT perfect.");
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    static ArrayList<Integer> findNum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (list.contains(i)) break;
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        Collections.sort(list);

        return list;
    }

}
