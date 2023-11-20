import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int answer=Integer.MAX_VALUE;
        while(st.hasMoreElements()){
            StringTokenizer tmp = new StringTokenizer(st.nextToken(), "+");
           int sum=0;
            while(tmp.hasMoreElements()){
              sum+=Integer.parseInt(tmp.nextToken());
            }
            if(answer==Integer.MAX_VALUE)answer=sum;
            else answer-=sum;

        }
        System.out.println(answer);
    }
}


