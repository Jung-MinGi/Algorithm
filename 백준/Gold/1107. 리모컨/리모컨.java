import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    static int[] arr = new int[10];
    static Integer[] dp;
    static boolean[] visit = new boolean[10];
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int num = Integer.parseInt(br.readLine());
        Arrays.fill(visit,true);
        if(num!=0){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<num; i++){
                visit[Integer.parseInt(st.nextToken())]=false;
            }
        }
        int answer = Math.abs(100-Integer.parseInt(n));
        for(int i=0; i<999999; i++){
            String str = String.valueOf(i);
            int length = str.length();
            boolean isBroken = false;

            for(int j=0; j<length; j++){
                if(!visit[str.charAt(j)-48]){
                    isBroken=true;
                    break;
                }
            }
            if(!isBroken){
                int min = Math.abs(Integer.parseInt(n)-i)+length;
                answer=Math.min(min,answer);
            }
        }
        System.out.println(answer);
    }


}


