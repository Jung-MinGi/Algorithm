import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static HashSet<Integer> hs = new HashSet<>();
    static int edge=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);
        hs.add(n);
        while(true){
            int num = soultion(n, p);
            if(hs.contains(num)){
                edge=num;
                break;
            }
            arrayList.add(num);
            hs.add(num);
            n=num;
        }
        int answer=0;
        for (Integer integer : arrayList) {
            if(integer == edge) break;
            answer++;
        }
        System.out.println(answer);

    }
    static int soultion(int a,int multipleNum){
        String str = String.valueOf(a);
        int nextNum=0;
        for(int i=0; i<str.length(); i++){
            int x = str.charAt(i)-'0';
            int pow = (int) Math.pow(x,multipleNum);
            nextNum+=pow;
        }
        return nextNum;
    }
}
