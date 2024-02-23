import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static String[] arr;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new StringBuilder(br.readLine()).reverse().toString();
        }
        for(int i=1;i<=arr[0].length();i++){
            if(isPossible(i)){
                System.out.println(i);
                break;
            }
        }
    }
    static boolean isPossible(int idx){
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i].substring(0,idx));
        }
        return set.size()==arr.length;
    }

}
