import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int priceD = Integer.parseInt(st.nextToken());
        int priceT = Integer.parseInt(st.nextToken());
        int kcalD = Integer.parseInt(br.readLine());
        Integer[] kcal = new Integer[n];
        for(int i=0;i<n;i++){
            kcal[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(kcal,Collections.reverseOrder());
        for(int i=1;i<n;i++){
            kcal[i]+=kcal[i-1];
        }
        int answer=0;
        for(int i=0;i<n;i++){
            int p=priceD+((i+1)*priceT);
            int k =kcalD+kcal[i];
            if(answer < (int)Math.floor(k/(double)p)){
                answer = (int)Math.floor(k/(double)p);
            }
        }
        int noChoice = (int)(Math.floor(kcalD/(double)priceD));
        System.out.println(Math.max(answer,noChoice));
    }
}