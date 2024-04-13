import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

static String[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

       arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            if(arr[i].equals("KBS1")){
                    soultion(i,sb,"KBS1");
                    break;
            }
        }
        for (int i=0;i<n;i++) {
            if(arr[i].equals("KBS2")){
                soultion(i,sb,"KBS2");
                break;
            }
        }
        System.out.println(sb);
    }
    static void soultion(int index,StringBuilder sb,String str){
        int tmp = index;
       while(index-->0)sb.append(1);
       for(int i=tmp;i>(str.equals("KBS1")?0:1);i--){
           String s = arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=s;
           sb.append(4);
       }
    }
}
