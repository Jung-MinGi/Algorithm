import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int[] cents = new int[]{25,10,5,1};
    static int[] requiredCents = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       calcutor(Integer.parseInt(br.readLine()));
    }

    static void calcutor(int num) {
        int tmp = 100-num;
        int idx=0;
        while(true){
            requiredCents[idx]=tmp/cents[idx];
            tmp-=requiredCents[idx]*cents[idx];
            idx++;
            if(idx==4)break;
        }
        for (int requiredCent : requiredCents) {
            System.out.print(requiredCent+" ");
        }
    }
}