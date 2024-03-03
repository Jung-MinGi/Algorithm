import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    /**
     * 1337백준
     */
    static ArrayList<Integer> list;
    static int n = 0;
    static int min = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        while(n-->0){
            int i = Integer.parseInt(br.readLine());
            list.add(i);

        }

        Collections.sort(list);
        for (Integer i : list) {
            min=Math.min(soultion(i),min);
        }
        System.out.println(min);

    }
    static int soultion(int a){
        int left = a - 4;
        int right = a + 4;
        int leftCnt=0;
        if(left>=0){
            for(int i=left;i<=a;i++){
                if(!list.contains(i))leftCnt++;
            }
        }else leftCnt=9999;
        int rightCnt=0;
            for(int i=a;i<=right;i++){
                if(!list.contains(i))rightCnt++;
            }
        return Math.min(leftCnt,rightCnt);
    }
}


