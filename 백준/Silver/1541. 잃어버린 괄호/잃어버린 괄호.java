import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int answer=0;
        int cnt=0;
        while(st.hasMoreElements()){
            StringTokenizer tmp = new StringTokenizer(st.nextToken(), "+");
            cnt++;
           int sum=0;
            while(tmp.hasMoreElements()){
              sum+=Integer.parseInt(tmp.nextToken());
            }
            if(cnt==1)answer+=sum;
            else answer-=sum;

        }
        System.out.println(answer);
    }
}


