import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] stick;
    static int[] box;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stick = new int[n];
        box = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            stick[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(stick);
        Arrays.sort(box);
        int stickIdx=0;
        int boxIdx=0;
        while(true){
            if(stick[stickIdx]<=box[boxIdx]){
                stickIdx++;
                boxIdx++;
            }else boxIdx++;
            if(boxIdx==n)break;
        }
        if(stickIdx==n) System.out.println("DA");
        else System.out.println("NE");
    }
}