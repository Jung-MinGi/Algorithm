import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int idx=0;
        long energy=0;
        while(true){
            int index=idx;
            long tmpEnergy=Long.MAX_VALUE;
            for(int i=idx+1;i<n;i++){
                long pow = (long) Math.pow(arr[i] - arr[index], 2);
                if(pow < tmpEnergy){
                    idx=i;
                    tmpEnergy=pow;
                    if(tmpEnergy==1)break;
                }
            }
            energy+=tmpEnergy;
            if(idx==n-1){
                System.out.println(energy);
                break;
            }
        }
    }
}