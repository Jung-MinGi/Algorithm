import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] len = new int[n-1];
        for(int i=0; i<len.length; i++){
            len[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] price= new int[n];
        for(int i=0; i<price.length; i++){
            price[i]=Integer.parseInt(st.nextToken());
        }
        Long answer=0L;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0; i<len.length; i++){
                if(price[i] < minPrice){
                    minPrice=price[i];
                }
            answer = answer+(minPrice*len[i]);
        }
        System.out.println(answer);
    }
}

