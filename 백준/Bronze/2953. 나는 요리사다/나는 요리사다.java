import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=0;
        int score=0;
        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp=0;
            while(st.hasMoreTokens())tmp+=Integer.parseInt(st.nextToken());
            if(tmp>score){
                num=i;
                score=tmp;
            }
        } 
        System.out.println(num+" "+score);
    }
}

