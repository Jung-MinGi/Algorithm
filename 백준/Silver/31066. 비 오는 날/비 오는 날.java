import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 2508구글링,1487구글링
 */
public class Main {

    static int a = 0;
    static int b = 0;
    static int c = 0;
    static int d = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count=0;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            d=0;
            c=0;
            int k =Integer.parseInt(st.nextToken());
            if(b==1&&k==1&&a>1){
                System.out.println(-1);
                continue;
            }
            while(true){
                boolean flag=false;
                while(b-->0){
                    d++;
                    if(!flag)count++;
                    if(a>=k){
                        flag=true;
                        a-=k;
                        c+=k;
                    }else{
                        a=0;
                        c+=a;
                    }
                    if(a==0||b==0)break;
                }
                if(a==0)break;
                a+=1;
                b+=d;
                d=0;
                c--;
                count++;
            }
            System.out.println(count);
        }
    }
}


