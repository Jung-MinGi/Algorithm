import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int i=3;i<r;i++){//가장자리 세로 줄
                int rowNum = (r - (i * 2)) / 2;
                int tmp =rowNum * (i - 2);
                if(tmp==b){
                    if(tmp+2>i){
                        System.out.println((rowNum+2)+" "+i);
                    }else{
                        System.out.println(i+" "+(2+rowNum));
                    }
                    return;
                }
            }
    }
}

