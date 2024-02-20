import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            set.add(br.readLine());
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : set) {
            list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        int idx=0;
        boolean[] check = new boolean[list.size()];
        for(int i=0;i<list.size()-1;i++){
            if(check[i])continue;
            for(int j=i+1;j<list.size();j++){
                if(checked(list.get(i),list.get(j)))check[i]=true;
            }
        }
        for (boolean b : check) {
            if(!b)idx++;
        }
        System.out.println(idx);

    }
    static boolean checked(String a,String b){
//        if(a.length()==b.length())return a.equals(b);
        String substring = b.substring(0, a.length());
        return a.equals(substring);
    }
}