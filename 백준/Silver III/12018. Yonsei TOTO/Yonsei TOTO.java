import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int mileage = Integer.parseInt(st.nextToken());
        ArrayList<Integer> min = new ArrayList<>();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int human = Integer.parseInt(st.nextToken());
            int cutLine = Integer.parseInt(st.nextToken());
            Integer[] tmp = new Integer[human];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = Integer.parseInt(st.nextToken());
            }
            if (human < cutLine) {
                min.add(1);
                continue;
            }
            Arrays.sort(tmp, Collections.reverseOrder());
            for (int i = 0; i < human; i++) {
                if (i == cutLine - 1) {
                    min.add(tmp[i]);
                    break;
                }
            }
        }
        Collections.sort(min);
        int sum=0;
        int idx=0;
        for (Integer i : min) {
            sum+=i;
            if(sum<=mileage){
                idx++;
            }else break;
        }
        System.out.println(idx);
    }
}